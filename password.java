import java.util.*;
class password{
    public static void main(String[] args){
        String caps="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String small="abcdefghijklmnopqrstuvwxyz";
        String nums="1234567890";
        String symbols = "!@#$%^&*_=+-/.?<>)"; 
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String totalval=caps+small+nums+symbols;
        Random s=new Random();
        char[] b=new char[n];
        for(int i=0;i<n;i++){
            b[i]=totalval.charAt(s.nextInt(totalval.length()));
        }
        System.out.println(b);
    }
}