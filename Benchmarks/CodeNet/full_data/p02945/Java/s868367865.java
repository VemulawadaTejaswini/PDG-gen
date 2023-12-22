import java.util.Scanner;

public class Main{
    int maxCount(int a,int b){
        return Math.max(a+b,Math.max(a-b,a*b));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Main o=new Main();
        System.out.println(o.maxCount(a,b));
    }
}