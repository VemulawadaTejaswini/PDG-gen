import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int countA = Integer.MAX_VALUE;
        if (X <= Y) countA = Math.abs(Y-X);
        int countB = Integer.MAX_VALUE;
        if (-X <= Y) countB = Math.abs(Y+X)+1;
        int countC = Integer.MAX_VALUE;
        if (X <= -Y) countC = Math.abs(-Y-X)+1;
        int countD = Integer.MAX_VALUE;
        if (-X <= -Y) countD = Math.abs(-Y+X)+2;
        System.out.println(Math.min(Math.min(countA, countB), Math.min(countC, countD))); 
    }
    
}