<%-- This is my View File--%> 
<html>
<body>
 
	<h1>Spring MVC Application  </h1>
 
	

    <h2>Details submitted  </h2>
	<table>
			<tr>
			<td>Student Id :</td>
			<td>${student1.studentId}</td>
			</tr>
			
		<tr>
			<td>Student Name :</td>
			<td>${student1.studentName}</td>
		</tr>
		<tr>
			<td>Student Hobby :</td>
			<td>${student1.studentHobby}</td>
		</tr>
		<tr>
			<td>Student Mobile :</td>
			<td>${student1.studentMobile}</td>
		</tr>

		<tr>
			<td>Student DOB :</td>
			<td>${student1.studentAddress}</td>
		</tr>
		

	</table>
 
</body>
</html>