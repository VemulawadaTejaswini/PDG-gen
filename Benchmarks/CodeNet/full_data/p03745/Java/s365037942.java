import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException {

		try(BufferedReader kb = new BufferedReader(new InputStreamReader(System.in))){
			for (String in = kb.readLine(); in!=null; in=kb.readLine()) {
				int n= Integer.parseInt(in);
				in = kb.readLine();
				int[] arr = new int[n];
				StringTokenizer st= new StringTokenizer(in);
				for (int i = 0; i < n; i++) {
					arr[i]= Integer.parseInt(st.nextToken().trim());
				}
				System.out.println(solve(arr));
				
			}
		}
	}

	 static int solve(int[] arr) {
		 int grupos = 0;
		 if(arr.length<3)
			 return 1;
		 boolean mx = false, mn = false;

//		 if(arr[0]<arr[1])
//			 mx=true;
			 
		 for (int i = 0; i < arr.length-1; i++) {
			 if(arr[i]<arr[i+1]&&!mn){
				 mx=true;
			 }
			 else if(arr[i]>arr[i+1]&&!mx){
				 mn=true;
			 }
			 else if(arr[i]<arr[i+1]&&mn){
				 grupos++;
				 mx=false;
				 mn=false;
			 }
			 else if(arr[i]>arr[i+1]&&mx){
				 grupos++;
				 mn=false;
				 mx=false;
				 if(i+1==arr.length-1)
					 grupos++;
			 }
		}
		 if(mn||mx)
			 return grupos+1;
		return grupos;
		
	}

}