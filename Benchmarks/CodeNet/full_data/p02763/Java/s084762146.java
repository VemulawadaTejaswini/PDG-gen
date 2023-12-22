import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		Main mainObj = new Main();
		mainObj.solve();
	}
	
	public void solve() throws NumberFormatException, IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(sc.readLine());
		String str = sc.readLine();
		int q = Integer.parseInt(sc.readLine());
		
		SegTree segTree = new SegTree(str);
		
		for(int i = 0; i < q; i++) {
			String[] queryArr = sc.readLine().split(" ");
			int queryNo = Integer.parseInt(queryArr[0]);
			if(queryNo == 1) {
				int pos = Integer.parseInt(queryArr[1]) - 1;
				char val = queryArr[2].charAt(0);
				segTree.update(val, pos);
			}else if(queryNo == 2){
				
				int left = Integer.parseInt(queryArr[1]) - 1;
				int right = Integer.parseInt(queryArr[2]);
				
				System.out.println(testBit(segTree.query(left, right, 0, 0, segTree.leafSize)));
			}
		}
		sc.close();
	}
	
	
	class SegTree{
		int nodeNum;
		int leafSize;
		int[] data;
		
		public SegTree(String str) {
			
			nodeNum = str.length();
			leafSize = 1;
			while(leafSize < nodeNum) {
				leafSize *= 2; 
			}
			
			data = new int[leafSize * 2 - 1];
			
			for(int i = 0; i < str.length(); i++) {
				update(str.charAt(i), i);
			}
		}
		
		public void update(char val, int pos) {
			
			int pointer = leafSize+pos-1;
			int beforeVal = data[pointer];
			int charInt = val - 97;
			int nowVal = (1 << charInt);
			
			if(beforeVal == nowVal) {
				return;
			}
			
			data[pointer] = nowVal;
			
			while(pointer > 0) {
				pointer = (pointer-1)/2;
				data[pointer] = data[pointer*2+1] | data[pointer*2+2];
			}
		}
		
		public int query(int a, int b, int k , int l, int r) {
			if(r <= a || b <= l) {
				return 0;
			}
			if(a <= l && r <= b) {
				return data[k];
			}
			
			int m = (l+r)/2;
			return (query(a,b, k*2+1, l,m) | query(a, b, k*2+2, m, r));
		}
	}
	
	public int testBit(int bit) {
		int ans = 0;
		for(int i = 0; i < 26; i++) {
			if(((bit>>i) & 1 ) == 1) {
				ans++;
			}
		}
		return ans;
	}

}
