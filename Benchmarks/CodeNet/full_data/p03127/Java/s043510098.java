import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int ans=0;
		int[] f = new int[a];
		for(int i=0;i<a;i++){
			f[i]=scan.nextInt();
		}
		Arrays.sort(f);
		int count=0;
		int p=0;
		while(true){
			while(true){
				if(f[p]==0){p++;}else{break;}
			}
			for(int l=p+1;l<a;l++){
				f[l]=f[l]%f[p];
				if(f[l]==0){count++;}
			}
			if(count==a-1-p){break;}
			Arrays.sort(f);
			count=0;
		}
		System.out.println(f[p]);
	}
}