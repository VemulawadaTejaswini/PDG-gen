import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
 
class Main {
	long[] num;
	int n;
	ArrayList<Integer> list;
	int s;
	ArrayList<Long> sum;

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Main m = new Main(sc);		
		sc.close();
		m.run();
	}
	Main(Scanner sc){
		list = new ArrayList<Integer>();
		sum = new ArrayList<Long>();
		
		n = sc.nextInt();
		s = n / 2;
		num = new long[s];

		for(int i=0;i<n;i++){
			list.add(sc.nextInt());
		}
	}
	void run(){
		for(int i=0;i <= n-(2*s-1);i++){
			check(1,i);
		}
		Collections.sort(sum,Collections.reverseOrder());
		System.out.println(sum.get(0));
	}
	void check(int cnt,int no){
		num[cnt-1]=list.get(no);
		System.out.println(cnt+" "+no);
		if(cnt == s){
			long j = 0;
			for(long i:num){j += i;}
			sum.add(j);
		} else {
			for(int i=no+2;i <= n-(2*(s-cnt)-1);i++){
				check(cnt+1,i);
			}
		}
	}
}
