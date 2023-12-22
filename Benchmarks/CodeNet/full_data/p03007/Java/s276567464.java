import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a =new int[n];
		boolean high=false;
		boolean low=false;
		boolean zero=false;
		long sum=0;
		ArrayList<Integer> llist=new ArrayList<>();
		ArrayList<Integer> hlist=new ArrayList<>();
		int zcount=0;
		for(int i=0; i<n; i++){
			a[i]=sc.nextInt();
			if(a[i]>0){
				sum+=a[i];
				high=true;
				hlist.add(a[i]);
			}else if(a[i]<0){
				sum+=-a[i];
				low=true;
				llist.add(a[i]);
			}else{
				zero=true;
				zcount++;
			}
		}
		if(zero || (high && low)){
			System.out.println(sum);
			int k=0;
			int mai=0;
			if(zero && !high && n-zcount>1 && low){
				System.out.println(0+" "+llist.get(0));
				hlist.add(-llist.remove(0));
				zcount--;
				k=hlist.get(0);
			}else if(zero && !low && n-zcount>1 && high){
				System.out.println(0+" "+hlist.get(0));
				llist.add(-hlist.remove(0));
				zcount--;
				k=hlist.get(0);
			}else if(n-zcount<=1){
				zcount--;
			}
			while(zcount>0){
				zcount--;
				System.out.println(k+" "+0);
			}
		}else{
			Arrays.sort(a);
			sum-=a[0]+a[1];
			sum+=Math.abs(a[0]-a[1]);
			System.out.println(sum);
			if(high){
				Collections.sort(hlist);
				llist.add(hlist.get(0)-hlist.get(1));
				System.out.println(hlist.remove(0)+" "+hlist.remove(1));
			}else{
				Collections.sort(llist);
				hlist.add(llist.get(llist.size()-1)-llist.get(llist.size()-2));
				System.out.println(llist.remove(llist.size()-1)+" "+llist.remove(llist.size()-2));
			}
		}
		int ii=0;
		int jj=0;
			while(llist.size()>1 &&hlist.size()>0){
				ii=hlist.remove(0);
				jj=llist.remove(0);
				hlist.add(ii-jj);
				System.out.println(ii+" "+jj);
			}
		
			while(hlist.size()>1 && llist.size()>0){
				 ii=llist.get(0);
				 jj=hlist.get(0);
				llist.add(ii-jj);
				System.out.println(ii+" "+jj);
			}
		if(hlist.size()+llist.size()>1){
			System.out.println(hlist.get(0)+" "+llist.get(0));
		}
			
		
		
	}
}
