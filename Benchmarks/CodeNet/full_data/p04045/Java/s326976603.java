import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int minnum = sc.nextInt();
		int cNum = sc.nextInt();

		int cDisNum[] = new int[cNum];
		for (int i=0; i<cNum; i++){
			cDisNum[i] = sc.nextInt();
		}

		int cNumLke = 10 - cNum;
		int cLikeNum[]= new int[cNumLke];
		int ccnt=0;
		boolean flg;
		for (int i=0; i< 10 ; i++){
			flg = true;
			for (int j=0; j<cNum; j++){
				if (i == cDisNum[j]) flg = false;
			}
			if (flg){
				 cLikeNum[ccnt]=i;
				 ccnt++;
			}
		}
//		for (int i=0; i< cNumLke ; i++){
//			System.out.println(cLikeNum[i]);
//		}

		int a5 = minnum / 1000;
		int a4 = (minnum % 1000)/100;
		int a3 = (minnum % 100)/10;
		int a2 = minnum % 10;
//		System.out.println(a5);
//		System.out.println(a4);
//		System.out.println(a3);
//		System.out.println(a2);

		int c5 = 0;
		int c4 = 0;
		int c3 = 0;
		int c2 = 0;

		boolean eqflg=false;
		for (int i=0; i< cNumLke ; i++){
			if(a5 <= cLikeNum[i]){
				if(a5 == cLikeNum[i] || a5 == 0){eqflg = true;}
				c5=cLikeNum[i];
				break;
			}
		}
		for (int i=0; i< cNumLke ; i++){
			if (eqflg = false){
				c4=cLikeNum[0];
				break;
			}
			if(a4 <= cLikeNum[i]){
				if(a4 == cLikeNum[i] || a4 == 0){eqflg = true;}
				c4=cLikeNum[i];
				break;
			}
		}
		for (int i=0; i< cNumLke ; i++){
			if (eqflg = false){
				c3=cLikeNum[0];
				break;
			}
			if(a3 <= cLikeNum[i]){
				if(a3 == cLikeNum[i] || a3 == 0){eqflg = true;}
				c3=cLikeNum[i];
				break;
			}
		}
		for (int i=0; i< cNumLke ; i++){
			if (eqflg = false){
				c2=cLikeNum[0];
				break;
			}
			if(a2 <= cLikeNum[i]){
				if(a2 == cLikeNum[i] || a2 == 0){eqflg = true;}
				c2=cLikeNum[i];
				break;
			}
		}

		int ansnum = c5*1000 + c4*100 + c3 *10 + c2;

		System.out.println(ansnum);
	}
}