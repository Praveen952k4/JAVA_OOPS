



import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class option extends account {
    Scanner sc=new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'RS-'###,##0.00");
    HashMap<Integer, Integer> data = new HashMap<>();
    {
        data.put(12345,9486);
        data.put(56789,8148);
    }
    public void createAccount(int a, int b, HashMap<Integer, Integer> data){
        data.put(a,b);
        System.out.println("Account Created Successfully");
        getAccountType();
    }
    public void getAccountType(){
        System.out.println("Choose the option");
        System.out.println("press 1 : Checking Account");
        System.out.println("press 2 : Saving Account");
        System.out.println("press 3 : exit");
        int h=sc.nextInt();
        switch(h){
            case 1: getCheck();break;
            case 2:getSaving();break;
            case 3:System.out.println("Thanking for visiting"); break;
            default: System.out.println("Invalid choice");
        }
    }
    public void getCheck(){
        System.out.println("Navigate to checking account. Please wait...");
        System.out.println("press 1 : view Balanced");
        System.out.println("press 2 : Withdraw Money");
        System.out.println("press 3 : Deposit Money");
        System.out.println("press 4 : exit");
        // Scanner sc=new Scanner(System.in);
        int f=sc.nextInt();
        switch(f){
            case 1: System.out.println(moneyFormat.format(getCheckblanced()));getAccountType(); break;
            case 2:getCheckingWithdrawInput();getAccountType();break;
            case 3:getCheckingDeposit();getAccountType();break;
            case 4: System.out.println("Thank for visiting the ATM");
            default: System.out.println("Invalid");getCheck();break;
        }
    }
    public void getSaving(){
        System.out.println("Navigate to Saving account. Please wait...");
        System.out.println("press 1 : view Balanced");
        System.out.println("press 2 : Withdraw Money");
        System.out.println("press 3 : Deposit Money");
        System.out.println("press 4 : exit");
        // Scanner sc=new Scanner(System.in);
        int f=sc.nextInt();
        switch(f){
            case 1:System.out.println(moneyFormat.format(getSaveblanced()));getAccountType();break;
            case 2:getSavingWithdrawInput();getAccountType();break;
            case 3:getSavingDeposit();getSaving();break;
            case 4: System.out.println("Thank for visiting the ATM");break;
            default: System.out.println("Invalid");getSaving();break;
        }
    }
    public void process(){
        System.out.println("Welcome to ATM");
        System.out.println("Enter your Customer number");
        setCustomerNumber(sc.nextInt());
        System.out.println("Enter Your Pin Number");
        setPinNumber(sc.nextInt());
        int cust=getCustomerNumber();
        int pin=getPinNumber();
        if(!data.containsKey(cust)){
            System.out.println("Your must create the account first");
            System.out.println("For Creating Account press 1 else 0");
            int b=sc.nextInt();
            switch(b){
                case 1:createAccount(cust,pin,data);
                break;
                case 2: System.out.println("Thanking you for visiting the ATM");
                break;
                default: System.out.println("Press the correct value");
                break;
            }
        }
        else{
            getAccountType();
        }
        
    }
}
