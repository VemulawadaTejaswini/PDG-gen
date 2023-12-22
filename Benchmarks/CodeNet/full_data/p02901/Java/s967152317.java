import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		Boolean[] box=new Boolean[N];
		for(int i=0;i<N;i++) {
			box[i]=false;
		}
		ArrayList<Key> keys=new ArrayList<Key>();
		for(int i=0;i<M;i++) {
			int pay=sc.nextInt();
			Key k=new Key(pay);
			int kazu=sc.nextInt();
			for(int j=0;j<kazu;j++) {
				int takara=sc.nextInt();
				k.add(takara);
			}
			keys.add(k);
		}
		Collections.sort(keys,new KeyCompare());
		int sum=0;
		for(Key k:keys) {
			Boolean tmp=false;
			for(int a:k.a) {
				int b=a-1;
				if(!box[b]) {
					tmp=true;
					box[b]=true;
				}
			}
			if(tmp) {
				sum+=k.Pay;
			}
		}
		for(int i=0;i<N;i++) {
			if(!box[i]) {
				System.out.println(-1);
				return;
			}
		}
		System.out.println(sum);
	}
	static class Key {
		int Pay;
		ArrayList<Integer> a;
		Key(int pay){
			a=new ArrayList<Integer>();
			Pay=pay;
		}
		void add(int i) {
			a.add(i);
		}
	}
	static class KeyCompare implements Comparator<Key>{
		@Override
		public int compare(Key k1,Key k2) {
			return k1.Pay<k2.Pay ? -1:1;
		}
	}
}