import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      	long N = sc.nextLong(); 
        long cap[] = new long[5]; // array
        for (int i=0; i<5; i++) {
            cap[i] = sc.nextLong();
        }
      	Arrays.sort(cap);
		long num_iter = N/cap[0] + 1;
      	System.out.println(num_iter + 4);
    }
}