import java.util.Scanner;
public class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        while (true) {
            System.out.println("Enter the sorting method:");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Insertion Sort");
            System.out.println("3. Selection Sort");
            System.out.println("4. Exit");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter the array elements:");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<n-1;i++){
        for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    System.out.println("Bubble Sorted Array:");
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
    break;
                case 2:
                    System.out.println("Enter the array elements:");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=1;i<n;i++){
        int key=arr[i];
        int j=i-1;
        while(j>=0 && arr[j]>key){
            arr[j+1]=arr[j];
            j--;
        }   
        arr[j+1]=key;
    }
    System.out.println("Insertion Sorted Array:");
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
    break;
                case 3:
                    System.out.println("Enter the array elements:");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
        int min=i;
        for(int j=i+1;j<n;j++){
            if(arr[j]<arr[min]){
                min=j;
            }
        }
        int temp=arr[min];
        arr[min]=arr[i];
        arr[i]=temp;
    }
    System.out.println("Selection Sorted Array:");
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();

                    break;

                case 4:
                    System.out.println("Exiting the program");
                    System.exit(0);
                    sc.close();
                default:
                    System.out.println("Invalid Choice");

            }
        }
    }
}