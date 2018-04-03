<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="b" %>

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html" charset="utf-8" />
	<title>Sample06</title>
</head>
<body>
	<b:define id="msg" name="message" scope="request" type="java.lang.String" />
	you write: <b:write name="msg" />
</body>
</html>