import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long pt = 1;
		long pa = 1;
		
		
		for(int i = 0 ; i < n ; i++ ){
			String[] strs = br.readLine().split(" ");
			long nt = (long)Integer.parseInt(strs[0]);
			long na = (long)Integer.parseInt(strs[1]);
			long addt = 0;
			long adda = 0;
			
			while(true){
				if(nt * (pa+adda) == na * (pt+addt)){
					break;
				}
				if(nt * (pa+adda) > na * (pt+addt)){
					addt++;
				}
				if(nt * (pa+adda) < na * (pt+addt)){
					adda++;
				}
				
			}
			pt = pt+addt;
			pa = pa+adda;
		}
		
		System.out.println(pt+pa);
	}
}
