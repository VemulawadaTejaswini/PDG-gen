import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean high=false;
		boolean low=false;
		int zero=0;
		long sum=0;
		ArrayList<Integer> llist=new ArrayList<>();
		ArrayList<Integer> hlist=new ArrayList<>();
		for(int i=0; i<n; i++){
			int a=sc.nextInt();
			sum+=Math.abs(a);
			if(a>0){
				hlist.add(a);
				high=true;
			}else if(a<0){
				llist.add(a);
				low=true;
			}else{
				zero++;
			}
		}
		if(sum==0){
			System.out.println(sum);
			for(int i=1; i<zero; i++){
				System.out.println("0"+" "+"0");
			}
			return;
		}
		int cl=0;
		int ch=0;
		String s="";
		if(!(high && low)){
			if(zero>0){
				if(low){
					hlist.add(-llist.get(cl++));
					s="0 "+String.valueOf(llist.get(0));
					zero--;
				}else{
					llist.add(-hlist.get(ch++));
					s="0 "+String.valueOf(hlist.get(0));
					zero--;
				}
			}else{
			if(low){
				Collections.reverse(llist);
				hlist.add(llist.get(0)-llist.get(1));
				cl+=2;
				sum+=2*llist.get(0);
				s=String.valueOf(llist.get(0))+" "+String.valueOf(llist.get(1));
			}else{
				Collections.sort(hlist);
				llist.add(hlist.get(0)-hlist.get(1));
				ch+=2;
				sum-=2*hlist.get(0);
				s=String.valueOf(hlist.get(0))+" "+String.valueOf(hlist.get(1));
			}
			}
		}
		int ii=0;
		int jj=0;
		System.out.println(sum);
		if(!s.equals("")){
			System.out.println(s);
		}
		int lsize=llist.size();
			while(lsize>cl+1){
				ii=hlist.get(ch++);
				jj=llist.get(cl++);
				hlist.add(ii-jj);
				System.out.println(ii+" "+jj);
			}
		int hsize=hlist.size();
			while(hsize>ch+1){
				 ii=llist.get(cl++);
				 jj=hlist.get(ch++);
				llist.add(ii-jj);
				System.out.println(ii+" "+jj);
			}
			System.out.println(hlist.get(ch)+" "+llist.get(cl));
		for(int i=0; i<zero; i++){
			System.out.println(sum+" "+0);
		}
	}
}
