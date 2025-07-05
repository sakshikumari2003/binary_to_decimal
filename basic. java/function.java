// import java.util.*; 
// public class function {
//    public static void myName(String name){
//     System.out.println(name);

//     return;
//    }
//    public static void main(String[]args){
//     Scanner sc=new Scanner(System.in);
//     String name=sc.next();

//     myName(name);
//    }
// }

// sum of two numbers
// import java.util.*; 
// public class function {
// public static int Sum(int a,int b){
//     System.out.println("sum of a and b"+ " "+(a+b));
//     return (a+b);
// }
// public static void main(String[]args){
//     Scanner sc=new Scanner(System.in);
//     int a=sc.nextInt();
//     int b=sc.nextInt();
//     Sum(a, b);
// }

// }





// factorial
import java.util.*; 
public class function {
    public static int Fact(int a){
        int pro=1;
        for(int i=1;i<=a;i++){
            pro=pro*i;
            
        }
        System.out.print("our factorial of"+ " "+a +"is"+" "+pro);
        return pro;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
        
            Fact(a);
    }
}