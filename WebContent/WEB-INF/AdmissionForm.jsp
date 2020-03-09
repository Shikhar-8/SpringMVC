<html>
<body>
	<h1> STUDENT FORM</h1> <%--from StudentAdmissionController we will come here to get input. Hence this is our input page --%>

	<form action="/SpringMVC/submitAdmissionForm.html" method="post">
		<table>
		<tr>
			<td>Student's Id : </td><td>        <input type="text" name="studentId" /></td>
		</tr>	
		
		<tr>
			<td>Student's Name : </td><td>        <input type="text" name="studentName" /></td>
		</tr>
		
		<tr>
			<td>Student's Hobby : </td><td>       <input type="text" name="studentHobby" /></td>
		</tr>
	
	   	<tr>
			<td>Student's Mobile : </td><td>      <input type="text" name="studentMobile" /></td>
		</tr>
		
		<tr>
			<td>Student's Address : </td><td>     	   <input type="text" name="studentAddress" /></td>
		</tr>
		
		<tr>
		    <td><input type="submit" value="Submit " /></td>
		</tr>
		
		</table>

	 </form>
 
</body>
</html>

