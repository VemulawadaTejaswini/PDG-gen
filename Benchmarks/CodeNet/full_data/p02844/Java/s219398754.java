import java.util.HashMap;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		String S=stdIn.next();
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		int ans=0;
		for(int i=0;i<N;i++){
			for(int j=i+1;j<N;j++){
				for(int k=j+1;k<N;k++){
					String a=S.substring(i,i+1);
					String b=S.substring(j,j+1);
					String c=S.substring(k,k+1);
					a=a+b+c;
					if(map.containsKey(a)==false){
						ans++;
						map.put(a,1);
					}
				}
			}
		}
		System.out.println(ans);
	}
}
