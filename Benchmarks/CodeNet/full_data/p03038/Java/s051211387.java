import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] li = new long[n];
        for(int i = 0; i < n; i++){
            li[i] = sc.nextLong();
        }
        Arrays.sort(li);
        Change[] changes = new Change[m];
        for(int i = 0; i < m; i++){
            int count = sc.nextInt();
            long diff = sc.nextLong();
            changes[i] = new Change(count,diff);
        }
        Arrays.sort(changes);
        long ans = 0;
		int j = 0;
		for (int i = 0; i < n; i++) {
			if (j >= m || li[i] >= changes[j].diff) {
				ans += li[i];
			} else {
				ans += changes[j].diff;
				changes[j].count--;
				if (changes[j].count == 0) {
					j++;
				}
			}
		}
		System.out.println(ans);
    }
}

class Change implements Comparable<Change>{
    int count;
    long diff;
    public Change(int c, long d){
        this.count = c;
        this.diff = d;
    }
    public int compareTo(Change c){
        if(this.diff < c.diff){
            return 1;
        }else if(this.diff > c.diff){
            return -1;
        }
        return 0;
    }
}

