import java.util.ArrayList;
import java.util.Scanner;
public class Main_sort {

	static int u,v,w;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer[] color = new Integer[n+1];
		ArrayList<Integer[]> al = new ArrayList<Integer[]>();
		color[1]=0;
		
		for(int i=0;i<n-1;i++) {
			u = sc.nextInt();
			v = sc.nextInt();
			w = sc.nextInt();
			int index=0;
			if(al.isEmpty()) {
				al.add(setInt());
				continue;
			}
			for(Integer[] in : al) {
				if(in[0] > u) {
					al.add(index,setInt());
					break;
				}
				index++;
			}
			if(index==al.size()) {
				al.add(setInt());
			}
		}
		
//		for(Integer[] branch : al) {
		for(int j=0;j<al.size();j++) {
			Integer[] branch = al.get(j);
			if(color[branch[1]] == null && color[branch[0]] == null) {
				al.add(branch);
				continue;
			}
			if(branch[2]%2==0) {
				//Even
				if(color[branch[0]] != null) {
					color[branch[1]] = color[branch[0]];
				}else {
					color[branch[0]] = color[branch[1]];
				}
			}else {
				//Odd
				if(color[branch[0]] != null) {
					color[branch[1]] = color[branch[0]] == 0 ? 1 : 0;
				}else {
					color[branch[0]] = color[branch[1]] == 0 ? 1 : 0;
				}
			}
		}
		
		sc.close();
		for(int i=1;i<n+1;i++) {
			System.out.println(color[i]);
		}

	}
	
	public static Integer[] setInt() {
		Integer[] re = new Integer[3];
		re[0] = Math.min(u, v);
		re[1] = Math.max(u, v);
		re[2] = w;
		return re;
	}

}
