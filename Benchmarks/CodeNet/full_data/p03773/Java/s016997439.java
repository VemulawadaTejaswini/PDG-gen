import java.util.*;


public class main{
    public static void main(String[] args){
       
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = A + B;
        if(C > 24){
            C = C-24;
        }

        System.out.println(C);
    }
}