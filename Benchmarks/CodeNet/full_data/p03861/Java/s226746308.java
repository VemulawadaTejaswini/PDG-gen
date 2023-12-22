import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();
        long ax = (a-1)/x;
        long bx = b/x;
        
       System.out.println(bx-ax);
    }
}
