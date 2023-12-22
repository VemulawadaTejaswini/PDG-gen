import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{

	public static void solve(int[] h,int a,int b){
		int max = 0;
		int index = 0;
		boolean flag = true;
		long count = 0;
		while(flag){
			flag = false;
			max = 0;
			for(int i = 0;i < h.length;i++){
				if(max < h[i]){
					max = h[i];
					index = i;
				}
			}
			h[index] -= a;
			for(int i = 0;i < h.length;i++){
				if(i != index){
					h[i] -= b;
				}
				if(h[i] >= 1){
					flag = true;
				}
			}
			count += 1;
			
		}
		System.out.println(count);

	}




	public static void main(String[] args) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String[] input = br.readLine().split(" ");
       int n = Integer.parseInt(input[0]);
       int a = Integer.parseInt(input[1]);
       int b = Integer.parseInt(input[2]);
       int[] h = new int[n];
       for(int i = 0;i < n;i++){
       	h[i] = Integer.parseInt(br.readLine());
       }
       solve(h,a,b);
    }

}