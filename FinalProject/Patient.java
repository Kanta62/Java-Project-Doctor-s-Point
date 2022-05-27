package FinalProject;

import java.io.File;
import java.util.Scanner;

public class Patient {
    
    
     private String Name;
        private String MailID; 
        private String gender;
        private String Diseases;
        private String BloodGroup;
        private int age;
        private int P_num;
        
        Scanner sc = new Scanner(System.in);
        
        public void setName(String name) {
        	this.Name = name; 
        } public String getName() {
        	return this.Name;
        }
        public void setMailID(String MailID) {
        	this.MailID = MailID;
         } public String getMailID() {
        	 return this.MailID;
         } 
         public void setgender(String gender) {
        	 this.gender = gender;
         } public String getgender() {
			return this.gender;	 
         }   
         public void setDiseases(String Diseases) {
        	 this.Diseases=Diseases;
          } public String getDiseases() {
 			 return this.Diseases;	 
          } 
          public void setBloodGroup(String BloodGroup) {
        	  this.BloodGroup=BloodGroup;
           } public String getBloodGroup() {
  			return this.BloodGroup;	 
           } 
         public void setage(int age) {
             this.age=age;
         } public int getage() {
        	 return this.age;
         }
         public void setP_num(int Pnum) {
        	 this.P_num=Pnum;
         } public int getP_num() {
        	 return this.P_num;
         }
        public void displayLoginPatient() {
        	
        	 Scanner sc = new Scanner(System.in);
                 Scanner sc1 = new Scanner(System.in);
        	 
        	 System.out.print("Enter your Name      : ");
        	 setName(sc.next());
        	 
        	 System.out.print("Enter your Mail Address : ");
        	 setMailID(sc1.next());
        	
        	 System.out.print("Enter your gender (Male/Female) : ");
        	 setgender(sc.next());
    		
    		 System.out.print("Enter your Type of Sickness : ");
    		 setDiseases(sc.next());
    	    
    		System.out.print("Enter your Blood Group : ");
    		setBloodGroup(sc1.next());
    		
    		System.out.print("Enter your Age       : ");
    		setage(sc.nextInt());
    		
    		System.out.print("Enter your Phone Number  : ");
    		setP_num(sc.nextInt());

            System.out.println("\nThank you, Welcome to doctor's point!");
         }
        public void PatientInfoDrA() {
        	try {
                 File myObj = new File("Dr.A.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                String s=myReader.nextLine();
                String Name=myReader.nextLine();
                System.out.println("\nName: "+Name);
                String MailID=myReader.nextLine();
                System.out.println("Mail id: "+MailID);
                String gender=myReader.nextLine();
                System.out.println("Gender: "+gender);
                String Diseases=myReader.nextLine();
                System.out.println("Sickness:" +Diseases);
                String BloodGroup=myReader.nextLine();
                System.out.println("BloodGroup: "+BloodGroup);
                int age=myReader.nextInt();
                System.out.println("Age:" +age);
                int P_num=myReader.nextInt();
                System.out.println("Phone Number: "+P_num);
                 }
                 myReader.close();
                 }catch (Exception e) {
                 System.out.println("\nNo Patient" +e);                
                }
        }
        public void PatientInfoDrB() {
        	try {
                 File myObj = new File("Dr.B.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                String s=myReader.nextLine();
                String Name=myReader.nextLine();
                System.out.println("\nName: "+Name);
                String MailID=myReader.nextLine();
                System.out.println("Mail id: "+MailID);
                String gender=myReader.nextLine();
                System.out.println("Gender: "+gender);
                String Diseases=myReader.nextLine();
                System.out.println("Sickness:" +Diseases);
                String BloodGroup=myReader.nextLine();
                System.out.println("BloodGroup: "+BloodGroup);
                int age=myReader.nextInt();
                System.out.println("Age:" +age);
                int P_num=myReader.nextInt();
                System.out.println("Phone Number: "+P_num);
                 }
                 myReader.close();
                 } catch (Exception e) {
                 System.out.println("\nNo Patient" +e);
                
                }
        }
        public void PatientInfoDrC() {
        	try {
                 File myObj = new File("Dr.C.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                String s=myReader.nextLine();
                String Name=myReader.nextLine();
                System.out.println("\nName: "+Name);
                String MailID=myReader.nextLine();
                System.out.println("Mail id: "+MailID);
                String gender=myReader.nextLine();
                System.out.println("Gender: "+gender);
                String Diseases=myReader.nextLine();
                System.out.println("Sickness:" +Diseases);
                String BloodGroup=myReader.nextLine();
                System.out.println("BloodGroup: "+BloodGroup);
                int age=myReader.nextInt();
                System.out.println("Age:" +age);
                int P_num=myReader.nextInt();
                System.out.println("Phone Number: "+P_num);
                 }
                 myReader.close();
                 } catch (Exception e) {
                 System.out.println("\nNo Patient" +e); 
                
                }
        }
        
                public void PatientInfoDrD() {
        	try {
                 File myObj = new File("Dr.D.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                String s=myReader.nextLine();
                String Name=myReader.nextLine();
                System.out.println("\nName: "+Name);
                String MailID=myReader.nextLine();
                System.out.println("Mail id: "+MailID);
                String gender=myReader.nextLine();
                System.out.println("Gender: "+gender);
                String Diseases=myReader.nextLine();
                System.out.println("Sickness:" +Diseases);
                String BloodGroup=myReader.nextLine();
                System.out.println("BloodGroup: "+BloodGroup);
                int age=myReader.nextInt();
                System.out.println("Age:" +age);
                int P_num=myReader.nextInt();
                System.out.println("Phone Number: "+P_num);
                 }
                 myReader.close();
                 } catch (Exception e) {
                 System.out.println("\nNo Patient" +e); 
                 
                }
        }

                public void PatientInfoDrE() {
        	try {
                 File myObj = new File("Dr.E.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                String s=myReader.nextLine();
                String Name=myReader.nextLine();
                System.out.println("\nName: "+Name);
                String MailID=myReader.nextLine();
                System.out.println("Mail id: "+MailID);
                String gender=myReader.nextLine();
                System.out.println("Gender: "+gender);
                String Diseases=myReader.nextLine();
                System.out.println("Sickness:" +Diseases);
                String BloodGroup=myReader.nextLine();
                System.out.println("BloodGroup: "+BloodGroup);
                int age=myReader.nextInt();
                System.out.println("Age:" +age);
                int P_num=myReader.nextInt();
                System.out.println("Phone Number: "+P_num);
                 }
                 myReader.close();
                 } catch (Exception e) {
                 System.out.println("\nNo Patient" +e); 
                }
        }
                public void PatientInfoDrF() {
        	try {
                 File myObj = new File("Dr.F.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                String s=myReader.nextLine();
                String Name=myReader.nextLine();
                System.out.println("\nName: "+Name);
                String MailID=myReader.nextLine();
                System.out.println("Mail id: "+MailID);
                String gender=myReader.nextLine();
                System.out.println("Gender: "+gender);
                String Diseases=myReader.nextLine();
                System.out.println("Sickness:" +Diseases);
                String BloodGroup=myReader.nextLine();
                System.out.println("BloodGroup: "+BloodGroup);
                int age=myReader.nextInt();
                System.out.println("Age:" +age);
                int P_num=myReader.nextInt();
                System.out.println("Phone Number: "+P_num);
                 }
                 myReader.close();
                 } catch (Exception e) {
                System.out.println("\nNo Patient" +e); 
                }
        }
               public void PatientInfoDrG() {
        	try {
                 File myObj = new File("Dr.G.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                String s=myReader.nextLine();
                String Name=myReader.nextLine();
                System.out.println("\nName: "+Name);
                String MailID=myReader.nextLine();
                System.out.println("Mail id: "+MailID);
                String gender=myReader.nextLine();
                System.out.println("Gender: "+gender);
                String Diseases=myReader.nextLine();
                System.out.println("Sickness:" +Diseases);
                String BloodGroup=myReader.nextLine();
                System.out.println("BloodGroup: "+BloodGroup);
                int age=myReader.nextInt();
                System.out.println("Age:" +age);
                int P_num=myReader.nextInt();
                System.out.println("Phone Number: "+P_num);
                 }
                 myReader.close();
                 } catch (Exception e) {
                 System.out.println("\nNo Patient" +e); 
                }
        }
                public void PatientInfoDrH() {
        	try {
                 File myObj = new File("Dr.H.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                String s=myReader.nextLine();
                String Name=myReader.nextLine();
                System.out.println("\nName: "+Name);
                String MailID=myReader.nextLine();
                System.out.println("Mail id: "+MailID);
                String gender=myReader.nextLine();
                System.out.println("Gender: "+gender);
                String Diseases=myReader.nextLine();
                System.out.println("Sickness:" +Diseases);
                String BloodGroup=myReader.nextLine();
                System.out.println("BloodGroup: "+BloodGroup);
                int age=myReader.nextInt();
                System.out.println("Age:" +age);
                int P_num=myReader.nextInt();
                System.out.println("Phone Number: "+P_num);
                 }
                 myReader.close();
                 } catch (Exception e) {
                 System.out.println("\nNo Patient" +e); 
                }
        }
                public void PatientInfoDrI() {
        	try {
                 File myObj = new File("Dr.I.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                String s=myReader.nextLine();
                String Name=myReader.nextLine();
                System.out.println("\nName: "+Name);
                String MailID=myReader.nextLine();
                System.out.println("Mail id: "+MailID);
                String gender=myReader.nextLine();
                System.out.println("Gender: "+gender);
                String Diseases=myReader.nextLine();
                System.out.println("Sickness:" +Diseases);
                String BloodGroup=myReader.nextLine();
                System.out.println("BloodGroup: "+BloodGroup);
                int age=myReader.nextInt();
                System.out.println("Age:" +age);
                int P_num=myReader.nextInt();
                System.out.println("Phone Number: "+P_num);
                 }
                 myReader.close();
                 } catch (Exception e) {
                 System.out.println("\nNo Patient" +e); 
                }
        }
               public void PatientInfoDrJ() {
        	try {
                 File myObj = new File("Dr.J.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                String s=myReader.nextLine();
                String Name=myReader.nextLine();
                System.out.println("\nName: "+Name);
                String MailID=myReader.nextLine();
                System.out.println("Mail id: "+MailID);
                String gender=myReader.nextLine();
                System.out.println("Gender: "+gender);
                String Diseases=myReader.nextLine();
                System.out.println("Sickness:" +Diseases);
                String BloodGroup=myReader.nextLine();
                System.out.println("BloodGroup: "+BloodGroup);
                int age=myReader.nextInt();
                System.out.println("Age:" +age);
                int P_num=myReader.nextInt();
                System.out.println("Phone Number: "+P_num);
                 }
                 myReader.close();
                 }catch(Exception e) {
                 System.out.println("\nNo Patient" +e); 
                }
        }
                public void PatientInfoDrK() {
        	try {
                 File myObj = new File("Dr.K.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                String s=myReader.nextLine();
                String Name=myReader.nextLine();
                System.out.println("\nName: "+Name);
                String MailID=myReader.nextLine();
                System.out.println("Mail id: "+MailID);
                String gender=myReader.nextLine();
                System.out.println("Gender: "+gender);
                String Diseases=myReader.nextLine();
                System.out.println("Sickness:" +Diseases);
                String BloodGroup=myReader.nextLine();
                System.out.println("BloodGroup: "+BloodGroup);
                int age=myReader.nextInt();
                System.out.println("Age:" +age);
                int P_num=myReader.nextInt();
                System.out.println("Phone Number: "+P_num);
                 }
                 myReader.close();
                 } catch (Exception e) {
                 System.out.println("\nNo Patient" +e); 
                }
        }
                
               public void PatientInfoDrL() {
        	try {
                 File myObj = new File("Dr.L.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                String s=myReader.nextLine();
                String Name=myReader.nextLine();
                System.out.println("\nName: "+Name);
                String MailID=myReader.nextLine();
                System.out.println("Mail id: "+MailID);
                String gender=myReader.nextLine();
                System.out.println("Gender: "+gender);
                String Diseases=myReader.nextLine();
                System.out.println("Sickness:" +Diseases);
                String BloodGroup=myReader.nextLine();
                System.out.println("BloodGroup: "+BloodGroup);
                int age=myReader.nextInt();
                System.out.println("Age:" +age);
                int P_num=myReader.nextInt();
                System.out.println("Phone Number: "+P_num);
                 }
                 myReader.close();
                 } catch (Exception e) {
                 System.out.println("\nNo Patient" +e); 
                }
        }   
}
