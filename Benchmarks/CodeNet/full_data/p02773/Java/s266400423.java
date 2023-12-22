import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		String s[]=new String[N];
		String ans[]=new String[N];
		int max=0,k=0,l=0;
		for(int i=0;i<N;i++){
			String S=stdIn.next();
			int a=0;
			if(map.containsKey(S)){
				a=map.get(S);a++;
				map.put(S,a);
				if(a>max)
					max=a;
			}
			else{
				map.put(S,1);
				if(1>max)
					max=1;
				s[k]=S;k++;
			}
		}
		for(int i=0;i<N;i++){
			if(i<k&&map.get(s[i])==max){
				ans[i]=s[i];l++;
			}
			else
				ans[i]="zzzzzzzzzzz";
		}
		Arrays.sort(ans);
		for(int i=0;i<l;i++){
			System.out.println(ans[i]);
		}
	}
}
