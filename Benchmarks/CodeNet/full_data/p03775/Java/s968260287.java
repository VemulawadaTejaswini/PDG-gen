import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long i = (long) Math.ceil(Math.sqrt(n));
        boolean b = true;
        int answer=0;
        while (b){
            if (n%i==0){
                answer = Math.max(Long.toString(i).length(),Long.toString(n/i).length());
                b = false;
            }
            i++;
        }
        System.out.println(answer);
    }
}