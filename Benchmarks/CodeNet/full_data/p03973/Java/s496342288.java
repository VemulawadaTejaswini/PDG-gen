import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
        int n = sc.nextInt();
        int aa[];
        aa = new int[n];
        for(int i=0;i<n;i++){
            aa[i] =sc.nextInt();
        }

        boolean end = true;
        int ni = 0;
        int p = 1;
        int count = 0;
        int countng = 0;
            while(end){
                if(aa[ni] > p){
                    aa[ni] = aa[ni] - p;
                    count = count + 1;
                }
                else {
                    p = p + 1;
                    ni = ni + 1;
                    countng = countng + 1;
                }
                if(countng == n){
                    end = false;
                }
            }

		// 出力
        System.out.println(count);
	}
}