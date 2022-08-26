import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        System.out.println("Please enter three number");
        Scanner in = new Scanner(System.in);
        int n1, n2, n3;
        System.out.println("Enter the first number:");
        n1 = in.nextInt();
        System.out.println("Enter the second number:");
        n2 = in.nextInt();
        System.out.println("Enter the third number:");
        n3 = in.nextInt();
        if (n1 <= n2 && n2 <= n3 || n1 >= n2 && n2 >= n3)
            System.out.println("in order");
        else if (n2 > n3 && n1 < n3 || n2 < n3 && n1 > n3)
            System.out.println("not in order");
    }
}
