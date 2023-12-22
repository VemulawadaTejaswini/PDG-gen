import java.util.*;
import java.util.stream.Collectors;
public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        List<Integer> list = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
        	list.add(sc.nextInt());
        }
        
        list = list.stream().sorted().collect(Collectors.toList());
        
        int ans = 0;
        for (int i = 0; i < list.size(); i++) {
        	for (int j = i+1; j < list.size(); j++) {
        		for (int k = j+1; k < list.size(); k++) {
        			int a = list.get(i);
        			int b = list.get(j);
        			int c = list.get(k);
        			
        			if (a == 0 || b == 0 || c == 0) {
        				continue;
        			}
        			
        			if (a <= A && A+1 <= b && b <= B && B+1 <= c) {
        				list.set(i, 0);
        				list.set(j, 0);
        				list.set(k, 0);
        				ans++;
        			}
        		}
        	}
        }
        
        System.out.println(ans);
    }
}