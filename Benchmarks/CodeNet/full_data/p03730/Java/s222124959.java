import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A,B,C;
        A=sc.nextInt();
        B=sc.nextInt();
        C=sc.nextInt();
        int a;
        for( a=1;a<B*A;a++){
            int num = a%B;
            if(num==C) {
                System.out.println("YES");
                break;
            }
        }
        if(a==B*A) System.out.println("NO");
         }
}