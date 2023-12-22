
import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException {
		try(BufferedReader kb= new BufferedReader(new InputStreamReader(System.in))){
			StringTokenizer st = new StringTokenizer(kb.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			boolean[] rojo = new boolean[n];
			long[] box = new long[n];
			for (int i = 0; i < box.length; i++) {
				box[i]=1;
			}
			rojo[0] = true;
			for (int i = 0; i < m; i++) {
				st = new StringTokenizer(kb.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				if(box[x-1]!=0){
					box[y-1]++;
					box[x-1]--;
				}
				if(rojo[x-1]==true)
					rojo[y-1]=true;
				if(box[x-1]==0)
					rojo[x-1]=false;
					
			}
			int cont=0;
			for (int i = 0; i < box.length; i++) {
				if(box[i]!=0&&rojo[i]==true)
					cont++;
			}
			
			System.out.println(cont);





		}
	}
}