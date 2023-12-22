import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<s.length();i++) {
			if(i==s.length()-1) {
				if(s.charAt(i)=='A') list.add(1);
				else list.add(-1);
			}else{
				if(s.charAt(i)=='A') list.add(1);
				else if(s.charAt(i)=='B'&&s.charAt(i+1)=='C') {
					list.add(0);
					i++;
				}
				else list.add(-1);
			}
		}
		int[] bit = new int[list.size()+1];
		int begin_idx = -1;
		long ans = 0;
		for(int i=0;i<list.size();i++) {
			if(list.get(i)==1) add(bit,i+1,1);
			else if(list.get(i)==0) {
				if(begin_idx==-1) ans += sum(bit,i+1);
				else {
					ans += sum(bit,i+1) - sum(bit,begin_idx+1);
				}
			}
			else if(list.get(i)==-1) begin_idx = i;
		}
		System.out.println(ans);
		
		in.close();
	}
	
	//add value at idx on bit O(logN)
	public static void add(int[] bit,int idx,int value) {
		for(int i=idx;i<bit.length;i+=(i&-i)) bit[i] += value;
	}
	
	//return sum [1,idx] O(logN)
	public static int sum(int[] bit,int idx) {
		int ret = 0;
		for(int i=idx;i>0;i-=(i&-i)) ret += bit[i];
		return ret;
	}

}
