import java.util.Scanner;
public class palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=sc.nextInt();
        int org=num;
        int dig=0;
        while(num>0)
        {
            int rem=num%10;
            dig=dig*10+rem;
            num=num/10;
        }
        if(org==dig)
            System.out.println("palindrome number.");
        else
            System.out.println("Not palindrome.");
        sc.close();
    }
}
