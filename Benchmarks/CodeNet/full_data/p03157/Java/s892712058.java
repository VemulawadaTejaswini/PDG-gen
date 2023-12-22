import java.util.*;
class Main {
    static int H;
    static int W;
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	H = sc.nextInt();
	W = sc.nextInt();
	char[][] board = new char[H][W];
	for(int i = 0; i<H; i++) {
	    String str = sc.next();
	    for(int j = 0; j<W; j++) {
		board[i][j] = str.charAt(j);
	    }
	}
	long result = 0;;
	for(int i = 0; i<H; i++) {
	    for(int j = 0; j<W; j++) {
		if(board[i][j] == '#') {
		    int[] part = searchWhite(board,i,j);
		    result += part[0]*part[1];
		}
	    }
	}
	System.out.println(result);

    }

    public static int[] searchWhite(char[][] board, int i, int j) {
	char target = (board[i][j]=='#')? '.': '#';
	int[] cnt = {0,0};
	if(board[i][j] == '.') cnt[0]++;
	else if(board[i][j] == '#') cnt[1]++;
	board[i][j] = '*';
	int[] result;
	if(i+1<H) {
	    if(board[i+1][j] == target) {
		result = searchWhite(board,i+1,j);
		cnt[0] += result[0];
		cnt[1] += result[1];
	    }
	}
	if(i-1>=0) {
	    if(board[i-1][j] == target){
		result = searchWhite(board,i-1,j);
		cnt[0] += result[0];
		cnt[1] += result[1];
	    }
	}
	if(j+1<W) {
	    if(board[i][j+1] == target){
		result = searchWhite(board,i,j+1);
		cnt[0] += result[0];
		cnt[1] += result[1];
	    }
	}
	if(j-1>=0) {
            if(board[i][j-1] == target){
		result = searchWhite(board,i,j-1);
		cnt[0] += result[0];
		cnt[1] += result[1];
	    }
	}
	return cnt;
    }


}