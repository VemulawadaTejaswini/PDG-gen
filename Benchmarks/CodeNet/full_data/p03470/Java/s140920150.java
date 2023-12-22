import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main (String[] args) {
   	 Scanner sc = new Scanner(System.in);
   	 int N = sc.nextInt();
   	 Integer a[] = new Integer[N];
   	 for(int i = 0; i < N; i++) {
   		 a[i] = sc.nextInt();
   	 }
   	 Set<Integer> outputSet = new HashSet<Integer>(Arrays.asList(a));
   	 System.out.println(outputSet.size());
   	 sc.close();
    }
}
