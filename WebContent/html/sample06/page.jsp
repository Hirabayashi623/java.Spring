<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="h" %>

<h:html>
<head>
	<meta http-equiv="Content-Type" content="text/html" charset="utf-8" />
	<title>Sample06</title>
</head>
<body>
	<h:form method="POST" action="/action06">
		<h:text property="text" size="20" />
		<h:submit />
	</h:form>
</body>
</h:html>