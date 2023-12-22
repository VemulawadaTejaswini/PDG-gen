import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		long h = sc.nextLong();
		long count=0;
		ArrayList<Long> ab=new ArrayList<Long>();
		ArrayList<Long> b1=new ArrayList<Long>();
		for(int i = 0; i<n; i++){
			long a = sc.nextLong();
			long b = sc.nextLong();
			ab.add(a);
			ab.add(b);
			b1.add(b);
		}
		Collections.sort(ab);
		long t = 0;
		while(h>0){
			if(t==0){
				if(b1.contains(ab.get(ab.size()-1))){
					b1.remove(b1.indexOf(ab.get(ab.size()-1)));
					h-=ab.remove(ab.size()-1);
				}else{
					t=ab.get(ab.size()-1);
				}
			}
			h-=t;
			count++;
		}
		System.out.println(count);
	}
}