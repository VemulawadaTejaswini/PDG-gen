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
				j=0;
				k++;
				// System.out.println(e[0]+" "+log[0]);
			}else if(ar[j+1]<ar[j]&&k==1&&j!=log[0]){
				e[1]=ar[j+1];
				log[1]=j+1;
				// System.out.println(e[1]+" "+log[1]);
				break;

			}
		}
		if(k==1){
		ar[log[0]]=e[1];
		ar[log[1]]=e[0];
	}
		for(int l = 0;l<num-1;l++){
			if(ar[l+1]<ar[l]){
				System.out.println("NO");
				System.exit(0);
			}
		}
		System.out.println("YES");
	}
}