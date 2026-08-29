///WAJP to calculate y=x^n where x and n are user input.
import java.util.Scanner;
public class Sol {
    public static void main(String[] args){
        int y=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of x:");
        int x=sc.nextInt();
        System.out.println("enter the value of n:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            y=y*x;
        }
        System.out.println("The value of y: "+y);
        sc.close();
    }
}