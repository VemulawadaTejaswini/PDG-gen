import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<Integer> silist = new ArrayList<Integer>();
		TreeMap<Integer,ArrayList<Si>> usi = new TreeMap<Integer,ArrayList<Si>>();
		int[] mae = new int[m];
		for(int i = 0; i < m; i++){
			int p = sc.nextInt();
			int y = sc.nextInt();
			if(!silist.contains(p)){
				silist.add(p);
				usi.put(p,new ArrayList<Si>());
			}
			usi.get(p).add(new Si(i,y));
			mae[i] = p;
		}
		String[] ans = new String[m];
		for(int i : silist){
			Collections.sort(usi.get(i),new Com());
			int k = 1;
			for(Si j : usi.get(i)){
				ans[j.i] = String.format("%06d%06d",mae[j.i],k);
				k++;
			}
		}
		for(int i = 0; i < m; i++){
			System.out.println(ans[i]);
		}
	}
}

class Si{
	int i;
	int y;
	Si(int i,int y){
		this.i = i;
		this.y = y;
	}
}

class Com implements Comparator<Si>{
	public int compare(Si a,Si b){
		int aa = a.y;
		int bb = b.y;
		if(aa > bb){
			return 1;
		}else if(aa == bb){
			return 0;
		}else{
			return -1;
		}
	}
}
