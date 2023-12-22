import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        int N=sc.nextInt(),A=sc.nextInt(),B=sc.nextInt();
        if(A>B){
            System.out.println(0);
            return;
        }
        if(N==1){
            System.out.println(A==B?1:0);
            return;
        }
        int min=A*(N-1)+B,max=B*(N-1)+A;
        System.out.println(max-min+1);
    }
}