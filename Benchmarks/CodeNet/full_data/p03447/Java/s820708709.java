import java.util.*;
public class Main {
	public static void main(String[] args) {
//		X円もってケーキとドーナツ
//		ケーキ屋でA円 1個
//		ドーナツやB円 いっぱい
		Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
      	int A = sc.nextInt();
      	int B = sc.nextInt();
      	X = X - A;
      	while(true) {
      		X = X - B;
      		if( X < 0 ) {
      			X = X + B;
      			break;
      		}else if( X == B ) {
      			break;
      		}
      	}
      	System.out.println(X);
	}
}