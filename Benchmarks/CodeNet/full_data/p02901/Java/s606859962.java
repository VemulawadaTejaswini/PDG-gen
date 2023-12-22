import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int[] box=new int[N];
		Boolean[] used =new Boolean[M];
		for(int i=0;i<N;i++) {
			box[i]=0;
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
		for(int i=0;i<M;i++) {
			Key k=keys.get(i);
			Boolean tmp=false;
			for(int a:k.a) {
				int b=a-1;
				if(box[b]==0) {
					tmp=true;
					//box[b]=true;
					break;
				}
			}
			if(tmp) {
				for(int a:k.a) {
					int b=a-1;
					box[b]++;
				}
				used[i]=true;
				sum+=k.Pay;
			}else {
				used[i]=false;
			}
		}
		//System.out.println(keys.size());
		for(int i=M-1;i>=0;i--) {
			if(used[i]) {
				Key k=keys.get(i);
				Boolean tmp=true;
				for(int a:k.a) {
					int b=a-1;
					if(box[b]<=1) {
						tmp=false;
						break;
					}
				}
				if(tmp) {
					for(int a:k.a) {
						int b=a-1;
						box[b]--;
					}
					sum-=k.Pay;
				}
			}
		}
		for(int i=0;i<N;i++) {
			if(box[i]==0) {
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
