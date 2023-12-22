import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong();
        long ans = 0L;
        int count = 0;

        while(true){
            long und = (long)Math.pow(2,count);
            ans += und;

            if(h/und <= 1L)
                break;

            count++;
        }

        System.out.println(ans);
    }
}