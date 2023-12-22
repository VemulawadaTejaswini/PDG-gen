import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long ret = 0;
        // 差が偶数
        if((b-a)%2==0){
            ret = (b-a)/2;
        }
        // 差が奇数
        else{
            ret = a-1 < n-b ? (a-1)+1+(b-a-1)/2 : (n-b)+1+(b-a-1)/2;
        }
        System.out.println(ret);
    }
}
