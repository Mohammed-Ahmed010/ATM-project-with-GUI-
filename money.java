package ATM;

import javax.swing.*;
import java.util.Scanner;

public class money {
    private static float initialmoney =100.00f;
static Scanner in =new Scanner(System.in);


    static void inacc() {
//        System.out.println("select option : ");
//        System.out.println(" 1 :WITH DRAW ");
//        System.out.println(" 2 :DEPOSIT");

        //int n=in.nextInt();
        String s= JOptionPane.showInputDialog(null,"select option :\n  1 :WITH DRAW \n 2 :DEPOSIT") ;
        int n=Integer.parseInt(s);
        switch (n){
            case 1:
                withdraw();
                break;
            case 2:
                deposit();
                break;
            default:
//                System.out.printf("Sorry \n" +
//                        "enter a valid Option ");

                JOptionPane.showMessageDialog(null,"Sorry enter a valid Option ");
                inacc();

        }

    }
    static  void  withdraw(){
        //int initialmoney =100;
//        System.out.println("enter money you want to withdraw");
//        float withdraw =in.nextInt();
        String s=JOptionPane.showInputDialog(null,"enter money you want to withdraw");
        int withdraw=Integer.parseInt(s);
        float balance =initialmoney-withdraw;

        if(balance<0){
          //  System.out.println("sorry balance cant be negative ");
            JOptionPane.showMessageDialog(null,"sorry balance cant be negative");
            withdraw();
        }
        else {
            JOptionPane.showMessageDialog(null,"new balance ="+balance);
            //System.out.println("new balance ="+balance);
        }
    }
    static void deposit(){
       // int initialmoney =100;

//        System.out.println("enter money you want to deposit");
//        float depositmoney =in.nextInt();
        String s=JOptionPane.showInputDialog(null,"enter money you want to deposit ");
        int depositmoney=Integer.parseInt(s);
        float balance =initialmoney+depositmoney;

        JOptionPane.showMessageDialog(null,"new balance ="+balance);
            //System.out.println("new balance ="+balance);

    }


}

