import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] sosu= {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97};
		int[][] yakusu=new int[25][101];
		int[] kosu=new int[101];
		List<Integer> unko=new ArrayList<Integer>();
		for(int i=1; i<=100; i++) {
			unko=new ArrayList<Integer>();
			fra(i,unko);
			for(int j=0; j<unko.size(); j++) {
				int a=unko.get(j);
				for(int k=0; k<25; k++) {
					if(a==sosu[k]) {
						yakusu[k][i]++;
					}
				}
			}
		}
		for(int i=0; i<25; i++) {
			for(int j=1; j<=100; j++) {
				yakusu[i][j]=yakusu[i][j]+yakusu[i][j-1];
			}
		}
		kosu[0]=0;
		for(int i=1; i<=100; i++) {
			int yoni=0;
			int nii=0;
			for(int j=0; j<25; j++) {
				if(yakusu[j][i]>=4) {
					yoni++;
				}
				if(yakusu[j][i]>=2) {
					nii++;
				}
			}
			kosu[i]+=((yoni)*(yoni-1)/2)*Math.max((nii-2),0);

			int jyuyon=0;

			for(int j=0; j<25; j++) {
				if(yakusu[j][i]>=14) {
					jyuyon++;
				}
			}
			kosu[i]+=jyuyon*(yoni-1);
			int nijyu4=0;
			for(int j=0; j<25; j++) {
				if(yakusu[j][i]>=24) {
					nijyu4++;
				}
			}
			kosu[i]+=nijyu4*(nii-1);

			int nnjy=0;

			for(int j=0; j<25; j++) {
				if(yakusu[j][i]>=74) {
					nnjy++;
				}
			}
			kosu[i]+=nnjy;
		}

		for(int i=0; i<25; i++) {
			//System.out.println(sosu[i]+" "+yakusu[i][100]);
		}
		for(int i=99; i<=100; i++) {
			//System.out.println(i+"! = "+kosu[i]);
		}
		int unkoo=sc.nextInt();
		System.out.println(kosu[unkoo]);
	}

	public static void fra(int a,List<Integer> p) {//int型用
		for(int i=2; i*i<=a; i++) {
			if(a%i==0) {
				p.add(i);
				fra(a/i,p);
				return;
			}
		}
		p.add(a);
	}


}