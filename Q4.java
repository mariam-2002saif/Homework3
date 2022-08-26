import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        System.out.println("Please enter number");
        int num;
        Scanner in=new Scanner(System.in);
        num=in.nextInt();
        if(num<10)
            System.out.println("1 digits");
        else
        if(num<100)
            System.out.println("2 digits");
        else
        if(num<1000)
            System.out.println("3 digits");
        else
        if(num<10000)
            System.out.println("4 digits");
        else
        if(num<100000)
            System.out.println("5 digits");
        else
        if(num<1000000)


           System.out.println("6 digits");
        else if(num<10000000)
            System.out.println("7 digits");
        else
        if(num<100000000)
            System.out.println("8 digits");
        else if(num<1000000000)
            System.out.println("9 digits");







    }
}
