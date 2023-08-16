<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>

<html:html>
<head>
<title>Sample List Display</title>
</head>
<body>
	<h2>Sample List</h2>

		<table>
			<logic:iterate id="sampleForm2" name="sampleForm"
				property="sampleList">
				<tr>
					<td><bean:write name="sampleForm2" property="name" /></td>
					<td><bean:write name="sampleForm2" property="age" /></td>
				</tr>
			</logic:iterate>
		</table>
</body>
</html:html>
