import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] pri=new int[300];
		int[] pri_true=new int[300];
		int k=0;

		for(int i=1;i<300;i++){
            pri[i] = i;
        }
        for(int i=2;i<300;i++){
            for(int j=i+i;j<300;j+=i){
                pri[j]=0;
            }
        }

		for(int i=2;i<300;i++){
			if(pri[i]!=0){
				pri_true[k]=pri[i];
				k++;
			}
		}

		if(n%2!=0){
			for(int i=0;i<n;i++){
        	System.out.print(pri_true[i]+" ");
        }
		}else{
			for(int i=1;i<=n;i++){
        	System.out.print(pri_true[i]+" ");
        }
		}
        System.out.println();

	}
}