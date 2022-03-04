package ATM;

import javax.swing.*;
import java.util.Scanner;

public class atm extends accounts {
    public static void main(String[] args) {
        welcome();
    }


    static void welcome() {
       String n= JOptionPane.showInputDialog(null,"***WELCOME TO ATM*** \n"+"1:create a new account :\n"+"2: Old user");
//        System.out.println("*WELCOME TO  ATM  :: ");
//        System.out.println("1:create a new account :");
//        System.out.println("2: Old user");
       // int n1 = in.nextInt();
       int l=Integer.parseInt(n);
        switch (l) {
            case 1:
               newuser();
                break;
            case 2:
                typeaccount();
                break;
           default: JOptionPane.showMessageDialog(null,"Sorry \n" + "enter a valid Option ");

            welcome();

        }
    }

}