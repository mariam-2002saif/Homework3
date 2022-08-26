import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        System.out.println("Please enter number:");
        int num;
        Scanner in=new Scanner(System.in);
        num=in.nextInt();
        if(num==0)
        {
            System.out.println("It is o.");
        }
        else if(num>0)
        {
            System.out.println("It is a positive number.");
        }
        else
            System.out.println("It is a negative number.");
    }
}
