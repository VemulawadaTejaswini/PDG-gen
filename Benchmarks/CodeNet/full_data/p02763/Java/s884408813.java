import java.util.Arrays;
import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		Main mainObj = new Main();
		mainObj.solve();
	}
	
	public void solve() throws NumberFormatException, IOException {
		FastScanner sc = new FastScanner();
		int n = Integer.parseInt(sc.nextLine());
		String str = sc.nextLine();
		int q = Integer.parseInt(sc.nextLine());
		
    SegmentTree segTree = new SegmentTree(str.length(), (a,b) -> a | b, 0);
    for(int i = 0; i < n; i++){
      segTree.update(i, 1<<(str.charAt(i) - 97));
    }
		
		for(int i = 0; i < q; i++) {
      String[] queryArr = sc.nextLine().split(" ");
			int queryNo = Integer.parseInt(queryArr[0]);
			if(queryNo == 1) {
				int pos = Integer.parseInt(queryArr[1]) - 1;
        char val = queryArr[2].charAt(0);
        int intVal = val - 97;
				segTree.update(pos, 1<<intVal);
			}else if(queryNo == 2){
				
				int left = Integer.parseInt(queryArr[1]) - 1;
				int right = Integer.parseInt(queryArr[2]);
				
				System.out.println(testBit(segTree.query(left, right, 0, 0, -1)));
			}
		}
	}
	
	public class SegmentTree {
    int arrSize;
    int[] tree;
    TreeFunc treeFunc;
    int notInSectionValue;
    
    public SegmentTree(int size, TreeFunc treeFunc, int notInSectionValue) {
      arrSize = 1;
      while(arrSize < size) {
        arrSize *= 2;
      }
      tree = new int[arrSize * 2 - 1];
      this.treeFunc = treeFunc;
      this.notInSectionValue = notInSectionValue;
    }
    
    public void update(int pos, int val) {
      int pointer = arrSize+pos-1;
      tree[pointer] = val;
      while(pointer > 0) {
        pointer = (pointer-1)/2;
        tree[pointer] = treeFunc.calc(tree[pointer*2+1], tree[pointer*2+2]);
      }
    }
    
    public int query(int a, int b, int k, int l, int r) {
      
      if(r < 0) {
        r =  arrSize;
      }
      
      if(r <= a || b <= l) {
        return notInSectionValue;
      }
      if(a <= l && r <= b) {
        return tree[k];
      }
      
      return treeFunc.calc(query(a, b, k * 2 + 1, l, (l+r)/2),query(a,b,k*2+2, (l+r)/2, r));
    }
  }

  @FunctionalInterface
  interface TreeFunc{
    public int calc(int left,int right); 
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
 
  public class FastScanner {
	
    BufferedReader reader;
    private StringTokenizer st;
    
    public FastScanner() {
      st = null;
      reader = new BufferedReader(new InputStreamReader(System.in));
    }
  
    
    public String next() {
      if(st == null || !st.hasMoreElements()) {
        try {
          st = new StringTokenizer(reader.readLine());
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      return st.nextToken();
    }
    
    public String nextLine() {
      st = null;
      String readLine = null;
      try {
        readLine = reader.readLine();
      } catch (IOException e) {
        e.printStackTrace();
      }
      return readLine;
    }
    
    public int nextInt() {
      return Integer.parseInt(next());
    }
    
    public long nextLong() {
      return Long.parseLong(next());
    }
    
    public int[] nextIntArr(int n) {
      int[] retArr = new int[n];
      for(int i = 0; i < n; i++) {
        retArr[i] = nextInt();
      }
      return retArr;
    }
    
    public long[] nextLongArr(int n) {
      long[] retArr = new long[n];
      for(int i = 0; i < n; i++) {
        retArr[i] = nextLong();
      }
      return retArr;
    }
  }
  
}
