<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Example</title>
   
     <script type="text/javascript">
     function validateForm() {
         var eemail = document.registration.eemail.value;
         var password = document.registration.password.value;
         var eemail = "eemail"; 
         var password = "password";
         if ((eemail == eemail) && (password == password)) {
             
             return true;
         }
         else {
             alert ("Login was unsuccessful, please check your email and password");
             return false;
         }
       }
      </script>
     </head>
    <body>
        <form method="post" action="login" name="registration">
        
            <center>
            <table border="1" width="30%" cellpadding="3">
                <thead>
                    <tr>
                        <th colspan="2">Login Here</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Email-Id</td>
                        <td><input type="text" name="eemail" /></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="password"  /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Login" onSubmit="validateForm();"/></td>
                        
                    </tr>
                    <tr>
                        <td colspan="2">Yet Not Registered!! <a href="gotoRegister">Register Here</a></td>
                    </tr>
                </tbody>
            </table>
            </center>
        </form>
        ${message }
    </body>
</html>