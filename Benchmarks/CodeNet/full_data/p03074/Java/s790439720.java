import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		String s = in.next();
		char startChar = s.charAt(0);
		char endChar = s.charAt(s.length()-1);
		char nowChar = s.charAt(0);
		List<Integer> array0 = new ArrayList<>();
		List<Integer> array1 = new ArrayList<>();
		int num = 0;
		for(int i=0;i<n;i++) {
			if(s.charAt(i)!=nowChar) {
				if(nowChar=='0') {
					array0.add(num);
					nowChar = '1';
				}else {
					array1.add(num);
					nowChar = '0';
				}
				num = 1;
			}else num++;
		}
		if(nowChar=='0') array0.add(num);
		else array1.add(num);
		
		if(k>=array0.size()) {
			System.out.println(s.length());
		}else if(k==array0.size()-1){
			if(startChar=='0') {
				if(endChar=='0') {
					System.out.println(Math.max(s.length()-array0.get(0), s.length()-array0.get(array0.size()-1)));
				}else {
					System.out.println(Math.max(s.length()-array0.get(0), s.length()-array0.get(array0.size()-1))-array1.get(array1.size()-1));
				}
			}else {
				if(endChar=='0') {
					System.out.println(Math.max(s.length()-array0.get(0)-array1.get(0), s.length()-array0.get(array0.size()-1)));
				}else {
					System.out.println(Math.max(s.length()-array0.get(0)-array1.get(0), s.length()-array0.get(array0.size()-1))+array1.get(array1.size()-1));
				}
			}
		}else {
			int idx0 = 0;
			int idx1 = 0;
			int tmp = 0;
			int ans = 0;
			for(;idx0<k;) {
				tmp += array0.get(idx0) + array1.get(idx1);
				idx0++;
				idx1++;
			}
			if(startChar=='0') {
				ans = Math.max(tmp, tmp + array0.get(idx0) + array1.get(idx1) - array0.get(0));
				tmp = tmp + array0.get(idx0) + array1.get(idx1) - array0.get(0);
				idx0++;
				idx1++;
			}else {
				tmp += array1.get(idx1);
				idx1++;
				ans = Math.max(tmp, tmp + array0.get(idx0) + array1.get(idx1) - array0.get(0) - array1.get(0));
				tmp = tmp + array0.get(idx0) + array1.get(idx1) - array0.get(0) - array1.get(0);
				idx0++;
				idx1++;
			}
			while(idx0<array0.size()-1) {
				tmp = tmp + array0.get(idx0) + array1.get(idx1) - array0.get(idx0-k) - array1.get(idx1-k);
				ans = Math.max(ans, tmp);
				idx0++;
				idx1++;
			}
			if(endChar=='0') {
				tmp = tmp + array0.get(idx0) - array0.get(idx0-k) - array1.get(idx1-k);
				ans = Math.max(ans, tmp);
			}else {
				tmp = tmp + array0.get(idx0) + array1.get(idx1) - array0.get(idx0-k) - array1.get(idx1-k);
				ans = Math.max(ans, tmp);
			}
			System.out.println(ans);
		}
		in.close();

		
		
		
	}

}
