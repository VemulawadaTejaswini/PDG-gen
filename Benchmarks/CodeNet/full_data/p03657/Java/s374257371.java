import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if(judge(A,B)){
            System.out.println("Possible");
        }else{
            System.out.println("Impossible");
        }
    }
    static boolean judge(int A, int B){
        if(A%3==0)return true;
        if(B%3==0)return true;
        if((A+B)%3==0)return true;
        return false;
    }
}