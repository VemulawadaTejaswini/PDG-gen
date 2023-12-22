import java.util.*;

class Main{
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
			int mz = 0;
			int pz = 0;
			int ansb = 0;
			for(int i = 0; i < k; i++){
				if(plist.isEmpty()){
					ansb = Math.abs(mlist.get(mz));
					mz++;
				}else if(mlist.isEmpty()){
					ansa = plist.get(pz);
					pz++;
				}else{
					if(plist.get(pz) <= Math.abs(mlist.get(mz))){
						ansa = plist.get(pz);
						pz++;
					}else{
						ansb = Math.abs(mlist.get(mz));
						mz++;
					}
				}
			}
			ansa = Math.min(ansa,ansb)*2+Math.max(ansa,ansb);
		}
		System.out.print(ansa);
	}
}
