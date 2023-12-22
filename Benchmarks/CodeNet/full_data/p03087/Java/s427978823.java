import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		String s = sc.next();
		int[][] l = new int[q][3];
		int[] ans = new int[q];
		String ac = "AC";
		for(int i = 0; i < q; i++){
			l[i][0] = sc.nextInt()-1;
			l[i][1] = sc.nextInt()-1;
			l[i][2] = i;
		}
		Arrays.sort(l,(b,c) -> Integer.compare(b[0],c[0]));
		ArrayList<Integer> todo = new ArrayList<Integer>();
		s = s + "qq";
		int todoidx = 0;
		for(int i = 0; i < n; i++){
			while(todoidx < q){
				if(l[todoidx][0] == i){
					todo.add(todoidx);
					todoidx++;
				}else{
					break;
				}
			}
			for(int j = 0; j < todo.size(); j++){
				if(l[todo.get(j)][1] == i){
					todo.remove(j);
					j--;
				}
			}
			if(ac.equals(s.substring(i,i+2))){
				if(!todo.isEmpty()){
					for(int j = 0; j < todo.size(); j++){
						ans[todo.get(j)]++;
					}
				}
			}
		}
		for(int i = 0; i < q; i++){
			System.out.println(ans[l[i][2]]);
		}
	}
}
