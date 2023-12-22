import java.util.Scanner;
public class Main {
  public static void main( String[] args ) {
	  Scanner scan = new Scanner(System.in);
	  int L = scan.nextInt();
	  int R = scan.nextInt();
	  int i;
	  int j = R;
	  int cnt = 0;
	  int min = ((R - 1) * R) % 2019;
	  for( i = L; i < R;i++ ) {
		  for( j = L + 1;j <= R && j < L + 2019;j++ ) {
			  cnt++;
			  if(L <= i && i < j && j <= R) {
				  int num = ( i * j ) % 2019;
				  if( min > num )min = num;
			  }
		  }
	  }
	  System.out.println(min);
	  System.out.println("処理回数は" + cnt);
  }
}

