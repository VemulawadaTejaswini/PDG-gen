import java.util.*;
import java.math.*;
import java.text.*;

public class Main{
	
	static int w, h, k;
	static boolean[][] choko;


    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
		h = sc.nextInt();
		w = sc.nextInt();
		k = sc.nextInt();
		sc.nextLine();
		choko = new boolean[w][h];
		for(int j = 0;j < h;j ++){
			char[] line = sc.nextLine().toCharArray();
			for(int i = 0;i < w;i ++){
				choko[i][j] = line[i] == '1';
			}
		}
		int min = 1000000;
		for(int a = 0;a < 1 << (h-1);a ++){
			int hn = pertitionNum(a);
			int[] per = getPertition(a, hn);
			int[] seg = new int[hn + 1];
			int[] tmp = new int[hn + 1];
			int wn1 = 0;
			ahaha:for(int i = 0;i < w;i ++){
				for(int j = 0;j < hn + 1;j ++){
					tmp[j] = count(per[j], per[j+1], i);
				}
				for(int j = 0;j < hn + 1;j ++){
					if(seg[j] + tmp[j] > k){
						wn1 ++;
						for(int b = 0;b < hn + 1;b ++){
							seg[b] = tmp[b];
						}
						continue ahaha;
					}
				}
				for(int j = 0;j < hn + 1;j ++){
					seg[j] += tmp[j];
				}
			}
			seg = new int[hn + 1];
			tmp = new int[hn + 1];
			int wn2 = 0;
			ahaha:for(int i = w - 1;i >= 0;i --){
				for(int j = 0;j < hn + 1;j ++){
					tmp[j] = count(per[j], per[j+1], i);
				}
				for(int j = 0;j < hn + 1;j ++){
					if(seg[j] + tmp[j] > k){
						wn2 ++;
						for(int b = 0;b < hn + 1;b ++){
							seg[b] = tmp[b];
						}
						continue ahaha;
					}
				}
				for(int j = 0;j < hn + 1;j ++){
					seg[j] += tmp[j];
				}
			}
			min = Math.min(min, hn + Math.min(wn1, wn2));
		}
		
		System.out.println(min);
    }
	
	public static int count(int s, int e, int l){
		int num = 0;
		for(;s < e;s ++){
			if(choko[l][s]) num++;
		}
		return num;
	}
	
	public static int pertitionNum(int n){
		int tmp = n;
		int num = 0;
		while(tmp > 0){
			if(tmp % 2 == 1) num++;
			tmp /= 2;
		}
		return num;
	}
	
	public static int[] getPertition(int n, int num){
		int[] ret = new int[num + 2];
		ret[0] = 0;
		ret[num + 1] = h;
		int tmp = n;
		num = 0;
		int d = 1;
		while(tmp > 0){
			if(tmp % 2 == 1) ret[++num] = d;
			tmp /= 2;
			d++;
		}
		return ret;
	}
}
