package problems;
import java.util.Scanner;


public class ATM{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the pin");
        int pin=sc.nextInt();
        int PIN=1234;
        int BALANCE=20000;

        if(pin==PIN){
            System.out.println("select the action you want to perform");
            System.out.println("1.balance enquiry\n 2.change pin\n 3.chash withraw");
            int action=sc.nextInt();
            if(action==1){
                System.out.println(BALANCE);
            }else if(action==2){
                System.out.println("enter the new pin");
                PIN=sc.nextInt();
                System.out.println("pin changed succesfully!");
            } else{
                System.out.println("enter the amount to be withdrawn");
                int withdraw=sc.nextInt();
                if(withdraw<=BALANCE){
                    System.out.println("cash dispenced successfully!");
                    BALANCE=BALANCE-withdraw;
                    System.out.println("balance"+BALANCE);
                }
            }
        }else{
            System.out.println("wrong pin!!");
        }
        sc.close();
    }
}