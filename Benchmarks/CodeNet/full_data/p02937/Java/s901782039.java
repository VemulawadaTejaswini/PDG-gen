import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String  s =    sc.next();
		String  t =    sc.next();
		String[] strArray_s = s.split("");
		String[] strArray_t = t.split("");
		String[] strArray_total = new String[strArray_s.length * 1000];
		int j = 0;
		int count =0;
		int fin = 0;
		boolean flg = false;
		int k =0;
		//使用する配列の作成
		for(int i = 0; i < strArray_total.length;i++) {
			if(j < strArray_s.length) {
			strArray_total[i] = strArray_s[j]; 
			j++;
			}
			if(j == strArray_s.length) {
				j = 0;	
			}
		}
		//エラーチェック
		int cnt = 0;
		for(int i = 0; i < strArray_s.length;i++) {
		for(String a:strArray_t) {
		if(a == strArray_s[i]) {
			cnt += 1;
		}
		}
		}
		if(cnt != strArray_t.length) {
			System.out.println("-1");
		}
		//文字検索
		for(int i =0;i < strArray_t.length;i++) {
			if(flg == true) {
				k = fin;
			}
			for( ; k < strArray_total.length;k++) {
				if(strArray_t[i] == strArray_total[k]) {
					count++;
					fin = k;
					break;
				}
			}
			if(count == strArray_t.length) {
				break;
			}
			flg = true;
			}
		System.out.println(fin);
		}
		
       
	}
