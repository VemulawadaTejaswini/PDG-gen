import java.util.Scanner;
import java.util.*;
 
public class Main {
	public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            int k = scn.nextInt();
            scn.nextLine();
            long total = 0;
            if(n>k) {
                List<Long> listH = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    listH.add(scn.nextLong());
                }
                listH.sort(Collections.reverseOrder());
                if (k > 0) {
                    listH.subList(0, k).clear();
                }
                for(long l:listH){
                    total = total + l;
                }
            }
            System.out.println(total);
        }
	}
	
}
