import java.util.Scanner;
public class for_loop {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter your number ");
        int num= sc.nextInt();

        for(int i=0;i<=num;i++){
            System.out.println(i);
        }
    }
}
