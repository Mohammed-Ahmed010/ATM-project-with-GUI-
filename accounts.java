package ATM;

import javax.swing.*;
import java.util.Scanner;

public class accounts  extends  money{
  static   Scanner in = new Scanner(System.in);
  static String accountNumber="123456789";
  static   String   password="1234";

   static void typeaccount(){
      String s= JOptionPane.showInputDialog(null,"Please select type of Account\n 1 : personal Account \n2 : Business Account");
//      System.out.println("Please select type of Account ");
//      System.out.println("1 : personal Account  ");
//      System.out.println(" 2 : Business Account ");

     // int n = in.nextInt();
int n=Integer.parseInt(s);
      switch (n) {
          case 1:
              personalaccount();
              break;
          case 2:
              Businessaccount();
              break;
          default:
          JOptionPane.showMessageDialog(null,"Sorry \n" +
                              "enter a valid Option" );
             // System.out.printf("Sorry \n" +
                     // "enter a valid Option ");

      }
  }
    static void personalaccount(){
String acc =JOptionPane.showInputDialog(null,"Enter your Account number :");
String n=JOptionPane.showInputDialog(null,"Enter your password ");

       //        System.out.println("Enter your Account number :");
//        String acc =in.next();
//        System.out.println("Enter your password ");
//        int n=in.nextInt();
        if(acc.equals(accountNumber) && n.equals(password)){
            inacc();
        }
        else{
            JOptionPane.showMessageDialog(null,"Enter valid Account number or Password");
//            System.out.println(" Enter valid Account number or Password ");
            personalaccount();
        }

    }
    static void Businessaccount(){
//        System.out.println("Enter your Account number :");
//        String acc =in.next();
//        System.out.println("Enter your password ");
//        int n=in.nextInt();
        String acc =JOptionPane.showInputDialog(null,"Enter your Account number :");
        String n=JOptionPane.showInputDialog(null,"Enter your password ");
        if(acc.equals(accountNumber) &&n.equals(password) ){
            inacc();
        }
        else{
            System.out.println(" Enter valid Account number or Password ");
            Businessaccount();
        }


    }
    static void newuser(){
//        System.out.println("Enter details :");
//       // System.out.print("Enter your name =");
//       String name =in.next();
 String name = JOptionPane.showInputDialog(null,"Enter your name =");
     String phone =  JOptionPane.showInputDialog(null,"enter phone number");
        //int n = in.nextInt();
      //  int n=Integer.parseInt(phone);
        JOptionPane.showMessageDialog(null,"Hello !"+ name+" your account is ready :\n"+"Your account number will be messaged shortly");



    }
}
