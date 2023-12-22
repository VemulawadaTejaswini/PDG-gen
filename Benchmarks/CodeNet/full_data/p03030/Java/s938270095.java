import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] s=new String[n];
		int[] p=new int[n];
		String[] sp=new String[n];
		for(int i=0;i<n;i++){
			s[i]=sc.next();
			p[i]=sc.nextInt();
			sp[i]=s[i]+"_"+(1100-p[i])+"_"+(i+1);
		}
		
		Arrays.sort(sp);

		for(String k:sp){
			String ans=k.split("_")[2];
			System.out.println(ans);
		}

	}
}