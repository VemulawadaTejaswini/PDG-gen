import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int a = stdIn.nextInt();
        int p = stdIn.nextInt();
        p += a*3;
        System.out.println(p/2);
   }
}