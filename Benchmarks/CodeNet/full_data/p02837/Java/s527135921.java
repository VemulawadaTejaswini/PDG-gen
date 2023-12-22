
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int[] pow2= new int[16];
	static int calcPow2(int a){
		if(a == 0){
			return 1;
		}else if(pow2[a] == 0){
			int ans = calcPow2(a - 1) * 2;
			pow2[a] = ans;
			return ans;
		}else{
			return pow2[a];
		}
	}
	static int n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[][][] ary = new int[n][][];
		for(int i = 0; i < n; i++){
			int a = sc.nextInt();
			ary[i] = new int[a][2];
			for(int k = 0; k < a; k++){
				ary[i][k][0] = sc.nextInt() - 1;//人
				ary[i][k][1] = sc.nextInt();//正直or不親切
			}
		}
		int maxNum = 0;
		for(int bi = 0; bi < calcPow2(n); bi++){
			boolean flag = true;
			int[] bynary = new int[n];
			for(int k = 0; k < n; k++){
				bynary[k] = bi / calcPow2(k) % 2;
			}
			for(int i = 0; i < n; i++){
				if(bynary[i] == 1){//正直者が1
					for(int k = 0; k < ary[i].length; k++){
						if(bynary[ary[i][k][0]] != ary[i][k][1]){
							flag = false;
						}
					}
				}
			}
			if(flag){
				int num = 0;
				for(int n : bynary){
					num += n;
				}
				maxNum = Math.max(maxNum, num);
			}
		}
		System.out.println(maxNum);
	}
}

