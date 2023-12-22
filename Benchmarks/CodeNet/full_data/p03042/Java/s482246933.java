import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=a/100;
        a%=100;
        if(a<=12&&a>=1){
            if(b<=12&&b>=1)
                System.out.println("AMBIGUOUS");
            else
                System.out.println("YYMM");
        }
        else {
            if(b<=12&&b>=1)System.out.println("MMYY");
            
            else
            System.out.println("NA");
        }
    }
}
