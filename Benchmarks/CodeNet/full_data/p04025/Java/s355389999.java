import java.io.*;
public class Main
{
	public static void main(String args[])
    {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			
		
			String[] str = br.readLine().split(" ");
			int num[] = new int[n];
			int ave = 0;

			for(int i=0;i<n;i++){
				num[i]=Integer.parseInt(str[i]);
				ave+=num[i];
			}
			
			double ave2 = (double)(ave)/n;
			int ave3 = (int)Math.round(ave2);
			int cost=0;

			for(int i=0;i<n;i++){
				double buf = ave2 - num[i];
				if(buf <= 0.5 && -0.5 <= buf){
				}else{
					cost+=Math.pow((num[i]-ave3),2);
				}
			}

			System.out.println(cost);
		} catch (Exception e) {
			// System.out.println(e);
        }
	}
}
