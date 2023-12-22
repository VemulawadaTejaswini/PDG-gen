import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int firsta=a,firstb=b;
		boolean araretsu=false;
		boolean braretsu=false;
		String str1 = "";
		if(n%2==1) {
			a-=m/2;
			n-=1;
			araretsu=true;
		}
		if(m%2==1) {
			if(!araretsu)
				b-=n/2;
			else
				b=b-n/2+1;
			m-=1;
			braretsu=true;
		}

		n=n/2;
		m=m/2;
		if(n*m<a/2+b/2) {
			System.out.print("NO");
		}
		else {
			int[][] kazu = new int[2][m];
			System.out.println("YES");
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {

					if(a>0) {
						kazu[0][i]=1;
						if(a==1)
							kazu[1][i]=0;
						else
							kazu[1][i]=1;
						a-=2;
					}
					else {
						if(b>0) {
							if(b==1) {
								kazu[0][i]=4;
								kazu[1][i]=5;
							}
							else {
								kazu[0][i]=2;
								kazu[1][i]=3;
							}
							b-=2;
						}
						else {
							kazu[0][i]=0;
							kazu[1][i]=0;
						}
					}
				}

				for(int j=0;j<m;j++) {
					if(kazu[0][j]==0)
						System.out.print("..");
					if(kazu[0][j]==1)
						System.out.print("<>");
					if(kazu[0][j]==2)
						System.out.print("^^");
					if(kazu[0][j]==3)
						System.out.print("vv");
					if(kazu[0][j]==4)
						System.out.print("^.");
					if(kazu[0][j]==5)
						System.out.print("v.");
				}
				if(braretsu) {
					if(firstb>0) {
						System.out.print("^");
					}
					else {
						System.out.print(".");
					}
				}
				System.out.println("");
				for(int j=0;j<m;j++) {
					if(kazu[1][j]==0)
						System.out.print("..");
					if(kazu[1][j]==1)
						System.out.print("<>");
					if(kazu[1][j]==2)
						System.out.print("^^");
					if(kazu[1][j]==3)
						System.out.print("vv");
					if(kazu[1][j]==4)
						System.out.print("^.");
					if(kazu[1][j]==5)
						System.out.print("v.");
				}
				if(braretsu) {
					if(firstb>0) {
						System.out.print("v");
						firstb--;
					}
					else {
						System.out.print(".");
					}
				}
				System.out.println("");
			}

			if(araretsu) {
				for(int i=0;i<m/2;i++) {
					if(firsta>0) {
						str1+="<>";
						firsta--;
					}
					else {
						str1+="..";
					}
					str1+="<>";
				}
				if(braretsu) {
					str1+=".";
				}
				System.out.println(str1);
			}

		}

	}

}
