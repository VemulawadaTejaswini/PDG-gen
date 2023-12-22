import java.util.*;

class Main3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		ArrayList<Integer> plist = new ArrayList<Integer>();
		ArrayList<Integer> mlist = new ArrayList<Integer>();
		for(int i = 0; i < n ; i++){
			int x = sc.nextInt();
			if(x >= 0){
				plist.add(x);
			}else{
				mlist.add(x);
			}
		}
		Collections.sort(plist);
		Collections.sort(mlist);
		Collections.reverse(mlist);
		int ansa = 0;
		if(plist.isEmpty()){
			ansa = Math.abs(mlist.get(k-1));
		}else if(mlist.isEmpty()){
			ansa = plist.get(k-1);
		}else{
			int ansb = 0;
			int phoz = 1000000000;
			int mhoz = 1000000000;
			if(plist.size() >= k){
				phoz = plist.get(k-1);
			}
			if(mlist.size() >= k){
				mhoz = mlist.get(k-1);
			}
			for(int i = 0; i < k; i++){
				if(plist.isEmpty()){
					ansb = Math.abs(mlist.get(0));
					mlist.remove(0);
				}else if(mlist.isEmpty()){
					ansa = plist.get(0);
					plist.remove(0);
				}else{
					if(plist.get(0) <= Math.abs(mlist.get(0))){
						ansa = plist.get(0);
						plist.remove(0);
					}else{
						ansb = Math.abs(mlist.get(0));
						mlist.remove(0);
					}
				}
			}
			ansa = Math.min(ansa,ansb)*2+Math.max(ansa,ansb);
			ansa = Math.min(ansa,phoz);
			ansa = Math.min(ansa,mhoz);
		}
		System.out.print(ansa);
	}
}
