import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		long h = sc.nextLong();
		long count=0;
		long sumb=0;
		ArrayList<Long> ab=new ArrayList<Long>();
		ArrayList<Long> b1=new ArrayList<Long>();
		ArrayList<Long> a1=new ArrayList<Long>();
		for(int i = 0; i<n; i++){
			long a = sc.nextLong();
			long b = sc.nextLong();
			ab.add(a);
			ab.add(b);
			b1.add(b);
			a1.add(a);
			sumb+=b;
		}
		long t = 0;
		if(sumb<h){
		Collections.sort(ab);
		
		while(t==0 && h>0){
				if(b1.contains(ab.get(ab.size()-1))){
					b1.remove(b1.indexOf(ab.get(ab.size()-1)));
					h-=ab.remove(ab.size()-1);
				}else{
					t=ab.get(ab.size()-1);
				}
			count++;
		}
		}else{
			Collections.sort(a1);
			h-=sumb;
			count+=b1.size();
			t=a1.get(a1.size()-1);
		}
		if(h>0){
			if(h%t==0){
				count+=h/t-1;
			}else{
				count+=h/t;
			}
		}
		System.out.println(count);
	}
}