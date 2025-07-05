import java.util.Scanner;

public class binary_to_decimal {
    public static void main(String[]args){
          Scanner sc=new Scanner(System.in);
          System.out.println("enter your binary digit");
          int binary_num=sc.nextInt();
          int ans=0;
          int power=1;

          while (binary_num>0) {
            int digit=binary_num%10;
            ans+=(digit*power);
            power*=2;
            binary_num/=10;
          }
          System.out.println(ans);
    }

}
