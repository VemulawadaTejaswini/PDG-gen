import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        int ans = 0 ;

        if(A>B){
            ans += A;
            A -= 1;
        }else{
            ans += B;
            B -= 1;
        }

        if(A>B){
            ans += A;
        }else{
            ans += B;
        }

        System.out.println(ans);
    }
}