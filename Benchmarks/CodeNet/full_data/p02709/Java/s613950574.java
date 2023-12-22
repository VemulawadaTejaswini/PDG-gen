import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		int num = 998244353;

		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 		int n = Integer.parseInt(bf.readLine());
 		StringTokenizer st = new StringTokenizer(bf.readLine());
 		int left = 1;
 		int right = n;
 		ArrayList<Long> array = new ArrayList<Long>();
 		array.add(0L);
 		for(int i = 0;i<n;i++){
 			array.add(Long.parseLong(st.nextToken()));
 		}
 		long sum = 0;
 		Set<Integer> seen = new HashSet<Integer>();
 		for(int i = 0;i<n;i++){
//	 		String input1 = bf.readLine().trim();
//	 		String input2 = bf.readLine().trim();
 			long max = 0;
 			int maxindex = 0;
 			int leftright = 0;
 			for(int j = 1;j<=n;j++){
 				if (!seen.contains(j)){
	 				long max1 = array.get(j) * Math.abs(j-left);
	 				long max2 = array.get(j) * Math.abs(right-j);
	 				long maxtemp = Math.max(max1,  max2);
	 				if (maxtemp > max || (maxtemp == max && array.get(j) < array.get(maxindex))){
	 					max = maxtemp;
	 					maxindex = j;
	 					if (max1 > max2)
	 						leftright = -1;
	 					else
	 						leftright = 1;
	 				}
 				}
 				
 			}
 			seen.add(maxindex);
 			
	 		sum+= (long)(max);
	 		if (leftright == -1)
	 			left++;
	 		else
	 			right--;
	 		
 		}
 		
 		
 		out.println(sum);
	 		
 		out.close();
 		
 		
 		
 	}
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


