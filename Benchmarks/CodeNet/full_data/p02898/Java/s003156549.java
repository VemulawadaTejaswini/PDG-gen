import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        
        for (int i=0; i<n; i++) {
            int x=sc.nextInt();
            if (x>=k) {
                count+=1;
            }
        }
        
        System.out.println(count);
}
}