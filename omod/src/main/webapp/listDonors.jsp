<div class="panel-body">
    <div class="table-responsive">
        <div id="dt_example" class="table-responsive example_alt_pagination clearfix">
            <table class="table table-condensed table-striped table-hover table-bordered pull-left" id="data-table">
                <thead>
                <tr>

                    <th style="width:10%">Name(Generic)</th>
                    <th style="width:10%">Brand Name</th>
                    <th style="width:10%">Price of drug</th>
                    <th style="width:10%">Units in Stock</th>
                    <%--<th style="width:10%">Units dispensed</th>--%>
                    <%--<th style="width:10%">Last Batch</th>--%>
                    <th style="width:10%">Edit drug details</th>
                    <th style="width:10%">Manage Stock</th>

                </tr>
                </thead>
                <tbody>

                <!--private Integer id;
                    private String brandName;
                    private String genericName;
                    private String description;
                    private int unitsInStock;
                    private float pricePerUnit; -->
                <c:forEach var="drug" items="${drugList}" varStatus="status">
                <tr class="gradeC">
                    <td>
                            ${drug.genericName}
                    </td>
                    <td>${drug.brandName}</td>
                    <td>${drug.pricePerUnit}</td>
                    <td>${drug.unitsInStock}</td>

                    <td>
                        <button type="button" data-toggle="modal" data-target="#editDrug_${drug.id}" class="btn btn-success"><i
                                class="fa fa-edit"></i> Edit
                        </button>
                        <!-- Modal -->
                        <div class="modal fade" id="editDrug_${drug.id}" tabindex="-1" role="dialog"
                             aria-labelledby="myModalLabel5" aria-hidden="true">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <button type="button" class="close" data-dismiss="modal"
                                                aria-hidden="true">&times;</button>
                                        <h4 class="modal-title text-info" id="myModalLabel1">Edit Drug(${drug.brandName})
                                            Details</h4>
                                    </div>
                                    <div class="modal-body">


                                        <form action="<c:url value='/module/pharmacy/editDrug.form' />" method="get">
