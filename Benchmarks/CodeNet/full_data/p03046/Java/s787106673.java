import java.util.*;
public class Main {

	public static void main(String[] args) {
//		list = new ArrayList<>();
//		int m = 4;
//		for(int i = 0; i < m; i++){
//			list.add(i); list.add(i);
//		}
//		counter = 0;
//		curr = new ArrayList<>();
//		use = new boolean[2*m];
//		printall(2*m, 2*m);
		
		Scanner seer = new Scanner(System.in);
		int m = seer.nextInt();
		int k = seer.nextInt();
		if(m == 0){
			if(k == 0){
				System.out.println("0 0");
			}
			else{
				System.out.println(-1);
			}
		}
		else if(m == 1){
			if(k == 0){
				System.out.println("1 0 0 1");
			}
			else{
				System.out.println(-1);
			}
		}
		else{
			int p = (int)Math.pow(2, m);
			if(k == 0){
				StringBuilder sb = new StringBuilder();
				for(int i = 0; i < p; i++){
					sb.append(i+" "+i+" ");
				}
				System.out.println(sb.toString().trim());
			}
			else if(k < p){
				StringBuilder sb = new StringBuilder();
				sb.append("0 "); sb.append(k+" "); sb.append("0 ");
				for(int i = 1; i < p; i++){
					if(i != k){
						sb.append(i+" ");
					}
				}
				sb.append(k+" ");
				for(int i = p-1; i >= 1; i--){
					if(i != k){
						sb.append(i+" ");
					}
				}
				System.out.println(sb.toString().trim());
			}
			else{
				System.out.println(-1);
			}
		}
	}
//	static int target = 2;
//	static int counter;
//	static ArrayList<Integer> curr;
//	static boolean[] use;
//	static ArrayList<Integer> list;
//	static void printall(int iter, int n){
//		if(iter == 0) {
//			counter++;
//			HashSet<Integer> set = ks(curr, n);
//			if(set.size() == 1 && set.contains((Integer) target)){
//				System.out.println(counter);
//				System.out.println(curr);
//				System.out.println(ks(curr, n));	
//			}
//		}
//		else{
//			for(int i = 0; i < n; i++){
//				if(!use[i]){
//					curr.add(list.get(i));
//					use[i] = true;
//					printall(iter-1, n);
//					curr.remove(curr.size()-1);
//					use[i] = false;
//				}
//			}
//		}
//	}
//	static HashSet<Integer> ks(ArrayList<Integer> list, int n){
//		HashSet<Integer> res = new HashSet<>();
//		for(int i = 0; i < n; i++){
//			for(int j = i+1; j < n; j++){
//				if(list.get(i) == list.get(j)){
//					int s = 0;
//					for(int k = i; k <= j; k++){
//						s ^= list.get(k);
//					}
//					res.add(s);
//				}
//			}
//		}
//		return res;
//	}

}
