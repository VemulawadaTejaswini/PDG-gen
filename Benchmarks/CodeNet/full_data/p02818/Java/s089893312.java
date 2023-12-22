import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a-c<0&&a+b>=c){
            System.out.println("0 "+(b-(c-a)));
        }else if(a+b<=c){
            System.out.println("0 0");
        }else{
            System.out.println(a-c+" "+b);
        }
    }
    
}