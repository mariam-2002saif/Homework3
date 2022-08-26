import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        System.out.println("Please enter three number");
        Scanner in=new Scanner(System.in);
        int n1,n2,n3;
        System.out.println("Enter the first number:");
        n1=in.nextInt();
        System.out.println("Enter the second number:");
        n2=in.nextInt();
        System.out.println("Enter the third number:");
        n3=in.nextInt();
        if(n1==n2&n2==n3)
            System.out.println("all the same");
        else if(n1==n2||n2==n3)
            System.out.println("neither");
        else
            System.out.println("all different");

    }
}
