import java.util.*;

public class Main{
    public static void main(String[] args){
        new Main().A();
    }

    void A(){
        int a,b;

        Scanner sc=new Scanner(System.in);

        a=sc.nextInt();
        b=sc.nextInt();

        int n=0;

        if(a>b){
            n=a;
            a=b;
            b=n;
        }

        StringBuilder sb=new StringBuilder();

        for(int i=0;i<b;i++){
            sb.append(a);
        }

        System.out.println(sb.toString());
    }
}