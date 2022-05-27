package FinalProject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DocMain {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		System.out.println("\n---------Hi! This is Doctor's Point-------");
		System.out.println("\nChoose Usertype:");
		System.out.println("1.Patient");
		System.out.println("2.Doctor");
		int choice;
		System.out.print("\nEnter your choice: ");
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		switch (choice) {
		case 1: {
			showPatientInfo();
			break;
                                
			}		
		case 2:{
			showDoctorsDetails();
			break;
		}
		}
	}
		public static void showPatientInfo() {
			System.out.println("\n---------Hospital list----------");
			Hospital apollo = new apollo();
			apollo.HospitalList();
			Hospital square = new square();
			square.HospitalList();
			Hospital united = new united();
			united.HospitalList();
			Hospital kurmitola = new kurmitola();
			kurmitola.HospitalList();
			Hospital cresent = new cresent();
			cresent.HospitalList();
			int choice = 0;
			System.out.print("\nEnter your choice: ");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			switch (choice) {
			case 1: {
				showDepartmentList1();
                                System.out.print("\nEnter your Choice: ");
                                int var=sc.nextInt();
                                if(var==1){
                                System.out.print("\n[-----Doctor's List-----]");
                                showDoctorsList1();                     
                                System.out.print("\nChoose Doctor: ");
                                int var1=sc.nextInt();
                                if(var1==1){
                                    showDoctorsInfo1();
                                }
                                else if(var1==2){
                                    showDoctorsInfo2();
                                }
                                else{
                                    showDoctorsInfo3();
                                }
                                }
                                else if(var==2){
                                   System.out.print("\n[-----Doctor's List-----]");
                                   showDoctorsList2();
                                   System.out.print("\nChoose Doctor: ");
                                int var1=sc.nextInt();
                                if(var1==1){
                                    showDoctorsInfo4();
                                }
                                else if(var1==2){
                                    showDoctorsInfo5();
                                }
                                else{
                                    showDoctorsInfo6();
                                } 
                                }
                                else if(var==3){
                                    System.out.print("\n[-----Doctor's List-----]");
                                   showDoctorsList3();
                                   System.out.print("\nChoose Doctor: ");
                                int var1=sc.nextInt();
                                if(var1==1){
                                    showDoctorsInfo7();
                                }
                                else if(var1==2){
                                    showDoctorsInfo8();
                                }
                                else{
                                    showDoctorsInfo9();
                                } 
                                }
                                else{
                                    System.out.print("\n[-----Doctor's List-----]");
                                    showDoctorsList4();
                                    System.out.print("\nChoose Doctor: ");
                                int var1=sc.nextInt();
                                if(var1==1){
                                    showDoctorsInfo10();
                                }
                                else if(var1==2){
                                    showDoctorsInfo11();
                                }
                                else{
                                    showDoctorsInfo12();
                                }
                                }
				break;
			}
			case 2: {
				showDepartmentList2();
                                System.out.print("\nEnter your Choice: ");
                                int var=sc.nextInt();
                                if(var==1){
                                    System.out.print("\n[-----Doctor's List-----]");
                                showDoctorsList1();
                                System.out.print("\nChoose Doctor: ");
                                int var1=sc.nextInt();
                                if(var1==1){
                                    showDoctorsInfo1();
                                }
                                else if(var1==2){
                                    showDoctorsInfo2();
                                }
                                else{
                                    showDoctorsInfo3();
                                }
                                }
                                else if(var==2){
                                    System.out.print("\n[-----Doctor's List-----]");
                                   showDoctorsList2();
                                   System.out.print("\nChoose Doctor: ");
                                int var1=sc.nextInt();
                                if(var1==1){
                                    showDoctorsInfo4();
                                }
                                else if(var1==2){
                                    showDoctorsInfo5();
                                }
                                else{
                                    showDoctorsInfo6();
                                } 
                                }
                                else if(var==3){
                                    System.out.print("\n[-----Doctor's List-----]");
                                   showDoctorsList3();
                                   System.out.print("\nChoose Doctor: ");
                                int var1=sc.nextInt();
                                if(var1==1){
                                    showDoctorsInfo7();
                                }
                                else if(var1==2){
                                    showDoctorsInfo8();
                                }
                                else{
                                    showDoctorsInfo9();
                                } 
                                }
                                else{
                                    System.out.print("\n[-----Doctor's List-----]");
                                    showDoctorsList4();
                                    System.out.print("\nChoose Doctor: ");
                                int var1=sc.nextInt();
                                if(var1==1){
                                    showDoctorsInfo10();
                                }
                                else if(var1==2){
                                    showDoctorsInfo11();
                                }
                                else{
                                    showDoctorsInfo12();
                                }
                                }
				break;
			}
			case 3: {
				showDepartmentList3();
                                System.out.print("\nEnter your Choice: ");
                                int var=sc.nextInt();
                                if(var==1){
                                    System.out.print("\n[-----Doctor's List-----]");
                                showDoctorsList1();
                                System.out.print("\nChoose Doctor: ");
                                int var1=sc.nextInt();
                                if(var1==1){
                                    showDoctorsInfo1();
                                }
                                else if(var1==2){
                                    showDoctorsInfo2();
                                }
                                else{
                                    showDoctorsInfo3();
                                }
                                }
                                else if(var==2){
                                    System.out.print("\n[-----Doctor's List-----]");
                                   showDoctorsList2();
                                   System.out.print("\nChoose Doctor: ");
                                int var1=sc.nextInt();
                                if(var1==1){
                                    showDoctorsInfo4();
                                }
                                else if(var1==2){
                                    showDoctorsInfo5();
                                }
                                else{
                                    showDoctorsInfo6();
                                } 
                                }
                                else if(var==3){
                                    System.out.print("\n[-----Doctor's List-----]");
                                   showDoctorsList3();
                                   System.out.print("\nChoose Doctor: ");
                                int var1=sc.nextInt();
                                if(var1==1){
                                    showDoctorsInfo7();
                                }
                                else if(var1==2){
                                    showDoctorsInfo8();
                                }
                                else{
                                    showDoctorsInfo9();
                                } 
                                }
                                else{
                                    System.out.print("\n[-----Doctor's List-----]");
                                    showDoctorsList4();
                                    System.out.print("\nChoose Doctor: ");
                                int var1=sc.nextInt();
                                if(var1==1){
                                    showDoctorsInfo10();
                                }
                                else if(var1==2){
                                    showDoctorsInfo11();
                                }
                                else{
                                    showDoctorsInfo12();
                                }
                                }
				break;
		    }
			case 4: {
				showDepartmentLis4();
                                System.out.print("\nEnter your Choice: ");
                                int var=sc.nextInt();
                                if(var==1){
                                    System.out.print("\n[-----Doctor's List-----]");
                                showDoctorsList1();
                                System.out.print("\nChoose Doctor: ");
                                int var1=sc.nextInt();
                                if(var1==1){
                                    showDoctorsInfo1();
                                }
                                else if(var1==2){
                                    showDoctorsInfo2();
                                }
                                else{
                                    showDoctorsInfo3();
                                }
                                }
                                else if(var==2){
                                    System.out.print("\n[-----Doctor's List-----]");
                                   showDoctorsList2();
                                   System.out.print("\nChoose Doctor: ");
                                int var1=sc.nextInt();
                                if(var1==1){
                                    showDoctorsInfo4();
                                }
                                else if(var1==2){
                                    showDoctorsInfo5();
                                }
                                else{
                                    showDoctorsInfo6();
                                } 
                                }
                                else if(var==3){
                                    System.out.print("\n[-----Doctor's List-----]");
                                   showDoctorsList3();
                                   System.out.print("\nChoose Doctor: ");
                                int var1=sc.nextInt();
                                if(var1==1){
                                    showDoctorsInfo7();
                                }
                                else if(var1==2){
                                    showDoctorsInfo8();
                                }
                                else{
                                    showDoctorsInfo9();
                                } 
                                }
                                else{
                                    System.out.print("\n[-----Doctor's List-----]");
                                    showDoctorsList4();
                                    System.out.print("\nChoose Doctor: ");
                                int var1=sc.nextInt();
                                if(var1==1){
                                    showDoctorsInfo10();
                                }
                                else if(var1==2){
                                    showDoctorsInfo11();
                                }
                                else{
                                    showDoctorsInfo12();
                                }
                                }
				break;
			}
			case 5: {
				showDepartmentList5();
                                System.out.print("\nEnter your Choice: ");
                                int var=sc.nextInt();
                                if(var==1){
                                    System.out.print("\n[-----Doctor's List-----]");
                                showDoctorsList1();
                                System.out.print("\nChoose Doctor: ");
                                int var1=sc.nextInt();
                                if(var1==1){
                                    showDoctorsInfo1();
                                }
                                else if(var1==2){
                                    showDoctorsInfo2();
                                }
                                else{
                                    showDoctorsInfo3();
                                }
                                }
                                else if(var==2){
                                    System.out.print("\n[-----Doctor's List-----]");
                                   showDoctorsList2();
                                   System.out.print("\nChoose Doctor: ");
                                int var1=sc.nextInt();
                                if(var1==1){
                                    showDoctorsInfo4();
                                }
                                else if(var1==2){
                                    showDoctorsInfo5();
                                }
                                else{
                                    showDoctorsInfo6();
                                } 
                                }
                                else if(var==3){
                                    System.out.print("\n[-----Doctor's List-----]");
                                   showDoctorsList3();
                                   System.out.print("\nChoose Doctor: ");
                                int var1=sc.nextInt();
                                if(var1==1){
                                    showDoctorsInfo7();
                                }
                                else if(var1==2){
                                    showDoctorsInfo8();
                                }
                                else{
                                    showDoctorsInfo9();
                                } 
                                }
                                else{
                                    System.out.print("\n[-----Doctor's List-----]");
                                    showDoctorsList4();
                                    System.out.print("\nChoose Doctor: ");
                                int var1=sc.nextInt();
                                if(var1==1){
                                    showDoctorsInfo10();
                                }
                                else if(var1==2){
                                    showDoctorsInfo11();
                                }
                                else{
                                    showDoctorsInfo12();
                                }
                                }
				break;
			}
			}                     	
		}
                private static void showDepartmentList1(){
			System.out.println("\n[----------Welcome to Apollo Hospital-----------]");
			System.out.println("\n[*****Choose a Department to take an Appointment of Doctors*******]");
			apollo a= new apollo();
			a.DepartmentList1();                                                                  
			}
                public static void showDoctorsList1(){
                        Neurology n = new Neurology("\n1.Dr.A","10 am","2 pm",700);
                        Neurology n1= new Neurology("2.Dr.B","2 pm","6 pm",1000);
                        Neurology n2= new Neurology("3.Dr.C","6 pm","10 pm",800);                        
                }
                public static void showDoctorsInfo1(){                       
                        Patient p=new Patient();
                        p.displayLoginPatient();
                        try {
                         FileWriter myWriter = new FileWriter("Dr.A.txt");
                         myWriter.write("\n"+p.getName());
                         myWriter.write("\n"+p.getMailID());
                         myWriter.write("\n"+p.getgender());
                         myWriter.write("\n"+p.getDiseases());
                         myWriter.write("\n"+p.getBloodGroup());
                         myWriter.write("\n"+p.getage());
                         myWriter.write("\n"+p.getP_num());
                         myWriter.close();
                         System.out.println("Successfully wrote to the file.");
                        } catch (IOException e) {
                         System.out.println("An error occurred.");
                         e.printStackTrace();
                         }                                                
                }
		private static void showDepartmentList2() {
			System.out.println("\n[----------Welcome to Square Hospital---------]");
			System.out.println("\n[*****Choose a Department to take an Appointment of Doctors*******]");
			square s = new square();
			s.DepartmentList2();
                }
                        public static void showDoctorsList2(){
                        Cardiology c = new Cardiology("\n1.Dr.D","8 am","10 pm",1500);
                        Cardiology c1= new Cardiology("2.Dr.E","10 am","2 pm",900);
                        Cardiology c2= new Cardiology("3.Dr.F","4 am","8 pm",1200);                    
                }
                public static void showDoctorsInfo2(){                       
                        Patient p=new Patient();
                        p.displayLoginPatient();
                        try {
                         FileWriter myWriter = new FileWriter("Dr.B.txt");
                         myWriter.write("\n"+p.getName());
                         myWriter.write("\n"+p.getMailID());
                         myWriter.write("\n"+p.getgender());
                         myWriter.write("\n"+p.getDiseases());
                         myWriter.write("\n"+p.getBloodGroup());
                         myWriter.write("\n"+p.getage());
                         myWriter.write("\n"+p.getP_num());
                         myWriter.close();
                         System.out.println("Successfully wrote to the file.");
                        } catch (IOException e) {
                         System.out.println("An error occurred.");
                         e.printStackTrace();
                         }
		}
                private static void showDepartmentList3() {
			System.out.println("\n[----------Welcome to United Hospital---------]");
			System.out.println("\n[*****Choose a Department to take an Appointment of Doctors*******]");
			united u = new united();
			u.DepartmentList3();
		}
                        public static void showDoctorsList3(){
                        GeneralSurgery g = new GeneralSurgery("\n1.Dr.G","10 am","3 pm",800);
                        GeneralSurgery g1= new GeneralSurgery("2.Dr.H","4 am","7 pm",700);
                        GeneralSurgery g2= new GeneralSurgery("3.Dr.I","7 am","11 pm",1000);                    
                }
                public static void showDoctorsInfo3(){                       
                        Patient p=new Patient();
                        p.displayLoginPatient();
                        try {
                         FileWriter myWriter = new FileWriter("Dr.C.txt");
                         myWriter.write("\n"+p.getName());
                         myWriter.write("\n"+p.getMailID());
                         myWriter.write("\n"+p.getgender());
                         myWriter.write("\n"+p.getDiseases());
                         myWriter.write("\n"+p.getBloodGroup());
                         myWriter.write("\n"+p.getage());
                         myWriter.write("\n"+p.getP_num());
                         myWriter.close();
                         System.out.println("Successfully wrote to the file.");
                        } catch (IOException e) {
                         System.out.println("An error occurred.");
                         e.printStackTrace();
                         }
		}
                private static void showDepartmentLis4() {
			System.out.println("\n[---------Welcome to Kurmitola general Hospital-------]");
			System.out.println("\n[*****Choose a Department to take an Appointment of Doctors*******]");
                        kurmitola k = new kurmitola();
                        k.DepartmentList4();                       
		}
                        public static void showDoctorsList4(){
                        EarNoseandThroat e = new EarNoseandThroat("\n1.Dr.J","9 am","1 pm",500);
                        EarNoseandThroat e1= new EarNoseandThroat("2.Dr.K","3 am","6 pm",800);
                        EarNoseandThroat e2= new EarNoseandThroat("3.Dr.L","7 am","9 pm",600);                    
                }           
                       public static void showDoctorsInfo4(){                       
                        Patient p=new Patient();
                        p.displayLoginPatient();
                        try {
                         FileWriter myWriter = new FileWriter("Dr.D.txt");
                         myWriter.write("\n"+p.getName());
                         myWriter.write("\n"+p.getMailID());
                         myWriter.write("\n"+p.getgender());
                         myWriter.write("\n"+p.getDiseases());
                         myWriter.write("\n"+p.getBloodGroup());
                         myWriter.write("\n"+p.getage());
                         myWriter.write("\n"+p.getP_num());
                         myWriter.close();
                         System.out.println("Successfully wrote to the file.");
                        } catch (IOException e) {
                         System.out.println("An error occurred.");
                         e.printStackTrace();
                         }
		}
                private static void showDepartmentList5() {
			System.out.println("\n[----------Welcome to Cresent Hospital-----------]");
			System.out.println("\n[*****Choose a Department to take an Appointment of Doctors*******]");
			cresent c = new cresent();
			c.DepartmentList5();
		}
                        public static void showDoctorsInfo5(){                       
                        Patient p=new Patient();
                        p.displayLoginPatient();
                        try {
                         FileWriter myWriter = new FileWriter("Dr.E.txt");
                         myWriter.write("\n"+p.getName());
                         myWriter.write("\n"+p.getMailID());
                         myWriter.write("\n"+p.getgender());
                         myWriter.write("\n"+p.getDiseases());
                         myWriter.write("\n"+p.getBloodGroup());
                         myWriter.write("\n"+p.getage());
                         myWriter.write("\n"+p.getP_num());
                         myWriter.close();
                         System.out.println("Successfully wrote to the file.");
                        } catch (IOException e) {
                         System.out.println("An error occurred.");
                         e.printStackTrace();
                         }
		}
                        public static void showDoctorsInfo6(){                       
                        Patient p=new Patient();
                        p.displayLoginPatient();
                        try {
                         FileWriter myWriter = new FileWriter("Dr.F.txt");
                         myWriter.write("\n"+p.getName());
                         myWriter.write("\n"+p.getMailID());
                         myWriter.write("\n"+p.getgender());
                         myWriter.write("\n"+p.getDiseases());
                         myWriter.write("\n"+p.getBloodGroup());
                         myWriter.write("\n"+p.getage());
                         myWriter.write("\n"+p.getP_num());
                         myWriter.close();
                         System.out.println("Successfully wrote to the file.");
                        } catch (IOException e) {
                         System.out.println("An error occurred.");
                         e.printStackTrace();
                         }
		}
                        public static void showDoctorsInfo7(){                       
                        Patient p=new Patient();
                        p.displayLoginPatient();
                        try {
                         FileWriter myWriter = new FileWriter("Dr.G.txt");
                         myWriter.write("\n"+p.getName());
                         myWriter.write("\n"+p.getMailID());
                         myWriter.write("\n"+p.getgender());
                         myWriter.write("\n"+p.getDiseases());
                         myWriter.write("\n"+p.getBloodGroup());
                         myWriter.write("\n"+p.getage());
                         myWriter.write("\n"+p.getP_num());
                         myWriter.close();
                         System.out.println("Successfully wrote to the file.");
                        } catch (IOException e) {
                         System.out.println("An error occurred.");
                         e.printStackTrace();
                         }
		}
                        public static void showDoctorsInfo8(){                       
                        Patient p=new Patient();
                        p.displayLoginPatient();
                        try {
                         FileWriter myWriter = new FileWriter("Dr.H.txt");
                         myWriter.write("\n"+p.getName());
                         myWriter.write("\n"+p.getMailID());
                         myWriter.write("\n"+p.getgender());
                         myWriter.write("\n"+p.getDiseases());
                         myWriter.write("\n"+p.getBloodGroup());
                         myWriter.write("\n"+p.getage());
                         myWriter.write("\n"+p.getP_num());
                         myWriter.close();
                         System.out.println("Successfully wrote to the file.");
                        } catch (IOException e) {
                         System.out.println("An error occurred.");
                         e.printStackTrace();
                         }
		}
                        public static void showDoctorsInfo9(){                       
                        Patient p=new Patient();
                        p.displayLoginPatient();
                        try {
                         FileWriter myWriter = new FileWriter("Dr.I.txt");
                         myWriter.write("\n"+p.getName());
                         myWriter.write("\n"+p.getMailID());
                         myWriter.write("\n"+p.getgender());
                         myWriter.write("\n"+p.getDiseases());
                         myWriter.write("\n"+p.getBloodGroup());
                         myWriter.write("\n"+p.getage());
                         myWriter.write("\n"+p.getP_num());
                         myWriter.close();
                         System.out.println("Successfully wrote to the file.");
                        } catch (IOException e) {
                         System.out.println("An error occurred.");
                         e.printStackTrace();
                         }
		}
                        public static void showDoctorsInfo10(){                       
                        Patient p=new Patient();
                        p.displayLoginPatient();
                        try {
                         FileWriter myWriter = new FileWriter("Dr.J.txt");
                         myWriter.write("\n"+p.getName());
                         myWriter.write("\n"+p.getMailID());
                         myWriter.write("\n"+p.getgender());
                         myWriter.write("\n"+p.getDiseases());
                         myWriter.write("\n"+p.getBloodGroup());
                         myWriter.write("\n"+p.getage());
                         myWriter.write("\n"+p.getP_num());
                         myWriter.close();
                         System.out.println("Successfully wrote to the file.");
                        } catch (IOException e) {
                         System.out.println("An error occurred.");
                         e.printStackTrace();
                         }
		}
                        public static void showDoctorsInfo11(){                       
                        Patient p=new Patient();
                        p.displayLoginPatient();
                        try {
                         FileWriter myWriter = new FileWriter("Dr.K.txt");
                         myWriter.write("\n"+p.getName());
                         myWriter.write("\n"+p.getMailID());
                         myWriter.write("\n"+p.getgender());
                         myWriter.write("\n"+p.getDiseases());
                         myWriter.write("\n"+p.getBloodGroup());
                         myWriter.write("\n"+p.getage());
                         myWriter.write("\n"+p.getP_num());
                         myWriter.close();
                         System.out.println("Successfully wrote to the file.");
                        } catch (IOException e) {
                         System.out.println("An error occurred.");
                         e.printStackTrace();
                         }
		}
                        public static void showDoctorsInfo12(){                       
                        Patient p=new Patient();
                        p.displayLoginPatient();
                        try {
                         FileWriter myWriter = new FileWriter("Dr.L.txt");
                         myWriter.write("\n"+p.getName());
                         myWriter.write("\n"+p.getMailID());
                         myWriter.write("\n"+p.getgender());
                         myWriter.write("\n"+p.getDiseases());
                         myWriter.write("\n"+p.getBloodGroup());
                         myWriter.write("\n"+p.getage());
                         myWriter.write("\n"+p.getP_num());
                         myWriter.close();
                         System.out.println("Successfully wrote to the file.");
                        } catch (IOException e) {
                         System.out.println("An error occurred.");
                         e.printStackTrace();
                         }
		}
                                                                                                                        
		public static void showDoctorsDetails() {
                        Patient i=new Patient();
			System.out.print("\n[-----------Please Sign in!------------]");
			Doctor obj2 = new Doctor();
			obj2.loginDoctor();
                        System.out.println("\n---------Hospital list----------");
			Hospital apollo = new apollo();
			apollo.HospitalList();
			Hospital square = new square();
			square.HospitalList();
			Hospital united = new united();
			united.HospitalList();
			Hospital kurmitola = new kurmitola();
			kurmitola.HospitalList();
			Hospital cresent = new cresent();
			cresent.HospitalList();
			int choice = 0;
			System.out.print("\nEnter your choice: ");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			switch (choice) {
			case 1: {
				showDepartmentList1();
                                System.out.print("Enter your Choice: ");
                                int var=sc.nextInt();
                                if(var==1){
                                System.out.print("\n[-----Doctor's List-----]");
                                showDoctorsList1();
                                System.out.print("\nChoose Your Name: ");
                                int var1=sc.nextInt();
                                System.out.print("[----------Patient Information---------]");
                                if(var1==1){
                                    i.PatientInfoDrA();
                                }
                                else if(var1==2){
                                    i.PatientInfoDrB();
                                }
                                else{
                                    i.PatientInfoDrC();
                                }
                                }
                                else if(var==2){
                                    System.out.print("\n[-----Doctor's List-----]");
                                   showDoctorsList2();
                                   System.out.print("\nChoose Your Name: ");
                                int var1=sc.nextInt();
                                System.out.print("[----------Patient Information---------]");
                                if(var1==1){
                                    i.PatientInfoDrD();
                                }
                                else if(var1==2){
                                    i.PatientInfoDrE();
                                }
                                else{
                                    i.PatientInfoDrF();
                                } 
                                }
                                else if(var==3){
                                    System.out.print("\n[-----Doctor's List-----]");
                                   showDoctorsList3();
                                   System.out.print("\nChoose Your Name: ");                                  
                                int var1=sc.nextInt();
                                System.out.print("[----------Patient Information---------]");
                                if(var1==1){
                                    i.PatientInfoDrG();
                                }
                                else if(var1==2){
                                    i.PatientInfoDrH();
                                }
                                else{
                                    i.PatientInfoDrI();
                                } 
                                }
                                else{
                                    System.out.print("\n[-----Doctor's List-----]");
                                    showDoctorsList4();
                                    System.out.print("\nChoose Your Name: ");
                                int var1=sc.nextInt();
                                System.out.print("[----------Patient Information---------]");
                                if(var1==1){
                                    i.PatientInfoDrJ();
                                }
                                else if(var1==2){
                                    i.PatientInfoDrK();
                                }
                                else{
                                    i.PatientInfoDrL();
                                }
                                }
                                
				break;
			}
			case 2: {
				showDepartmentList2();
                                System.out.print("\nEnter your Choice: ");
                                 int var=sc.nextInt();
                                if(var==1){
                                    System.out.print("\n[-----Doctor's List-----]");
                                showDoctorsList1();
                                System.out.print("\nChoose Your Name: ");
                                int var1=sc.nextInt();
                                System.out.print("[----------Patient Information---------]");
                                if(var1==1){
                                    i.PatientInfoDrA();
                                }
                                else if(var1==2){
                                    i.PatientInfoDrB();
                                }
                                else{
                                    i.PatientInfoDrC();
                                }
                                }
                                else if(var==2){
                                    System.out.print("\n[-----Doctor's List-----]");
                                   showDoctorsList2();
                                   System.out.print("\nChoose Your Name: ");
                                int var1=sc.nextInt();
                                System.out.print("[----------Patient Information---------]");
                                if(var1==1){
                                    i.PatientInfoDrD();
                                }
                                else if(var1==2){
                                    i.PatientInfoDrE();
                                }
                                else{
                                    i.PatientInfoDrF();
                                } 
                                }
                                else if(var==3){
                                    System.out.print("\n[-----Doctor's List-----]");
                                   showDoctorsList3();
                                   System.out.print("\nChoose Your Name: ");
                                int var1=sc.nextInt();
                                System.out.print("[----------Patient Information---------]");
                                if(var1==1){
                                    i.PatientInfoDrG();
                                }
                                else if(var1==2){
                                    i.PatientInfoDrH();
                                }
                                else{
                                    i.PatientInfoDrI();
                                } 
                                }
                                else{
                                    System.out.print("\n[-----Doctor's List-----]");
                                    showDoctorsList4();
                                    System.out.print("\nChoose Your Name: ");
                                int var1=sc.nextInt();
                                System.out.print("[----------Patient Information---------]");
                                if(var1==1){
                                    i.PatientInfoDrJ();
                                }
                                else if(var1==2){
                                    i.PatientInfoDrK();
                                }
                                else{
                                    i.PatientInfoDrL();
                                }
                                }
				break;
			}
			case 3: {
				showDepartmentList3();
                                System.out.print("\nEnter your Choice: ");
                                 int var=sc.nextInt();
                                if(var==1){
                                    System.out.print("\n[-----Doctor's List-----]");
                                showDoctorsList1();
                                System.out.print("\nChoose Your Name: ");
                                int var1=sc.nextInt();
                                System.out.print("[----------Patient Information---------]");
                                if(var1==1){
                                    i.PatientInfoDrA();
                                }
                                else if(var1==2){
                                    i.PatientInfoDrB();
                                }
                                else{
                                    i.PatientInfoDrC();
                                }
                                }
                                else if(var==2){
                                    System.out.print("\n[-----Doctor's List-----]");
                                   showDoctorsList2();
                                   System.out.print("\nChoose Your Name: ");
                                int var1=sc.nextInt();
                                System.out.print("[----------Patient Information---------]");
                                if(var1==1){
                                    i.PatientInfoDrD();
                                }
                                else if(var1==2){
                                    i.PatientInfoDrE();
                                }
                                else{
                                    i.PatientInfoDrF();
                                } 
                                }
                                else if(var==3){
                                    System.out.print("\n[-----Doctor's List-----]");
                                   showDoctorsList3();
                                   System.out.print("\nChoose Your Name: ");
                                int var1=sc.nextInt();
                                System.out.print("[----------Patient Information---------]");
                                if(var1==1){
                                    i.PatientInfoDrG();
                                }
                                else if(var1==2){
                                    i.PatientInfoDrH();
                                }
                                else{
                                    i.PatientInfoDrI();
                                } 
                                }
                                else{
                                    System.out.print("\n[-----Doctor's List-----]");
                                    showDoctorsList4();
                                    System.out.print("\nChoose Your Name: ");
                                int var1=sc.nextInt();
                                System.out.print("[----------Patient Information---------]");
                                if(var1==1){
                                    i.PatientInfoDrJ();
                                }
                                else if(var1==2){
                                    i.PatientInfoDrK();
                                }
                                else{
                                    i.PatientInfoDrL();
                                }
                                }
				break;
		    }
			case 4: {
				showDepartmentLis4();
                                System.out.print("\nEnter your Choice: ");
                                 int var=sc.nextInt();
                                if(var==1){
                                    System.out.print("\n[-----Doctor's List-----]");
                                showDoctorsList1();
                                System.out.print("\nChoose Your Name: ");
                                int var1=sc.nextInt();
                                System.out.print("[----------Patient Information---------]");
                                if(var1==1){
                                    i.PatientInfoDrA();
                                }
                                else if(var1==2){
                                    i.PatientInfoDrB();
                                }
                                else{
                                    i.PatientInfoDrC();
                                }
                                }
                                else if(var==2){
                                    System.out.print("\n[-----Doctor's List-----]");
                                   showDoctorsList2();
                                   System.out.print("\nChoose Your Name: ");
                                int var1=sc.nextInt();
                                System.out.print("[----------Patient Information---------]");
                                if(var1==1){
                                    i.PatientInfoDrD();
                                }
                                else if(var1==2){
                                    i.PatientInfoDrE();
                                }
                                else{
                                    i.PatientInfoDrF();
                                } 
                                }
                                else if(var==3){
                                    System.out.print("\n[-----Doctor's List-----]");
                                   showDoctorsList3();
                                   System.out.print("\nChoose Your Name: ");
                                int var1=sc.nextInt();
                                System.out.print("[----------Patient Information---------]");
                                if(var1==1){
                                    i.PatientInfoDrG();
                                }
                                else if(var1==2){
                                    i.PatientInfoDrH();
                                }
                                else{
                                    i.PatientInfoDrI();
                                } 
                                }
                                else{
                                    System.out.print("\n[-----Doctor's List-----]");
                                    showDoctorsList4();
                                    System.out.print("\nChoose Your Name: ");
                                int var1=sc.nextInt();
                                System.out.print("[----------Patient Information---------]");
                                if(var1==1){
                                    i.PatientInfoDrJ();
                                }
                                else if(var1==2){
                                    i.PatientInfoDrK();
                                }
                                else{
                                    i.PatientInfoDrL();
                                }
                                }
				break;
			}
			case 5: {
				showDepartmentList5();
                                System.out.print("\nEnter your Choice: ");
                                 int var=sc.nextInt();
                                if(var==1){
                                    System.out.print("\n[-----Doctor's List-----]");
                                showDoctorsList1();
                                System.out.print("\nChoose Your Name: ");
                                int var1=sc.nextInt();
                                System.out.print("[----------Patient Information---------]");
                                if(var1==1){
                                    i.PatientInfoDrA();
                                }
                                else if(var1==2){
                                    i.PatientInfoDrB();
                                }
                                else{
                                    i.PatientInfoDrC();
                                }
                                }
                                else if(var==2){
                                    System.out.print("\n[-----Doctor's List-----]");
                                   showDoctorsList2();
                                   System.out.print("\nChoose Your Name: ");
                                int var1=sc.nextInt();
                                System.out.print("[----------Patient Information---------]");
                                if(var1==1){
                                    i.PatientInfoDrD();
                                }
                                else if(var1==2){
                                    i.PatientInfoDrE();
                                }
                                else{
                                    i.PatientInfoDrF();
                                } 
                                }
                                else if(var==3){
                                    System.out.print("\n[-----Doctor's List-----]");
                                   showDoctorsList3();
                                   System.out.print("\nChoose Your Name: ");
                                int var1=sc.nextInt();
                                System.out.print("[----------Patient Information---------]");
                                if(var1==1){
                                    i.PatientInfoDrG();
                                }
                                else if(var1==2){
                                    i.PatientInfoDrH();
                                }
                                else{
                                    i.PatientInfoDrI();
                                } 
                                }
                                else{
                                    System.out.print("\n[-----Doctor's List-----]");
                                    showDoctorsList4();
                                    System.out.print("\nChoose Your Name: ");
                                int var1=sc.nextInt();
                                System.out.print("[----------Patient Information---------]");
                                if(var1==1){
                                    i.PatientInfoDrJ();
                                }
                                else if(var1==2){
                                    i.PatientInfoDrK();
                                }
                                else{
                                    i.PatientInfoDrL();
                                }
                                }
				break;
			}
			}                        							}		
}

