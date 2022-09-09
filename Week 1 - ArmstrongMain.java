package Assign;

import java.util.Scanner;

public class ArmstrongMain {

	public static boolean isArmstrong(int n) {
        int t,l,sum=0;
        t=n;
        while(t>0) {
            l=t%10;
            sum=sum+(l*l*l);
            t=t/10;
        }
        if(sum==n) {
            return true;
        }else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
    	
        do{
        	System.out.println("Enter number: ");
        
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        
        if(isArmstrong(num)) {
            System.out.println("Number is Armstrong");
        }else {
            System.out.println("Number is not Armstrong");
        }
        } while(true);
   }
}
