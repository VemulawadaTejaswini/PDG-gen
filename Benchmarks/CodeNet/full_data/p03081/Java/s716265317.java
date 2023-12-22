import java.util.Scanner;

public  class Main  {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	 int N = sc.nextInt();
	 int Q = sc.nextInt();
	 int max = N;
	 String s = sc.next(); //Nの数
	 int[] masu = new int[N]; //マスのゴーレムの数
	 char s_i[] = s.toCharArray();
	 char t_i[] = new char[Q];
	 char d_i[] = new char[Q];
	String alfavet[] = new String[26];
	for(int i = 0;i<26;i++) {
		alfavet[i] = "";
	} //初期化
	 for(int i = 0; i<Q; i++) {
		 String t_s = sc.next();
		 t_i[i] = t_s.charAt(0);
		 String d_s = sc.next();
		 d_i[i] = d_s.charAt(0);
	 }
	 
	 for(int i = 0; i<N; i++) {
		 masu[i]=1;
		 alfavet[henkan(s_i[i])]=alfavet[henkan(s_i[i])]+String.valueOf(i);
	 }
	//初期化
	
	 for(int i =0; i<Q;i++) {
		 int alfa = henkan(t_i[i]);
		 
		 char alfachar[] = alfavet[alfa].toCharArray();
		 for(int j =0; j<alfavet[alfa].length();j++) {
			 
			 
			 int c = Integer.parseInt(String.valueOf(alfachar[j]));

			 if(c==0&&d_i[i]=='L') {
				 max -= masu[(c)];
				 masu[(c)]=0;
				 continue;
			 }
			 if(c==(N-1)&&d_i[i]=='R') {
				 max -=masu[c];
				 masu[c]=0;
				 continue;
			 }
			 
			if(d_i[i]=='L') {
				 int p = masu[c];
				 masu[c-1]+=p;
				 masu[c]=0;
			 }
			 if(d_i[i]=='R') {
				 int p = masu[c];
				 masu[c+1]+=p;
				 masu[c]=0;
			 }
			 
		 }
	 }
	 
	 
	 System.out.println(max);
	 
}
public static int henkan(char p) {
	int i = 0;
	 if(p=='A') i=0;
	 else if(p=='B') i=1;
	 else if(p=='C') i=2;
	 else if(p=='D') i=3;
	 else if(p=='E') i=4;
	 else if(p=='F') i=5;
	 else if(p=='G') i=6;
	 else if(p=='H') i=7;
	 else if(p=='I') i=8;
	 else if(p=='J') i=9;
	 else if(p=='K') i=10;
	 else if(p=='L') i=11;
	 else if(p=='M') i=12;
	 else if(p=='N') i=13;
	 else if(p=='O') i=14;
	 else if(p=='P') i=15;
	 else if(p=='Q') i=16;
	 else if(p=='R') i=17;
	 else if(p=='S') i=18;
	 else if(p=='T') i=19;
	 else if(p=='U') i=20;
	 else if(p=='V') i=21;
	 else if(p=='W') i=22;
	 else if(p=='X') i=23;
	 else if(p=='Y') i=24;
	 else if(p=='Z') i=25;
	
	return i;
}
	
	
		
	}
