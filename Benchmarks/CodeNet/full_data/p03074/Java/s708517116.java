
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static int calc(ArrayList<Integer> arr, int k, boolean head) {
		int temp = 0,max;
		for(int i = 0;i < k*2;++i) {
			temp += arr.get(i);
		}
		if(head) {
			temp += arr.get(k*2);
		}
		max = temp;
		for(int i = k*2;i < arr.size();i+=2) {
			temp -= arr.get(i - k*2);
			if(head) {
				temp -= arr.get(i+1 - k*2);
			} else {
				if(i != k*2) {
					temp -= arr.get(i-1 - k*2);
				}
			}
			if(head) {
				if(i+2 < arr.size()) {
					temp += arr.get(i+2);
				}
				if(i+1 < arr.size()) {
					temp += arr.get(i+1);
				}
			} else {
				temp += arr.get(i);
				if(i+1 < arr.size()) {
					temp += arr.get(i+1);
				}
			}
			if(max < temp) {
				max = temp;
			}
		}
		return max;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bf = null;
		bf = new BufferedReader(new InputStreamReader(System.in));
		int n,k,ans = 0,tempn;
		boolean head,tempb;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		String str;
		String[] s;
		str = bf.readLine();
		s = str.split(" ");
		n = Integer.parseInt(s[0]);
		k = Integer.parseInt(s[1]);
		str = bf.readLine();
		s = str.split("");
		head = Integer.parseInt(s[0]) == 1;
		tempb = head;
		tempn = 1;
		for(int i = 1;i < n;++i) {
			if(tempb == (Integer.parseInt(s[i]) == 1)) {
				tempn++;
			} else {
				arr.add(tempn);
				tempn = 1;
				tempb = !tempb;
			}
		}
		arr.add(tempn);
		if(head) {
			if(k >= arr.size()/2) {
				ans = n;
			} else {
				ans = calc(arr,k,head);
			}
		} else {
			if(k >= (arr.size()+1)/2) {
				ans = n;
			} else {
				ans = calc(arr,k,head);
			}
		}
		System.out.println(ans);
	}
}