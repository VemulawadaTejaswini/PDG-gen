import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc=new Scanner(System.in);
        long a=sc.nextInt(),b=sc.nextInt(),k=sc.nextInt();
        System.out.println(Math.max(a-k,0)+" "+Math.max(Math.min(b,b-(k-a)),0));
    }
}
