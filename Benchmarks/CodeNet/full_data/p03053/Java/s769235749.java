import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int H = sc.nextInt();
	    int W = sc.nextInt();
	    sc.nextLine();
	    String[] readed = new String[H];
	    String[][] A = new String[H][W];
	    boolean[][] flag = new boolean[H][W];
	    boolean isAll = true;
	    int count = 0;

	    for(int i = 0; i < H; i++) {
	    	readed[i] = sc.nextLine();
	    }
	    for(int i = 0; i < H; i++) {
	    	String[] tmp = readed[i].split("");
	    	for(int j = 0; j < W; j++) {
	    		A[i][j] = tmp[j];
	    		if(A[i][j].equals("#")) {
	    			flag[i][j] = true;
	    		} else {
	    			flag[i][j] = false;
	    		}
	    	}
	    }

	    sc.close();

	    while(true) {
	    	isAll = true;
	    	for(int i = 0; i < H; i++) {
		    	for(int j = 0; j < W; j++) {
		    		if(A[i][j].equals("#")) {
		    			if(i != 0) flag[i-1][j] = true;
		    			if(i != H - 1) flag[i+1][j] = true;
		    			if(j != 0) flag[i][j-1] = true;
		    			if(j != W - 1) flag[i][j+1] = true;
		    		}
		    	}
		    }

	    	for(int i = 0; i < H; i++) {
		    	for(int j = 0; j < W; j++) {
		    		if(flag[i][j] == true) {
		    			A[i][j] = "#";
		    		}
		    	}
		    }

	    	for(int i = 0; i < H; i++) {
		    	for(int j = 0; j < W; j++) {
		    		if(flag[i][j] == false) {
		    			isAll = false;
		    		}
		    	}
		    }
	    	count++;
	    	if(isAll) break;
	    }

	    System.out.println(count);
	}
}