import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		char[] s=sc.next().toCharArray();
		int q=sc.nextInt();
		for(int i=0; i<q; i++){
			int k=sc.nextInt();
			int nd=0;
			int nm=0;
			int ndm=0;
			int ans=0;
			for(int j=0; j<n; j++){
				if(j-k>=0){
					if(s[j-k]=='D'){
						nd--;
						ndm-=nm;
					}else if(s[j-k]=='M'){
						nm--;
					}
				}
				if(s[j]=='D'){
					nd++;
				}else if(s[j]=='M'){
					nm++;
					ndm+=nd;
				}else if(s[j]=='C'){
					ans+=ndm;
				}
			}
			System.out.println(ans);
		}
	}
}
