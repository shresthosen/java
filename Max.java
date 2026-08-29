import java.util.Scanner;
public class Max{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a , b and c: \n");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int max=(a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println("The maximum value is: "+max);
        sc.close();
    }
}