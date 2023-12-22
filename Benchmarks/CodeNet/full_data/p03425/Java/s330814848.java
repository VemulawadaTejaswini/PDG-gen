import java.util.*;

public class Main {

	static int Examine(int countM,int countA,int countR,int countC,int countH) {
		int count = 0;
		int m = 0,a = 0,r = 0,c = 0,h = 0;
		boolean PlusM = false,PlusA = false,PlusR = false,PlusC = false,PlusH = false;
		int fill;
		while(m <= countM) { //mを数える
			PlusM = false;
			PlusA = false;
			PlusR = false;
			PlusC = false;
			PlusH = false;
			fill = 0;
			a = 0;
			r = 0; 
			c = 0;
			h = 0;
			if(m > 0) {
				fill++;
				PlusM = true;
			}while(a <= countA) {// aを数える
				PlusR = false;
				PlusC = false;
				PlusH = false;
				r = 0; 
				c = 0;
				h = 0;
				if(a > 0){
					fill++;
					PlusA = true;
				}while(r <= countR) { //rを数える
					PlusC = false;
					PlusH = false;
					c = 0;
					h = 0;
					if(r > 0) {
						fill++;
						PlusR = true;
					}
					if(fill == 3 && PlusR) count++;
					while(c <= countC) { // cを数える
						PlusH = false;
						h = 0;
						if(c > 0) {
							fill++;
							PlusC = true;
						}
						if(fill == 3 && PlusC) count++;
						while(h <= countH) { //hを数える
							if(h > 0) {
								fill++;
								PlusH = true;
								if(fill == 3  && PlusH) count++;
							}
							if(PlusH) fill--;
							h++;
						}
						if(PlusC) fill--;
						c++;
					}
					if(PlusR) fill--;
					r++;
				}
				if(PlusA) fill--;
				a++;
			}
			if(PlusM) fill--;
			m++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] names = new String[N];
		//　それぞれの頭文字の名前をもつ人数
		int countM = 0;
		int countA = 0;
		int countR = 0;
		int countC = 0;
		int countH = 0;
		String[] I = new String[N];
		for(int i = 0;i < N;i++) { // 名前を入力として受け取る 
			names[i] = sc.next();
			I[i] = names[i].substring(0,1); //　それぞれの名前の頭文字を格納する
		}
		for(int k = 0;k < N;k++) { // それぞれの頭文字を持つ名前の人間が何人か調べる
			if(I[k].equals("M")) countM++;
			else if(I[k].equals("A")) countA++;
			else if(I[k].equals("R")) countR++;
			else if(I[k].equals("C")) countC++;
			else if(I[k].equals("H")) countH++;
		}
		System.out.println(Examine(countM,countA,countR,countC,countH));
		sc.close();
	}

}
