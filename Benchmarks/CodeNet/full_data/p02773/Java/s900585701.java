import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//public class atcoder0216_C{
public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		List<String> S = new ArrayList<String>();
		List<String> I = new ArrayList<String>();
		List<Integer> C = new ArrayList<Integer>();

		int N = scan.nextInt();
		for(int i=0;i<N;i++) {
			S.add(scan.next());
		}

		Collections.sort(S);

		int j = 0;
		boolean flag = false;
		I.add(S.get(0));

		for(int i =1; i<N; i++) {
			if(S.get(i).equals(S.get(i-1))) {
				flag = true;
				j++;
				if(i==N-1) {
					C.add(j);
				}
			}else if((S.get(i).equals(S.get(i-1)))==false){
				I.add(S.get(i));
				C.add(j);
				j =0;
			}
		}

		if(!flag) {
			C.add(j);
		}

		int x = 0;
		int y = 0;
		List<Integer> max = new ArrayList<Integer>();
		List<String> result = new ArrayList<String>();

		for(int count:C) {
			if(x==0) {
				max.add(C.get(0));
				result.add(I.get(0));
			}else {
				if(max.get(y)==count) {
					result.add(I.get(x));
				}else if(max.get(y)<count) {
					max.clear();
					result.clear();
					max.add(C.get(x));
					result.add(I.get(x));
				}
			}
			x++;
		}

		for(String view:result) {
			System.out.println(view);
		}
		//		}
	}
}

