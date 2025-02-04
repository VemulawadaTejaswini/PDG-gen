import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //int K = sc.nextInt();
        int[]a = new int[N];
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        int sum = 0; 
        for(int i=0; i<N; i++) {
        	treeSet.add(sc.nextInt());
        	sum += a[i];
        }
        sc.close();
         
        double ave = (double)sum/N;
        double minGap = Math.abs(ave-a[0]);
        int minIndex = 0;
        for(int i=0; i<N; i++) {
        	if (minGap > Math.abs(ave-a[i])) {
        		minGap = Math.abs(ave-a[i]);
        		minIndex = i;
        	}
        } 
        System.out.println(minIndex);
    }
}