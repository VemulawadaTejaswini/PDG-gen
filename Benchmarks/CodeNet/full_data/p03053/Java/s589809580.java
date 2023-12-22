import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner keyboard = new Scanner(System.in); 
	
	int H = keyboard.nextInt();
	int W = keyboard.nextInt();
	
	String in = "";
	String S = "";
	
	for(int i = 0; i < H+1; i++) {
		if(i == 0) {
			in = keyboard.nextLine();
			S = in;
		}else {
			in = keyboard.nextLine();
			S = S + in;
		}
		
	}
	
	String[] menseki = S.split("");
	
	int black = 0;
	int white = 0;
	int turn = 0;
	
//	System.out.println(menseki[0]);
//	System.out.println(menseki[1]);
//	System.out.println(menseki[2]);
//	System.out.println(menseki[3]);
//	System.out.println(menseki[4]);
//	System.out.println(menseki[5]);
//	System.out.println(menseki[6]);
//	System.out.println(menseki[7]);
//	System.out.println(menseki[8] + "moto");

	do {
		white = 0;
		black = 0;
		for(int j = 0; j < H*W; j++) {
				if(menseki[j].equals("#") && j-1 >= 0 && j % W != 0){
					if(menseki[j-1].equals(".")) {
						menseki[j-1] = "B";
					}
				}
				if(menseki[j].equals("#") && j+1 < H*W && j % W != (W-1)) {
					if(menseki[j+1].equals(".")) {
					menseki[j+1] = "B";
					}
				}
				if(menseki[j].equals("#") && j-W >= 0 ) {
					if(menseki[j-W].equals(".")) {
						menseki[j-W] = "B";
					}
				}
				if(menseki[j].equals("#") && j+W < H*W) {
					if(menseki[j+W].equals(".")) {
						menseki[j+W] = "B";	
					}
				}
		}
//		System.out.println(menseki[0]);
//		System.out.println(menseki[1]);
//		System.out.println(menseki[2]);
//		System.out.println(menseki[3]);
//		System.out.println(menseki[4]);
//		System.out.println(menseki[5]);
//		System.out.println(menseki[6]);
//		System.out.println(menseki[7]);
//		System.out.println(menseki[8] + "change");

		for(int k = 0; k < H*W; k ++) {
			if(menseki[k].equals(".")) {
				white++;
			}else if(menseki[k].equals("B")) {
				menseki[k] = "#";
			}
		}
		
		black = H*W - white;
		turn ++;
//		System.out.println(white + "white");
//		System.out.println(black + "black");
//		
//		System.out.println(menseki[0]);
//		System.out.println(menseki[1]);
//		System.out.println(menseki[2]);
//		System.out.println(menseki[3]);
//		System.out.println(menseki[4]);
//		System.out.println(menseki[5]);
//		System.out.println(menseki[6]);
//		System.out.println(menseki[7]);
//		System.out.println(menseki[8] + "after change");
		
	}while (black < H*W);
	
	System.out.println(turn);
	keyboard.close();
	}	
}
