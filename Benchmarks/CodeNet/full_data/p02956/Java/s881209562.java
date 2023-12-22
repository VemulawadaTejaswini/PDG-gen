import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	
	static final long mod = 998244353L;

	public static void main(String[] args) {
		Main mainObj = new Main();
		mainObj.solve();
	}
	
	void solve() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		ArrayList<Coodinate> coodinateList = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			coodinateList.add(new Coodinate(x,y,i));
		}
		
		sc.close();
		
		Comparator<Coodinate> yComparator = Comparator.comparing(Coodinate::getY);
		Comparator<Coodinate> xComparator = Comparator.comparing(Coodinate::getX);
		coodinateList.sort(yComparator);
		for(int i = 0; i < n; i++) {
			coodinateList.get(i).setY(i);
		}
		
		coodinateList.sort(xComparator);
		for(int i = 0; i < n; i++) {
			coodinateList.get(i).setX(i);
		}
		
		int[] firstQuadrant = new int[n];
		int[] secondQuadrant = new int[n];
		int[] thirdQuadrant = new int[n];
		int[] forthQuadrant = new int[n];
		
		// 平面走査する
		SumSegTree leftTree = new SumSegTree(n);
		// xの小さい方
		for(int i = 0; i < n; i++) {
			
			Coodinate nowCoodinate = coodinateList.get(i);
			
			int numOfThirdQuadrant = leftTree.getValue(0, nowCoodinate.getY(), 0, 0, -1);
			thirdQuadrant[i] = numOfThirdQuadrant;
			secondQuadrant[i] = i - numOfThirdQuadrant;
			
			leftTree.upDate(nowCoodinate.getY(), 1);
		}
		
		SumSegTree rightTree = new SumSegTree(n);
		// xの大きい方
		for(int i = n - 1; i >= 0; i--) {
			
			Coodinate nowCoodinate = coodinateList.get(i);
			
			int numOfForthQuadrant = rightTree.getValue(0, nowCoodinate.getY(), 0, 0, -1);
			forthQuadrant[i] = numOfForthQuadrant;
			//System.out.println(numOfForthQuadrant);
			firstQuadrant[i] = (n - 1) - i - numOfForthQuadrant;
			rightTree.upDate(nowCoodinate.getY(), 1);
		}
		
		long ans = 0;
		long[] powArr = new long[n+1];
		powArr[0] = 1;
		powArr[1] = 1;
		for(int i = 1 ; i < n; i++) {
			powArr[i] = calcMod(powArr[i - 1]*2);
		}
		
		
		
		for(int i = 0; i < n ;i++) {
			int first = firstQuadrant[i];
			int second = secondQuadrant[i];
			int third = thirdQuadrant[i];
			int forth = forthQuadrant[i];
			
			long firstPow,secondPow,thirdPow,forthPow;
			firstPow = powArr[first];
			secondPow = powArr[second];
			thirdPow = powArr[third];
			forthPow = powArr[forth];
			
			ans = calcMod(ans + calcMod(calcMod(calcMod(firstPow*(secondPow-1))*thirdPow)*(forthPow - 1)));
			ans = calcMod(ans + calcMod(calcMod(calcMod((firstPow-1)*secondPow)*(thirdPow - 1))*forthPow));
			ans = calcMod(ans - calcMod(calcMod(calcMod((firstPow-1)*(secondPow - 1))*(thirdPow - 1))*(forthPow - 1)));
			ans = calcMod(ans + calcMod(calcMod(calcMod(firstPow*secondPow)*thirdPow)*forthPow));
		}
		
		System.out.println(ans);
	}
	
	long calcMod(long value) {
		if(value < 0) {
			while(value > 0) {
				value += mod;
			}
			return value;
		}else {
			return value%mod;	
		}
	}
	
	long powWithMod(int base, int times) {
		long retValue = 1;
		for(int i = 0;i < times; i++) {
			retValue = calcMod(retValue*base);
		}
		return retValue;
	}
	
	class SumSegTree{
		int[] arr;
		int n;
		int arrSize;
		
		SumSegTree(int n){
			this.n = n;
			arrSize = 1;
			while(n > arrSize) {
				arrSize *= 2;
			}
			
			// 最初は和もvalueも0なので何もしない
			this.arr = new int[arrSize*2 - 1];
		}
		
		void upDate(int pos, int value) {
			int segIndex = pos + arrSize - 1;
			int beforeValue = arr[segIndex];
			arr[segIndex] = value;
			
			int diff = value - beforeValue;
			while(segIndex > 0) {
				segIndex = (segIndex - 1)/2;
				arr[segIndex] = arr[segIndex] + diff;
			}
		}
		
		// a, b間の和を取得
		int getValue(int a, int b, int k, int l, int r) {
			
			if(r < 0) {
				r = arrSize;
			}
			
			if(r <= a || b <= l) {
				return 0;
			}
			if(a <= l && r <= b) {
				return arr[k];
			}
			
			return getValue(a, b, 2*k + 1, l, (l+r)/2) + getValue(a,b,2*k + 2, (l+r)/2, r);
		}
	}
	
	class Coodinate{
		int x;
		int y;
		int no;
		
		Coodinate(int x, int y, int no){
			this.x = x;
			this.y = y;
			this.no = no;
		}
		
		int getX() {
			return x;
		}
		
		int getY() {
			return y;
		}
		
		void setX(int x) {
			this.x = x;
		}
		
		void setY(int y) {
			this.y = y;
		}
		
		int getNo() {
			return no;
		}
	}
}
