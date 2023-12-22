import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		String s = sc.next();
		String t = sc.next();

		int lcm = lcm(n,m);

		if(!s.substring(0,1).equals(t.substring(0,1))){
			System.out.println(-1);
			return;
		}

		if(lcm==n*m){
			// 互いに疎
			System.out.println(lcm);
			return;
		}
		
		// System.out.println("疎でない");

		boolean allFlag =true;
		for(int i=lcm; i<=n*m; i+=lcm){
			boolean flag=false;
			// System.out.println("i "+i);
			
			List<Integer> nList = new ArrayList<>();
			List<Integer> mList = new ArrayList<>();
			nList.add(1);
			mList.add(1);
			// nMap.put(1, s.substring(0,1));
			// mMap.put(1, t.substring(0,1));
			int nShow = i/n;
			int mShow = i/m;
			// System.out.println(nShow);
			// System.out.println(mShow);
			// System.out.println("mShow");

			for(int j=1; j*nShow<i; j++){
				// System.out.println("key "+ (nShow*j+1));
				if(nShow*j+1>=i){
					break;
				}
				// System.out.println("value "+s.substring(nShow*j,nShow*j+1));
				nList.add(nShow*j+1);
			}

			for(int k=1; k*mShow<i; k++){
				if(mShow*k+1>=i){
					break;
				}
				// mMap.put(mShow*k+1, s.substring(mShow*k, mShow*k+1));
				mList.add(mShow*k+1);
			}
			
			// System.out.println(nList);
			// System.out.println(mList);

				for(int e:nList){
					if(mList.contains(e)){
						int mIndex= mList.indexOf(e);
						int nIndex= nList.indexOf(e);
						// System.out.println("contain "+e);
						// System.out.println("index n  "+nList.indexOf(e)+s.substring(nIndex,nIndex+1));
						// System.out.println("index m  "+mList.indexOf(e) + t.substring(mIndex,mIndex+1));
						

						if(!s.substring(nIndex,nIndex+1).equals(t.substring(mIndex,mIndex+1))){
							flag=true;
							// System.out.println("fault ");
							break;
						}
					}
				}

				if(flag){
					continue;
				}else{
					allFlag =false;
					System.out.println(i);
					break;
				}


			// for(Map.Entry<Integer, String> entry : nShow.entrySet()) {
			// 	System.out.println(entry.getKey());
			// 	System.out.println(entry.getValue());
			// }


		}
		if(allFlag){
			System.out.println(-1);
		}


		

	}

	private static int lcm(int m, int n) {
		return m * n / gcd(m, n);
	}

	private static int gcd(int m, int n) {
		if(m < n) return gcd(n, m);
		if(n == 0) return m;
		return gcd(n, m % n);
	}

}