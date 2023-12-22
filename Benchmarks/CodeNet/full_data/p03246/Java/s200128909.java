import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;

import org.omg.Messaging.SyncScopeHelper;

public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		new Main();
	}
	public Main(){
		new ARC103_C().doIt();
	}
	class ARC103_C{
		void doIt() {
			int n = sc.nextInt();
			int va[] = new int[100001];
			int vb[] = new int[100001];
			for(int i = 0;i < n;i++) {
				int v = sc.nextInt();
				if(i % 2 == 0)va[v]++;
				else vb[v]++;
			}
			int maxa = 0;
			int numa = 0;
			int maxb = 0;
			int numb = 0;
			for(int i = 0;i < 100001;i++) {
				if(va[i] > maxa) {
					maxa = va[i];
					numa = i;
				}
				if(vb[i] > maxb) {
					maxb = vb[i];
					numb = i;
				}
			}
			if(numa == numb) {
				if(maxa < maxb) {
					Arrays.sort(va);
					maxa = va[99999];
				}
				else{
					Arrays.sort(vb);
					maxb = vb[99999];
				}
			}
			int ans = n - maxa - maxb;
			System.out.println(ans);
		}
	}
}
