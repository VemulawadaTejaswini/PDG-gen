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
		if(b[0]==1){
			b[0]=0;
		}else{
			for(int s=0;s<n-1;s++){
				if(b[s]==0&&b[s+1]==1){
				}else if(b[s]==1&&b[s+1]==1){
					b[s]=0;
				}else if(b[s]==0&&b[s+1]==0){
					b[s]=b[s+1]=1;
				}else{
					b[s+1]=1;
				}
			}b[n-1]=1;
		}
		for(int i=0;i<k;i++){
			if(b[0]==1){
				b[0]=0;
			}else{
				for(int s=0;s<n-2;s++){
					if(b[s]==0&&b[s+1]==1){
					}else if(b[s]==1&&b[s+1]==1){
						b[s]=0;
					}else if(b[s]==0&&b[s+1]==0){
						b[s]=b[s+1]=1;
					}else{
						b[s+1]=1;
					}
				}if(b[n-2]==1){
					b[n-2]=0;
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