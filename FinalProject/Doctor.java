package FinalProject;

import java.util.Scanner;

public class Doctor{
    
     String Username;
         String Password;
      
		public void loginDoctor() {
             int x=0;
             do {                
             Scanner input1 = new Scanner(System.in); 
             System.out.print("\n\nEnter Username : ");
             String username = input1.next();

             Scanner input2 = new Scanner(System.in);
             System.out.print("Enter Password : ");
             String password = input2.next();
             x=1;
                 if(x==1){
                      Username = "Admin";
                      Password = "123";
              
	       if (username.equals(Username) && password.equals(Password)) {
                  System.out.println("\nAccess Granted! Welcome!"); 
                 break;
             }
                 
               else if (username.equals(Username)) {
                 System.out.println("\nInvalid Password!");
                 System.out.print("\n-------Enter Password again-------");
                
             } 
               else if (password.equals(Password)) {
                 System.out.println("\nInvalid Username!");
                 System.out.print("\n-------Enter Username again-------");
             
               } 
               else {
                 System.out.println("\nInvalid Username & Password!");
                 System.out.print("\n-------Enter Username & Password again--------");
         
               }
			}
                 
             } while(x==1);
             
         }

    
}

