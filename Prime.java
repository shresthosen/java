//print prime number within range
import java.util.Scanner;
public class Prime {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the range of the prime number:");
        int r=sc.nextInt();
        for(int i=2;i<=r;i++){
            int flag=0;
            for(int j=2;j<=Math.sqrt(i);j++)
            {
                if(i%j==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.println("Prime number is:"+i);
                sc.close();
            }
        }
    }
}
