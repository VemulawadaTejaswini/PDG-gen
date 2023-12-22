import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	  int H = sc.nextInt();
	  int W = sc.nextInt();
	  String[][] w = new String[W][H];

	  for(int i=0; i<H; i++) {
		  w[i] = sc.next().split("");
	  }
	  sc.close();

	  boolean flg = true;
	  for(int k=0; k<H; k++){
		  for(int l=0; l<W; l++){
			  if (w[k][l].equals("#")) {
				  boolean flg1,flg2,flg3,flg4;
				  flg1 = false;
				  flg2 = false;
				  flg3 = false;
				  flg4 = false;

				  if (k < (H - 1)) {
					  if(w[k+1][l].equals("#")) {
						  flg1 = true;
					  }
				  }
				  if (k > 0) {
					  if(w[k-1][l].equals("#")) {
						  flg2 = true;
					  }
				  }
				  if (l < (W - 1)) {
					  if(w[k][l+1].equals("#")) {
						  flg3 = true;
					  }
				  }
				  if (l > 0) {
					  if(w[k][l-1].equals("#")) {
						  flg4 = true;
					  }
				  }

				  if (!flg1 && !flg2 && !flg3 && !flg4) {
					  System.out.println("No");
					  flg = false;
					  break;
				  }

				  if ( (flg1=false) && (flg2=false) && (flg3=false) && (flg4=false) ) {
					  System.out.println("No");
				  }
			  }
		  }
		  if (!flg) {
			  break;
		  }
	  }
	  if (flg) {
		  System.out.println("Yes");
	  }

	}

}