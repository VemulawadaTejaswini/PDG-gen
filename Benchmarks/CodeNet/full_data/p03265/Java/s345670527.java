import java.util.*;
public class Main {
	public static void main(String[] args){
      	//データ取り込み
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
      	int y1 = sc.nextInt();
      	int x2 = sc.nextInt();
      	int y2 = sc.nextInt();
      	int xdif = x2 - x1;
      	int ydif = y2 - y1;
        int x3 = x2 - ydif;
        int y3 = y2 + xdif;
      	int x4 = x1 - ydif;
      	int y4 = y1 + xdif;
      	System.out.println(x3+" "+y3+" "+x4+" "+y4);
    }
}