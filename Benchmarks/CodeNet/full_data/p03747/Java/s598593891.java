import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		
		

		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int l = sc.nextInt();
		int t = sc.nextInt();

		int[] x = new int[n];
		int[] w = new int[n];

		for(int i=0;i<n;i++) {
			x[i] =  sc.nextInt();
			w[i] =  sc.nextInt();
		}

		int[] y = new int[n];
		
		
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0;i<n;i++) {
			if(w[i]==1) {
				y[i] = location(l,x[i]+t);
			}else {
				y[i] = location(l,x[i]-t);
			}
			list.add(y[i]);
		}
		int firstIndex = y[0];
		Collections.sort(list);
		
		int counter =0;
		
		if(w[0]==1) {
			for(int i = 1;i<n;i++) {
				if(w[i]==2) {
					if(t*2-(x[i]-x[0])<0) {
						
					}else {
						counter+=(t*2-(x[i]-x[0]))/l+1;
					}
				}
			}
			counter = (counter+1)%n;
			if(counter ==0)counter =n;
			
		}else {
			for(int i = n-1;i>0;i--) {
				if(w[i]==1) {
					if(t*2-(x[0]+l-x[i])<0) {
						
					}else {
						counter+=(t*2-(x[0]+l-x[i]))/l+1;
					}
				}
			}
			counter = (1-counter);
			while(counter<1) {
				counter+=n;
			}
			counter = counter%n;
			if(counter ==0)counter =n;
		}
		
		for(int i =1;i<n+1;i++) {
			int listindex = list.indexOf(firstIndex)-counter+i;
			if(listindex<0) {
				listindex+=n;
			}
			if(listindex>=n) {
				listindex-=n;
			}
			System.out.println(list.get(listindex));
		}
		
	

		/*
		TreeMap<Integer,Integer> treeMap = new TreeMap<>();//sorted no duplication
		treeMap.put(b[n], n);
		*/

	}
	
	static int location(int length,long value) {
		
		int loc = (int) (value%length);
		if(loc<0)loc+=length;
		
		return loc;
	}

}
/*
class City{
	int order;
	int prefecture;
	int year;
	int number;
	City(int order,int prefecture, int year){
		this.order = order;
		this.prefecture = prefecture;
		this.year = year;
	}
}
*/
