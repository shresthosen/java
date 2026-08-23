import java.util.Scanner;
class Name {
    String fn, mn, ln;
    Name(String f, String m, String l) {
        fn = f;
        mn = m;
        ln = l;
    }
}
class DOB {
    int dd, mm, yy;
    DOB(int d, int m, int y) {
        dd = d;
        mm = m;
        yy = y;
    }
}
class Student {
    int id;
    String gen;
    String fn,mn,ln;
    int dd,mm,yy;
    Name n;
    DOB d;
    int marks[] = new int[3];
    void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        id = sc.nextInt();
        System.out.print("Enter Gender: ");
        gen = sc.next();
        System.out.print("Enter First Name: ");
        fn = sc.next();
        System.out.print("Enter Middle Name: ");
        mn = sc.next();
        System.out.print("Enter Last Name: ");
        ln = sc.next();
        n = new Name(fn, mn, ln);
        System.out.print("Enter Day: ");
        dd = sc.nextInt();
        System.out.print("Enter Month: ");
        mm = sc.nextInt();
        System.out.print("Enter Year: ");
        yy = sc.nextInt();
        d = new DOB(dd, mm, yy);
        System.out.println("Enter 3 marks:");
        for (int i = 0; i < 3; i++) {
            marks[i] = sc.nextInt();
        }
    }

    void printDetails() {
        System.out.println("ID = " + id);
        System.out.println("Gender = " + gen);
        System.out.println("Name = " + n.fn + " " + n.mn + " " + n.ln);
        System.out.println("DOB = " + d.dd + "/" + d.mm + "/" + d.yy);
        System.out.println("Marks:");
        for (int i = 0; i < 3; i++) {
            System.out.println(marks[i]);
        }
    }
}
class Main {
    public static void main(String args[]) {
        int n, i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of students: ");
        n = sc.nextInt();
        Student s[] = new Student[n];
        for (i = 0; i < n; i++) {
            s[i] = new Student();
        }
        System.out.println("Enter details:");
        for (i = 0; i < n; i++) {
            s[i].getDetails();
        }
        System.out.println("Details are:");
        for (i = 0; i < n; i++) {
            s[i].printDetails();
        }
        sc.close();
    }
}