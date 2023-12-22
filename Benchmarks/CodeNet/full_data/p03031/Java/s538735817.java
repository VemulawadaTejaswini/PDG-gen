import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] s = new int[m][];
		for(int i = 0; i < m; i++){
			int k = sc.nextInt();
			s[i] = new int[k];
			for(int i2 = 0; i2 < k; i2++){
				s[i][i2] = sc.nextInt();
			}
		}
		int[] p = new int[m];
		for(int i = 0; i < m; i++){
			p[i] = sc.nextInt();
		}
		SwPattern.setsNum(n);
		for(int i = 0; i < SwPattern.pNum; i++){
			new SwPattern(i);
		}
		LightBulb.setbNum(m);
		for(int i = 0; i < m; i++){
			new LightBulb(s[i], p[i], i);
		}
		int count = 0;
		for(SwPattern sp : SwPattern.patterns){
			if(sp.checkPattern()){
				count++;
			}
		}
		System.out.println(count);
	}
}
class SwPattern {
	static int sNum;
	static int pNum;
	static SwPattern[] patterns;
	static void setsNum(int n){
		sNum = n;
		pNum = (int) Math.pow(2, sNum);
		patterns = new SwPattern[pNum];
	}
	int[] sPattern;
	SwPattern(int p){
		sPattern = new int[sNum];
		for(int i = 0; i < sNum; i++){
			sPattern[i] = p / (int)Math.pow(2, i) % 2;
		}
		patterns[p] = this;
	}
	boolean checkPattern(LightBulb lb){
		int on = 0;
		for(int i : lb.s){
			on += this.sPattern[i - 1];
		}
		return on % 2 == lb.p;
	}
	boolean checkPattern(){
		for(LightBulb lb : LightBulb.bulbs){
			if(! checkPattern(lb)){
				return false;
			}
		}
		return true;
	}
}
class LightBulb{
	static int bNum;
	static LightBulb[] bulbs;
	static void setbNum(int m){
		bNum = m;
		bulbs = new LightBulb[bNum];
	}
	int[] s;
	int p;
	LightBulb(int[] s, int p, int n){
		this.s = s;
		this.p = p;
		bulbs[n] = this;
	}
	
//	boolean checkLight(SwPattern sp){
//		int on = 0;
//		for(int i : this.s){
//			on += sp.sPattern[i - 1];
//		}
//		return on % 2 == this.p;
//	}
}
