import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int mojisu=sc.nextInt();
		String[] muki=new String[mojisu];
		String moji=sc.next();
		for(int i=0; i<mojisu; i++) {
			muki[i]=moji.charAt(i)+"";
		}

		int[] wlist=new int[mojisu];
		int[] elist=new int[mojisu];

		for(int i=0; i<mojisu; i++) {
			if(muki[i].equals("W")) {		//→
				wlist[i]=wlist[Math.max(0, i-1)]+1;
				elist[i]=elist[Math.max(0, i-1)];
			}

			else if(muki[i].equals("E")) {	//←
				elist[i]=elist[Math.max(0, i-1)]+1;
				wlist[i]=wlist[Math.max(0, i-1)];
			}
		}

		int min=114514810;
		int cnt=0;

		cnt=elist[mojisu-1]-elist[1];
		if(cnt<min) { min=cnt;}
		//System.out.println(min);
		for(int j=1; j<mojisu-1; j++) {
			cnt=wlist[Math.max(0, j-2)]+(elist[mojisu-1]-elist[j]);
			//System.out.println(cnt);
			if(cnt<min) {
				min=cnt;
			}
		}
		System.out.println(min);


		/*int cnt=0;
		int min=114514810;
		//リーダーよりも前ならW→E　　後ろなら　E→Wにする
		for(int i=0; i<mojisu; i++) {
			cnt=0;
			for(int j=0; j<mojisu; j++) {
				if(j<i) {
					if(muki[j].equals("W")) {
						cnt++;
					}
				}
				else if(j>i) {
					if(muki[j].equals("E")) {
						cnt++;
					}
				}
			}
			if(min>cnt) {
				min=cnt;
			}
		}
		System.out.println(min);*/
	}
}//乾燥できず　5くらいで　TLEをもらう