import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        long count = 0;
        count = (n-1) * (1+n-1);
        count /= 2;
        System.out.println(count);

    }
}