import java.util.*;

class Main{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = B - A;
        String ans;
        if( C <= X){
            ans = "delicious";
        }else if(C >= X+1){
            ans = "dangerous";
        }else{
            ans = "safe";
        }
        System.out.println(ans);
    }
}
