import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        System.out.println("Please enter number of day");
        int d,m;
        Scanner in=new Scanner(System.in);
         d=in.nextInt();
        System.out.println("Please enter number of month");
        m=in.nextInt();
      if (m%3==0&&d>=21)
      {if (m==1||m==2||m==3)
          System.out.println("season : spring");
      else if (m==4||m==5||m==6)
          System.out.println("season : summer");
      else if (m==7||m==8||m==9)
          System.out.println("season : fall");
      else if (m==10||m==11||m==12)
          System.out.println("season : winter");

      }
      else
      {if (m==1||m==2||m==3)
          System.out.println("season : winter");
      else if (m==4||m==5||m==6)
          System.out.println("season : spring");
      else if (m==7||m==8||m==9)
          System.out.println("season : summer");
      else if (m==10||m==11||m==12)
          System.out.println("season : fall");


      }


    }
}
