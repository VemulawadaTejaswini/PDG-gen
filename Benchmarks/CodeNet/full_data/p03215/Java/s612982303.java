import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] a = new int[N];
		for(int i = 0;i < N;++i)
			a[i] = sc.nextInt();
		sc.close();
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0;i < N;++i) {
			for(int j = 1;j <= N-i;++j) {
				int num = 0;
				for(int k = i;k < i+j;++k)
					num += a[k];
				list.add(num);
			}
		}
		
		int ans = 0;
		int[] loop = new int[K];
		for(int i = 1;i < loop.length;++i)
			loop[i] = loop[i-1]+1;
		while(true) {
			int num = list.get(loop[0]);
			for(int i = 1;i < loop.length;++i) {
				int cap = list.get(loop[i]);
				num = (num & cap);
			}
			if(ans < num)
				ans = num;
						
			boolean flag = true;
			for(int i = 0;i < loop.length;++i) {
				if(loop[i] != list.size()-(K-i))
					flag = false;
			}
			if(flag)break;
			
			boolean flag2 = true;
			for(int i = loop.length-1;i >= 1;--i) {
				if(loop[i] == list.size()-(K-i)) {
					loop[i-1]++;
					loop[i] = -1;
					if(i == loop.length-1)
						flag2 = false;
				}
			}
			if(flag2)
				loop[loop.length-1]++;
			else {
				for(int i = 0;i < loop.length;++i)
					if(loop[i] == -1)
						loop[i] = loop[i-1]+1;
			}
		}
		
		System.out.println(ans);
	}
}
