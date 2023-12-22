import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{

	public static boolean solve(int[] g,int x){
		int left = 0;
		int right = g.length;
		while(left < right){
			int mid = (left + right) / 2;
			if(g[mid] == x){
				return true;
			}else if(g[mid] > x){
				right = mid;
			}else{
				left = mid + 1;
			}
		}
		return false;
	}

	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int[] g1 = {1,3,5,7,8,10,12};
        int[] g2 = {4,6,9,11};
        int[] g3 = {2};
        if((solve(g1,x) && solve(g1,y)) || (solve(g2,x) && solve(g2,y))||(solve(g3,x) && solve(g3,y))){
        	System.out.println("Yes");
        }else{
        	System.out.println("No");
        }

    }

}