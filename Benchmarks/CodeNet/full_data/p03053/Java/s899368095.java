import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		String[][] masu = new String[a][b];
		String[][] masu2 = new String[a][b];
		for(int i=0;i<a;i++){
			String k = scan.next();
			for(int l=0;l<b;l++){
				masu[i][l]=String.valueOf(k.charAt(l));
				masu2[i][l]=masu[i][l];
			}
		}
		int ans = 0;
		boolean ansflg=true;
		while(true){
			ansflg = true;
			for(int i=0;i<a;i++){
				for(int l=0;l<b;l++){
					if(masu2[i][l].equals("."))ansflg=false;
					if(masu2[i][l].equals("#")){
						if(i+1!=a)masu[i+1][l]="#";
						if(!(i-1<0))masu[i-1][l]="#";
						if(l+1!=b)masu[i][l+1]="#";
						if(!(l-1<0))masu[i][l-1]="#";
					}
				}
			}
			for(int r=0;r<a;r++){
				for(int t=0;t<b;t++){
					masu2[r][t]=masu[r][t];
				}
			}
			if(ansflg)break;
			ans++;
		}

		System.out.println(ans);
	}
}