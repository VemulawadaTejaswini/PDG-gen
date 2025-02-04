import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{

	public static long solve(long x,long y){
		long menseki = x * y;
		long s1 = menseki;
		long s2 = 0;
		long s3 = 0;
		long result = 0;
		for(int i = 0;i < x;i++){
			s1 = (x - i) * y;
			s2 = i * (y / 2);
			s3 = menseki - s1 - s2;
			long smax = Math.max(s1,s2);
			smax = Math.max(s3,smax);
			long smin = Math.min(s1,s2);
			smin = Math.min(s3,smin);
			if(i == 0){
				result = smax - smin;
			}else{
				result = Math.min(result,smax - smin);
			}
		}
		for(int i = 0;i < y;i++){
			s1 = x * (y - i);
			s2 = (x / 2) * i;
			s3 = menseki - s1 - s2;
			long smax = Math.max(s1,s2);
			smax = Math.max(s3,smax);
			long smin = Math.min(s1,s2);
			smin = Math.min(s3,smin);
			result = Math.min(result,smax - smin);
		}
		return result;

	}

	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        long x = Long.parseLong(input[0]);
        long y = Long.parseLong(input[1]);
        System.out.println(solve(x,y));

    }

}