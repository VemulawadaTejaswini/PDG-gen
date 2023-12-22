import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int[] ar = new int[num];
		for(int i = 0;i<num;i++){
			ar[i] = scan.nextInt();
		}
		int[] e = new int[2];
		int[] log = new int[2];
		int k = 0;
		for(int j = 0;j<num-1;j++){
			if(ar[j+1]<ar[j]&&k!=1){
				e[0]=ar[j];
				log[0]=j;
				k++;
			}else if(ar[j+1]<ar[j]&&k==1){
				e[1]=ar[j];
				log[1]=j;
				break;
			}
		}
		ar[log[0]]=e[1];
		ar[log[1]]=e[0];
		for(int l = 0;k<num-1;k++){
			if(ar[l+1]<ar[l]){
				System.out.println("NO");
			}else{
				System.out.println("YES");
			}
		}
	}
}