import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		boolean[][] pairs = new boolean[n][n];
		for(int i=0; i<n; i++)
			Arrays.fill(pairs[i], true);
		boolean[] dead = new boolean[n];
		Arrays.fill(dead, false);
		LinkedList<Proccessed> list = new LinkedList<Proccessed>();
		int m= sc.nextInt();
		for(int i=0; i<m; i++) {
			int x=sc.nextInt()-1;
			int y=sc.nextInt()-1;
			if(x>y) {
				int tmp = x;
				x=y;
				y=tmp;
			}
			pairs[x][y]=false;
			for(Proccessed p: list) {
				p.remove(pairs, x, y, dead);
			}
			list.add(new Proccessed(x, y, n));
		}
		int count = 0;
		for(int i=0; i<n-1; i++) {
			for(int j= i+1; j<n; j++) {
				if(pairs[i][j]) {
					System.out.println((i+1) + ", " + (j+1));
					count++;
				}
			}
		}
		sc.close();

		System.out.println(count);
	}
}

class Proccessed {
	int x;
	int y;
	boolean[] proccessed;

	public Proccessed(int x, int y, int n) {
		this.x = x;
		this.y = y;
		this.proccessed = new boolean[n];
	}

	public boolean[][] remove(boolean[][] pairs, int newX, int newY, boolean[] dead) {
		int num1;
		int num2;
		if(x==newX && y==newY) {
			// 例外ケース
			dead[x]=true;
			dead[y]=true;
			for(int i=0; i<proccessed.length; i++) {
				if(x<i) pairs[x][i]=false;
				else pairs[i][x]=false;
				if(y<i) pairs[y][i]=false;
				else pairs[i][y]=false;
			}
			return pairs;
		} else if(dead[newX]) {
			dead[newY]=true;
			for(int i=0; i<proccessed.length; i++) {
				if(newY<i) pairs[newY][i]=false;
				else pairs[i][newY]=false;
			}
			return pairs;
		} else if(dead[newY]) {
			dead[newX]=true;
			for(int i=0; i<proccessed.length; i++) {
				if(newX<i) pairs[newX][i]=false;
				else pairs[i][newX]=false;
			}
			return pairs;
		} else if(x==newX) {
			num1=y;
			num2=newY;
		} else if(x==newY) {
			num1=y;
			num2=newX;
		} else if(y==newX) {
			num1=x;
			num2=newY;
		} else if(y==newY) {
			num1=x;
			num2=newX;
		} else {
			return pairs;
		}
		if(num1>num2) {
			int t=num1;
			num1=num2;
			num2=t;
		}
		pairs[num1][num2]=false;

		return pairs;
	}
}