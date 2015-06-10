<

<%@ include file="/WEB-INF/template/include.jsp"%>
<%@ include file="/WEB-INF/template/header.jsp"%>
<%@ include file="includes/js_css.jsp" %>

<link type="text/css" rel="stylesheet"  href="${pageContext.request.contextPath}/moduleResources/blooddonationmanager/styles/common.css" />
<openmrs:require privilege="All Blood Bank" otherwise="/login.htm" redirect="/module/blooddonationmanager/main.form" />

<div style="border-bottom: 1px solid black;">
    <ul id="menu">
        <li class="first">
            <a href="main.form" style="font-size:large; font-weight:bold; text-decoration:none;">Blood Bank System</a>
        </li>

        <openmrs:hasPrivilege privilege="Edit Encounters">
            <li <c:if test='<%= request.getRequestURI().contains("queue") %>'>class="active"</c:if>>
                <a href="queue.form">Queue</a>
            </li>
        </openmrs:hasPrivilege>

        <openmrs:hasPrivilege privilege="Edit Encounters">
            <li <c:if test='<%= request.getRequestURI().contains("addOrUpdate") %>'>class="active"</c:if>>
                <a href="addOrUpdate.form">Find/Add Donor</a>
            </li>
        </openmrs:hasPrivilege>

        <openmrs:hasPrivilege privilege="Edit Encounters">
            <li <c:if test='<%= request.getRequestURI().contains("viewEditTests") %>'>class="active"</c:if>>
                <a href="viewEditTests.form">View Blood Test Lab</a>
            </li>
        </openmrs:hasPrivilege>

        <openmrs:hasPrivilege privilege="Edit Encounters">
            <li <c:if test='<%= request.getRequestURI().contains("viewStock") %>'>class="active"</c:if>>
                <a href="viewStock.form">View Blood Bank Stock</a>
            </li>
        </openmrs:hasPrivilege>
<<<<<<< HEAD
=======
<<<<<<< HEAD

        <openmrs:hasPrivilege privilege="Edit Encounters">
            <li <c:if test='<%= request.getRequestURI().contains("questionnare") %>'>class="active"</c:if>>
                <a href="questionnare.form">Donor Questionnare</a>
            </li>
        </openmrs:hasPrivilege>
=======
>>>>>>> de9d922969fa2964879722c4ba209f57d8f110c9
>>>>>>> a87876b4c2dc350442bec7fc4eb7a34107f1bf36
    </ul>
</div>