import java.util.HashMap;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		String S=stdIn.next();
		HashMap<String,Integer> code=new HashMap<String,Integer>();
		int ans=0;
		for(int i=0;i<N-2;i++){
			for(int j=i+1;j<N-1;j++){
				for(int k=j+1;k<N;k++){
					String a=S.substring(i,i+1)+S.substring(j,j+1)+S.substring(k,k+1);
					if(code.containsKey(a)==false){
						ans++;code.put(a,1);
					}
				}
			}
		}
		System.out.println(ans);
	}
}
