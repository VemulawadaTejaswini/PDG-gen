package atcoder;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a-c<0){
            System.out.print("0 ");
            System.out.println(b-(c-a));
        }else{
            System.out.print(a-c);
            System.out.print(" ");
            System.out.println(b);
        }
    }
    
}
