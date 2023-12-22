import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ni = sc.nextInt();
		int au[] = new int[ni];

		int nj =1;
		int tnum=0;

		au[0] =  sc.nextInt();

		for (int i=1; i < ni; i++){
			tnum = sc.nextInt();
			boolean flg = true;
			for (int j =0; j< nj; j++){
				if(tnum == au[j]){
					flg = false;
				}
			}
			if (flg){
				au[nj] = tnum;
				nj++;
			}

		}



		if (nj%2 == 0){
			System.out.println(nj/2);
		}else{
			System.out.println(0);
		}
		sc.close();
	}

}