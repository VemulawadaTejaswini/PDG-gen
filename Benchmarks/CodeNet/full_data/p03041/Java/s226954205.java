import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int k = stdIn.nextInt();
        char[] s = stdIn.next().toCharArray();
        s[k-1] += 'a' - 'A';
        System.out.println(s);
   }
}
