import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner as = new Scanner(System.in);
		int n = as.nextInt();
		int k = as.nextInt();
		String a = as.next();
		int[] b;
		b = new int[n];
		for(int i=0;i<n;i++){
			if(String.valueOf(a.charAt(i)).equals("A")){
				b[i] = 1;
			}else{
				b[i] = 0;
			}
		}
		int t = 1;
		for(int i=0;i<k;i++){
			if(b[0]==1){
				b[0]=0;
			}else{
				try{
					for(int s=0;s<n;s+=t){
						if(b[s]==0&&b[s+t]==1){
							
						}else if(b[s]==0&&b[s+t]==0){
							b[s]=b[s+t]=1;
						}else if(b[s]==1&&b[s+t]==0){
							b[s+t]=1;
						}else{
							b[s+t]=0;
							t*=-1;
						}
					}
				}catch(Exception e){
					b[n-1]=1;
				}
			}
		}
		String l = "";
		for(int i=0;i<n;i++){
			if(b[i]==1){
				l+="A";
			}else{
				l+="B";
			}
		}
		System.out.println(l);
	}
}