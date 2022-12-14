import java.util.Scanner;

public class MainClass {
    public static void main(String[] args){
        AtmOperationInterf op = new AtmOperationImpl();
        int atmnumber=12345;
        int atmpin = 123;
        Scanner scn = new Scanner(System.in);
        System.out.print("Eneter Atm pin : ");
        int atmNumber=scn.nextInt();
        System.out.print("Enter pin : ");
        int pin=scn.nextInt();
        if((atmnumber==atmNumber)&&(atmpin==pin)){
            //System.out.println("Validation Done");
            while(true){
                System.out.println("1. View Available Balance");
                System.out.println("2. Withraw Amount");
                System.out.println("3. Deposite Amount");
                System.out.println("4. View Mini Statement");
                System.out.println("5. Exit");

                System.out.println("Enter choice : ");
                int ch = scn.nextInt();
                if(ch==1){
                    op.viewBalance();
                }
                else if(ch==2){
                    System.out.println("Enter amount to withdraw : ");
                    double withDrawAmount = scn.nextDouble();
                    op.withdrawAmount(withDrawAmount);
                }
                else if(ch==3){
                   System.out.print("Enter Amount to Deposit : ");
                   double deposite = scn.nextDouble();
                   op.depositeAmount(deposite);
                }
                else if(ch==4){
                   op.viewMiniStatement();
                }
                else if(ch==5){
                    System.out.println("Collect Your ATM Card");
                    System.out.println("Thankyou for using ATM Machine");
                    System.exit(0);
                }
                else{
                    System.out.println("Please Enter Correct Choice");
                }
            }
        }
        else{
            System.out.println("Incorrect ATM Number Or Pin");
            System.exit(0);
        }

    }
}