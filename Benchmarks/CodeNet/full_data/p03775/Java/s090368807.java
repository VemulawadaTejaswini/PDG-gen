import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long i = (long) Math.ceil(Math.sqrt(n));
        long j = (long) Math.floor(Math.sqrt(n));
        boolean b = true;
        int answer=0;
        while (b){
            if (n%i==0){
                answer = Math.max(Long.toString(i).length(),Long.toString(n/i).length());
                b = false;
            }
            i++;
            if (n%j==0){
                answer = Math.max(Long.toString(j).length(),Long.toString(n/j).length());
                b = false;
            }
            j--;
        }
        System.out.println(answer);
    }
}