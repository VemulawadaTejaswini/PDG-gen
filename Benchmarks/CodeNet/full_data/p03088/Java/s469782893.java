import java.util.*;
public class Main{
	public static void main(String[] args){
		int ans = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] p = new int[30];
		int[] pn = new int[30];
		for(int i=0; i<14; i++){
			p[i] = 0;
		}
		for(int i=14; i<30; i++){
			p[i] = 1;
		}
		
		int a = 1000000007;
		
		for(int i=2; i<n; i++){
			pn[0] = p[0] + p[14];
			pn[1] = p[0] + p[14];
			pn[2] = p[0] + p[14];
			pn[3] = p[0] + p[14];
			pn[4] = p[1] + p[15];
			pn[5] = p[1] + p[15];
			pn[6] = p[1] + p[15];
			pn[7] = p[1] + p[15];
			pn[8] = p[2] + p[16];
			pn[9] = p[2] + p[16];
			pn[10] = p[2] + p[16];
			pn[11] = p[3] + p[17];
			pn[12] = p[3] + p[17];
			pn[13] = p[3] + p[17];
			pn[14] = p[4] + p[8] + p[11] + p[18] + p[22] + p[26];
			pn[15] = p[4] + p[8] + p[11] + p[18] + p[22] + p[26];
			pn[16] = p[4] + p[8] + p[18] + p[22];
			pn[17] = p[4] + p[8] + p[11] + p[18] + p[22] + p[26];
			pn[18] = p[5] + p[9] + p[12] + p[19] + p[23] + p[27];
			pn[19] = p[5] + p[9] + p[12] + p[19] + p[23] + p[27];
			pn[20] = p[5] + p[9] + p[19] + p[23] + p[27];
			pn[21] = p[5] + p[9] + p[12] + p[19] + p[23] + p[27];
			pn[22] = p[6] + p[10] + p[20] + p[24] + p[28];
			pn[23] = p[6] + p[10] + p[20] + p[24] + p[28];
			pn[24] = p[6] + p[10] + p[20] + p[24] + p[28];
			pn[25] = p[6] + p[10] + p[20] + p[24] + p[28];
			pn[26] = p[7] + p[13] + p[21] + p[25] + p[29];
			pn[27] = p[7] + p[13] + p[21] + p[25] + p[29];
			pn[28] = p[21] + p[25] + p[29];
			pn[29] = p[7] + p[13] + p[21] + p[25] + p[29];
			
			for(int j=0; j<30; j++){
				p[j] = pn[j] % a;
			}
		}
		
		for(int i=0; i<30; i++){
			ans += p[i];
			ans %= a;
		}
		
		System.out.println(ans);
	}
}
