import java.util.*;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main{
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s=sc.next();
		String t=sc.next();
		int[] sb=new int[s.length()+1];
		int[] tb=new int[t.length()+1];
		for(int i=1; i<=s.length(); i++){
			if(s.charAt(i-1)=='A'){
				sb[i]=sb[i-1]+2;
			}else{
				sb[i]=sb[i-1]+1;
			}
		}
		for(int i=1; i<=t.length(); i++){
			if(t.charAt(i-1)=='A'){
				tb[i]=tb[i-1]+2;
			}else{
				tb[i]=tb[i-1]+1;
			}
		}
		int q=sc.nextInt();
		PrintWriter p=new PrintWriter(System.out);
		for(int i=0; i<q; i++){
			String[] sa = br.readLine().split(" ");
			int a = Integer.parseInt(sa[0]);
			int b = Integer.parseInt(sa[1]);
			int c = Integer.parseInt(sa[2]);
			int d = Integer.parseInt(sa[3]);
			if((sb[b]-sb[a-1]-(tb[d]-tb[c-1]))%3==0){
				p.println("YES");
			}else{
				p.println("NO");
			}
		}
		p.flush();
	}
}
