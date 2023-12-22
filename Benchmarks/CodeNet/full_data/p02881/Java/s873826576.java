import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int s = (int)(Math.sqrt((double)n));
        for(int i = s;i >= 1;i--){
            if(n%i==0){
                System.out.println(i+n/i-2);
                break;
            }
        }
    }
}