import java.text.DecimalFormat;
import java.util.Scanner;

public class account {
    DecimalFormat moneyFormat = new DecimalFormat("'RS-'###,##0.00");
    private int customernumber;
    private int pinNumber;
    private double checking=0;
    private double saving =0;
    public void setCustomerNumber(int n){
        this.customernumber=n;
    }
    public void setPinNumber(int n){
         this.pinNumber=n;
    }
    public int getCustomerNumber(){
        return customernumber;
    }
    public void savingupdate(double a){
        saving+=a;
    }
    public void checkingupdate(double a){
        checking+=a;
    }
    public int getPinNumber(){
        return pinNumber;
    }
    public double CheckingWithdrawInput(double n){
        return checking-n;
    }
    public double SavingWithdrawInput(double n){
        return saving-n;
    }
    public double getCheckblanced(){
        return checking;
    }
    public double getSaveblanced(){
        return saving;
    }
    public void getCheckingWithdrawInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("How much amount you need to withdraw");
        double k=sc.nextDouble();
        if(checking<k){
            System.out.println("first deposit the Amount");

        }
        else{
            System.out.println(moneyFormat.format(CheckingWithdrawInput(k)));
        }
    }
    public void getSavingWithdrawInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("How much amount you need to withdraw");
        double k=sc.nextDouble();
        if(checking<k){
            System.out.println("first deposit the Amount");

        }
        else{
            System.out.println(moneyFormat.format(SavingWithdrawInput(k)));
        }
    }
    public void getCheckingDeposit(){
        Scanner sc=new Scanner(System.in);
        System.out.println("How much amount you need to Deposit");
        double h=sc.nextDouble();
        checkingupdate(h);
        System.out.println("Remaining Balanced");
        System.out.println(moneyFormat.format(checking));
    }
    public void getSavingDeposit(){
        Scanner sc=new Scanner(System.in);
        System.out.println("How much amount you need to Deposit");
        double h=sc.nextDouble();
        savingupdate(h);
        System.out.println("Remaining Balanced");
        System.out.println(moneyFormat.format(saving));
    }
}
