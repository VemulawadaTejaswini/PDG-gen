import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();
        long answer = 0;
        if(a != 0){
            answer = (b/x+1) - ((a-1)/x+1);
        } else {
            answer = (b/x+1) - 1;
        }
        System.out.print(answer);
    }
}