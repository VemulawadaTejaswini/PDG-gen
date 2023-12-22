import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        ArrayList<Integer> a = new ArrayList<>();

        for(int i=0; i<n; i++){
        	a.add(Integer.parseInt(sc.next()));
        }

        ArrayList<Integer> a1 = new ArrayList<>(a);
        ArrayList<Integer> a2 = new ArrayList<>(a);

        int ans1 = 0;
        for(int i=0; i<n; i++){
        	if (i%2 == 0){
        		int b = Math.max(1 - a1.subList(0, i+1).stream().mapToInt(Integer::intValue).sum(), 0);
        		a1.set(i, a1.get(i) + b);
        		ans1 += b;
        	}else {
        		int b = Math.max(a1.subList(0, i+1).stream().mapToInt(Integer::intValue).sum() + 1, 0);
        		a1.set(i, a1.get(i) - b);
        		ans1 += b;
        	}
        }

        int ans2 = 0;
        for(int i=0; i<n; i++){
        	if (i%2 == 0){
        		int b = Math.max(a2.subList(0, i+1).stream().mapToInt(Integer::intValue).sum() + 1, 0);
        		a2.set(i, a2.get(i) - b);
        		ans2 += b;
        	}else {
        		int b = Math.max(1 - a2.subList(0, i+1).stream().mapToInt(Integer::intValue).sum(), 0);
        		a2.set(i, a2.get(i) + b);
        		ans2 += b;
        	}
        }
        System.out.println(Math.min(ans1, ans2));
    }
}
