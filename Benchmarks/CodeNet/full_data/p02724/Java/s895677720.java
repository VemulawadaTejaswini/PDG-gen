import java.util.*;
class Main
{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        long x=sc.nextLong();
        long ans=0;
        while(x>4) {
            if (x / 500 > 0) {
                ans += 1000;
                x -= 500;
                continue;
            }
            if (x / 5> 0) {
                ans += 5;
                x -= 5;
                continue;
            }
        }
        System.out.println(ans);
    }
}