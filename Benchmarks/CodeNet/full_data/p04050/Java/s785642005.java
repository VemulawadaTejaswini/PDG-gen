

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	static void solver(){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] a=new int[n];
		ArrayList<Integer> odd=new ArrayList<Integer>();
		ArrayList<Integer> ord=new ArrayList<Integer>();
		for(int i=0;i<m;i++){
			a[i]=sc.nextInt();
			if(a[i]%2!=0){
				odd.add(a[i]);
				ord.add(i);
			}
		}
		if(m==1){
			System.out.println((a[0]-1)+" "+1);
			return;
		}else if(m==2){
			System.out.println((a[0]-1)+" "+2+" "+(a[1]-1));
			return;
		}
		
		if(odd.size()>2){
			System.out.println("Impossible");
			return;
		}else{
			if(ord.size()>0){
				int d=a[0];
				a[0]=odd.get(0);
				a[ord.get(0)]=d;
				if(ord.size()==2){
					d=a[m-1];
					a[m-1]=odd.get(1);
					a[ord.get(1)]=d;
				}
			}
			System.out.print(a[0]-1+" ");
			for(int i=1;i<m-1;i++){
				System.out.print(a[i]+" ");
			}
			System.out.println((a[m-1]-1));
			return;
		}
	}
}
