import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int A=in.nextInt();
        int B=in.nextInt();
        int Y=N*A;
        if((Y==B)||(Y>B)){
            System.out.println(B);
        }
        if(Y<B){
            System.out.println(Y);
        }
    }
}