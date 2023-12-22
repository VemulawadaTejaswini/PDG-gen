import java.util.Scanner;
import java.util.ArrayList;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int[] b =new int[n];
		for(int i = 0; i<n; i++){
			b[i]= sc.nextInt();
			if(i+1<b[i]){
				System.out.println(-1);
				return;
			}
		}
		int[] ans=new int[n];
		ans[0]=1;
		int count=1;
		for(int i=n-1; i>0; i--){
			if(b[i]>=3 && count<3){
				int b1=b[i];
				ArrayList<Integer> list=new ArrayList<>();
				int k =0;
				for(int j=1; j<=b[i]-count+k; j++){
					if(b[i-j]<b1){
						b[i-j+1+k]=b[i-j];
					}else{
						k++;
						list.add(b[i-j]);
					}
				}
				b[i-b1+count+k]=b1;
				for(int l=0; l<list.size(); l++){
					b[i-b1+count+k-l]=list.get(l);
				}
			}
			ans[n-i]=b[i];
			count++;
		}
		for(int i = 0; i<n; i++){
			System.out.println(ans[i]);
		}
	}
}
