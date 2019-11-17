<%@ page import="web.FolderService" %>
<%@ page import="java.io.File" %>
<html>
<body>
<h2>List of files</h2>
<%=FolderService.getFolders(FolderService.getPath())%>

</body>
</html>
