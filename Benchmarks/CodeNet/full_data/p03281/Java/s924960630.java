import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int count=0;
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        if(N<105)count=0;
        else if(N<135) count=1;
        else if(N<165)count=2;
        else if(N<189)count=3;
        else if(N<195)count=4;
        else count=5;
        System.out.println(count);
    }
}