import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A,B,C,num,num2=0;
        A=sc.nextInt();
        B=sc.nextInt();
        C=sc.nextInt();
        for(int a=A;a<B*A;a++){
            num = a%B;
            if(num ==C)num2 = 1;
            else num2=0;
        }
        if(num2==1) System.out.println("YES");
        else System.out.println("NO");
    }
}