import java.util.*;
public class LoanManagementSystem{
     
    public static void main(String args[]){
        Undergraduate undergrad = new Undergraduate();
        Postgraduate postgrad = new Postgraduate();

        System.out.println("                ************WELCOME TO CHANCO STUDENT LOAN MANAGEMENT SYSTEM********                   ");
        System.out.println(" ACCOUNT TYPE \n Please select the type of account you would like to open: ");
        System.out.println("        1.undergraduate account \n      2.postgraduate account");

       Scanner input = new Scanner(System.in);
       int choice = input.nextInt();

       if (choice == 1){

           System.out.println("             CREATING UNDERGRADUATE ACCOUNT          ");

           System.out.println("*Enter your name: ");
           String name = input.nextLine();
           undergrad.setName(name);
           input.nextLine();
    
          System.out.println("*Enter your program of study: ");
          String pgOfStudy = input.nextLine();
          undergrad.setPgOfStudy(pgOfStudy);

          System.out.println("*Enter the programs duration: ");
          int yrOfStudy = input.nextInt();
          undergrad.setYrOfStudy(yrOfStudy);
       }  
       else if (choice == 2){

           System.out.println("             CREATING POSTGRADUATE ACCOUNT          ");

           System.out.println("*Enter your name: ");
           String name = input.nextLine();
           postgrad.setName(name);
           input.nextLine();

           System.out.println("*Enter your program of study: ");
          String pgOfStudy = input.nextLine();
          postgrad.setPgOfStudy(pgOfStudy);

           System.out.println("*Enter the programs duration: ");
          int yrOfStudy = input.nextInt();
          postgrad.setYrOfStudy(yrOfStudy);
       }
    }
}