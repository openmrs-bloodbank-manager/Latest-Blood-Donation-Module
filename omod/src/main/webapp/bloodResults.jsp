<%@ include file="mainMenu.jsp"%>
<%@ include file="includes/js_css.jsp" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="foxtrot" content="">

    <title>Blood Bank Manager</title>

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="../../assets/js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>

<div class="container">
<div class="table-responsive" style="width:80%; margin-left:10%; margin-right:10%;">
    <li class="list-group-item list-group-item-warning">
    <form>
        <h2 class="sub-header">Blood Results</h2>
        <div class="form-group" style="width:60%; margin-left: 10%; margin-right: 10%;">
                <label for="donorId">Donor Identification Number</label>
                <input type="text" class="form-control" id="donorId" placeholder="Donor Id">
                <label for="donorName">Donor Name</label>
                <input type="text" class="form-control" id="donorName" placeholder="Jane Kiriamiti">
                <label for="bloodType">Blood Type</label>
                <input type="text" class="form-control" id="bloodType" placeholder="">
                <label for="rhesusFactor">Rhesus Factor</label>
                <input type="text" class="form-control" id="rhesusFactor" placeholder="">
                <label for="serumTest">Serum Result</label>
                <input type="text" class="form-control" id="serumTest" placeholder="">
            <button type="submit" class="btn btn-primary">Add or Update</button>
        </div>
            <table class="table table-hover">
                <caption style="text-align: center;"><h2>Donor Blood Results</h2></caption>
                <thead>
                <tr>
                    <th style="width:auto;">Donor Id</th>
                    <th style="width:auto;">Donor Name</th>
                    <th style="width:auto;">Blood Type</th>
                    <th style="width:auto;">Rhesus Factor</th>
                    <th style="width:auto;">Haemoglobin Count</th>
                    <th style="width:auto;">Blood Pressure</th>
                    <th></th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td>
                        <button type="submit" class="btn btn-primary">Edit</button>
                        <button type="submit" class="btn btn-primary">Delete</button>
                    </td>
                </tr>
                </tbody>
            </table>
        </li>

    </form>

</div>
</div>
<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="../../dist/js/bootstrap.min.js"></script>
<!-- Just to make our placeholder images work. Don't actually copy the next line! -->
<script src="../../assets/js/vendor/holder.js"></script>
<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>