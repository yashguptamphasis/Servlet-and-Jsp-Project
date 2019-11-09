<html>
<body>
<h2>Hello World!</h2>

<form action="register" method="post">  
  	<h1>REGISTER</h1>
  	<table>
  	<tr>
		<td>Name: </td> <td> <input type="text" name="name"/></td>  
	</tr>
	<tr>	
		<td>Email Id: </td>  <td> <input type="text" name="email"/></td> 
 	</tr>
	<tr>	
		<td>Password: </td>  <td> <input type="password" name="pass"/></td>  
	</tr>
	<tr>
		<td>	
		Country:  
		<select name="country">  
			<option>India</option>  
			<option>Pakistan</option>  
			<option>other</option>  
		</select>
		</td>  
  	</tr>
				
	<tr>			  
		<td><input type="submit" value="register"/></td>  
  	</tr>

  	</table>
	</form>
	<form action="display">
	<tr>			  
		<td><input type="submit" value="Show"/></td>  
  	</tr>
	</form>
</body>
</html>
