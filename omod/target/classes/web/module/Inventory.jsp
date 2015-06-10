<%@ include file="mainMenu.jsp"%>
<%@ include file="includes/js_css.jsp" %>

<!DOCTYPE html>
< lang="en">
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

<>

<div class="boxHeader" style="padding-right: 10%; padding-left: 10%;">
<div class="container">
    <div class="table-responsive" style="width:80%; margin-left:10%; margin-right:10%;">
        <form>
            <div class="form-group" style="width:auto;">
                <ul class="list-group" class="input-group">

                    <li class="list-group-item list-group-item-warning">
                        <table class="table table-hover">
                            <caption style="text-align: center;"><h2>Blood Bank Inventory</h2></caption>
                            <thead>
                            <tr>
                                <th>Blood Type</th>
                                <th>Quantity</th>
                                <th></th>
                                <th></th>

                            </tr>
                            </thead>
                            <tbody>
                                <td>O+</td>
                                <td>203 pints</td>
                            <td>
                                <button type="submit" class="btn btn-primary">Edit</button>&nbsp;&nbsp;&nbsp;&nbsp;
                                <button type="submit" class="btn btn-primary">Delete</button>
                            </td>

                            </tr>
                            <tr>
                                <td>O-</td>
                                <td>748 pints</td>
                                <td>
                                    <button type="submit" class="btn btn-primary">Edit</button>&nbsp;&nbsp;&nbsp;&nbsp;
                                    <button type="submit" class="btn btn-primary">Delete</button>
                                </td>

                            </tr>
                            <tr>
                                <td>A+</td>
                                <td>123 pints</td>
                                <td>
                                    <button type="submit" class="btn btn-primary">Edit</button>&nbsp;&nbsp;&nbsp;&nbsp;
                                    <button type="submit" class="btn btn-primary">Delete</button>
                                </td>

                            </tr>

                            <tr>
                                <td>A-</td>
                                <td>23 pints</td>
                                <td>
                                    <button type="submit" class="btn btn-primary">Edit</button>&nbsp;&nbsp;&nbsp;&nbsp;
                                    <button type="submit" class="btn btn-primary">Delete</button>
                                </td>

                            </tr>
                            <tr>
                                <td>B+</td>
                                <td>48 pints</td>
                                <td>
                                    <button type="submit" class="btn btn-primary">Edit</button>&nbsp;&nbsp;&nbsp;&nbsp;
                                    <button type="submit" class="btn btn-primary">Delete</button>
                                </td>

                            </tr>
                            <tr>
                                <td>B-</td>
                                <td>23 pints</td>
                                <td>
                                    <button type="submit" class="btn btn-primary">Edit</button>&nbsp;&nbsp;&nbsp;&nbsp;
                                    <button type="submit" class="btn btn-primary">Delete</button>
                                </td>

                            </tr>
                            </tbody>
                        </table>
                    </li>
                </ul>
            </div>
        </form>
    </div>
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

