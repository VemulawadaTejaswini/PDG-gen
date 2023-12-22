import java.util.*;
public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		ArrayList<Integer> n= new ArrayList<Integer>();
		for (int i=0 ; i<N ; i++ ){
			int v = sc.nextInt();
			n.add(v);
			}
		int ans = 0;
		for (int i=0 ; i<N ; i++){
			ArrayList<Integer> n_copy = (ArrayList<Integer>) n.clone();
			n_copy.remove(i);
			int multi = multigcd(n_copy);
			if(ans < multi){
				ans = multi;
			}
		}
		System.out.println(ans);
	}


	public static int gcd(int a,int b){
		if(b==0) return a;
		else {
			int c = a%b;
			return gcd(b,c);
		}
	}

	public static int multigcd(ArrayList x){
		if(x.size()==1)
			return (Integer)x.get(0);
		else{
			int element = gcd((Integer)x.get(0),(Integer)x.get(1));
			for (int i=2;i<x.size();i++){
				element = gcd(element,(Integer)x.get(i));
			}
			return element;
		}
	}

}