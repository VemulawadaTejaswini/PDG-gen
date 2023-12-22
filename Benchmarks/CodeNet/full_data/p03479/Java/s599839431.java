import java.util.*;

class Main{
    public static void main(String[] args){
        long X, Y, A, i=0;
        Scanner sc = new Scanner(System.in);
        X = sc.nextLong();
        Y = sc.nextLong();
        A = X;
        while(X <= A && A <= Y){
            A = A*2;
            i++;
        }
        System.out.println(i);
    }
}