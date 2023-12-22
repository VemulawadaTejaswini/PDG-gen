import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int ans=a+b;
        if(ans%2==0){
            System.out.println(ans/2);
        }else{
            System.out.println("IMPOSSIBLE");
        }
    }
}