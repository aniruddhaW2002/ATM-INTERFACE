package ProjectOasis;

import java.util.Scanner;

class atm 
{
    String uname,psd;
    float amount;
    public void register()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Chose \n 1.Register \n 2.Exit");
        int t=sc.nextInt();
        if(t==1){
            System.out.println("Enter your name = ");
            String name=sc.next();
            System.out.println("Enter User name = ");
            uname=sc.nextLine();
            System.out.println("Enter password = ");
            psd=sc.nextLine();
            System.out.println("Enter account number = ");
            int accNo=sc.nextInt();
            System.out.println("Successfully Register ");
        }
        else{
            System.out.println("Thank you successfuly exit");
        }
    }
    public void login()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Choce \n 1.Login \n 2.Exit");
        int t=sc.nextInt();
        if(t==1){
            System.out.println("Enter User name = ");
            String Uname=sc.nextLine();
            if(Uname.equals(uname))
            {
                System.out.println("Enter password = ");
                String password=sc.nextLine();
                if(password.equals(psd)){
                    System.out.println("Login Successfully");
                }
            }
            else{
                System.out.println("Enter correct User name ");
            }
        }

    }
    public void withdraw()
    {
        System.out.println("Enter amount To withdraw = ");
    }
}

public class ATMinterface {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        atm a=new atm();
        a.register();
        a.login();
    }
}
