<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>WELCOME</title>
</head>
<body>
	${message }
	<form action="empreg" method="post" name="register">
		<table align="center" width=40% width="100%" cellspacing="2"
			cellpadding="2" border="5">
			<tr>
				<td colspan="2" align="center"><b>Employee Registration
						Form.</b></td>

			</tr>
			<tr>
				<td align="left" valign="top" width="41%">Employee Name<span
					style="color: red">*</span></td>

				<td width="57%"><input type="text" value="" name="ename"
					size="24"></td>
			</tr>
			<tr>
				<td align="left" valign="top" width="41%">Employee Email-Id<span
					style="color: red">*</span></td>
				<td width="57%"><input type="text" value="" name="eemail"></td>
			</tr>

               <tr>
				<td align="left" valign="top" width="41%">Password</td>

				<td width="57%"><input type="password" value="" name="password"></td>
			</tr>
			<tr>
				<td align="left" valign="top" width="41%">Confirm Password</td>

				<td width="57%"><input type="password" value="" name="cpassword"></td>
			</tr>
			

			<tr>
				<td align="left" valign="top" width="41%">Designation</td>
				<td width="57%"><select name="designation">
						<option value="Default">Default</option>
						<option value="Systems Engineer">Systems Engineer</option>
						<option value="Senior Systems Engineer">Senior Systems
							Engineer</option>
						<option value="Technology Analyst">Technology Analyst</option>
						<option value="Technology Lead">Technology Lead</option>
						<option value="Project Manager">Project Manager</option>

				</select>
				<tr>

				<td align="left" valign="top" width="41%">Contact Number</td>
				<td width="57%"><input type="text" name="contactnumber"
					size="10"></td>
			</tr>
				</td>
			</tr>
			
			<tr>
				<td colspan="2">
					<p align="center">
						<input type="submit" value=" Register" name="B4">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						
				</td>
			</tr>


		</table>
	</form>
</body>
</html>