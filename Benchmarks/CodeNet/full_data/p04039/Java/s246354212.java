/*
 * いろはちゃんはこだわりもので、嫌いな数字が K 個あり、それぞれ D1,D2,...,DKです。
 * 
 * いろはちゃんはお店でお買い物をしていて、 N円の品物を買おうとしています。 もちろん、この品物は N 円以上のお金を支払えば買うことができます。 
 * しかし、先ほど述べたようにいろはちゃんは強いこだわりがあるので、自分がお店に支払う金額の 10進表記にいろはちゃんの嫌いな数字が出現しないような最も少ない金額を支払おうとします。
 * 
 * いろはちゃんが支払う金額を求めてください。
 */

import java.util.*;
	public class Main{
		public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            // 入力
            int n = Integer.parseInt(sc.next());
            int nLen = String.valueOf(n).length();
            int k = Integer.parseInt(sc.next());
            int[] nums = new int[10];
            
            for(int i=0; i<10; i++){
            	nums[i] = i;
            }

            for(int i=0; i<k; i++){
            	int a = Integer.parseInt(sc.next());
            	nums[a] = a+1;
            }
            for(int i=8; i>=0; i--){
            	nums[i] = nums[nums[i]];
            }
            
            // 出力
            System.out.println(minObsession(nums, n, nLen-1));

            sc.close();
		}
		
		public static int minObsession(int[] a, int n, int k){
			int kNum = (n/(int)(Math.pow(10, k)))%10;
			int ret = 0;
			int minnext = a[kNum];
			if(kNum == minnext){
				if(k==0){
					ret = n;
				}else{
					ret = minObsession(a, n, k-1);
				}
            }else if(minnext == 10){
            	ret = minObsession(a, (n/(int)(Math.pow(10, k)) + 1) * (int)(Math.pow(10, k)), k+1);
            }else{
            	ret = n - n%((int)(Math.pow(10, k+1))) + minnext * ((int)(Math.pow(10, k)));
            	int min = a[0];
            	for(int i = 0; i<k; i++){
            		ret += ((int)(Math.pow(10, i))) * min;
            	}
            }
            
			return ret;
        }
    }
	