import java.util.Scanner;
public class whileloop {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your number  ");
        int num=sc.nextInt();
        int i=1;
        int sum=0;
        while (i<=num) {
            sum=sum+i;
            i++;
        }
        System.out.println("your sum is ="+sum);
    }
}
