import java.util.*;

class Main{
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int z = sc.nextInt();
		int w = sc.nextInt();
		int xyturn = 1;
		int rtzw = 0;
		int[] ian = new int[n];
		for(int i=0;i<n;i++){
			ian[i] = sc.nextInt();
		}
		for(int j=0;j<n;j++){
			if(xyturn==1){
				z = ian[j];
				if(j!=n-1&&z>ian[j+1]){
					xyturn = 2;
				}
			}
			else if(xyturn==2){
				w = ian[j];
				if(j!=n-1&&w<ian[j+1]){
					xyturn = 1;
				}
			}
		}
		rtzw = z - w;
		if(rtzw<0){
			rtzw *= -1;
		}
		System.out.println(rtzw);
    }
}
