import java.util.Scanner;
public class Main {
  public static void main( String[] args ) {
	  Scanner scan = new Scanner(System.in);
	  int N = scan.nextInt();
	  int A = scan.nextInt();
	  int B = scan.nextInt();
	  int Ncpy = N;
	  int digit = 1;	//桁数
	  while( true ) {
		  if( Ncpy < 10 ) {
			  break;
		  }else {
			  Ncpy /= 10;
			  digit++;
		  }
	  }
	  int hoge = 0;
	  int digit5 = 0;
	  int digit4 = 0;
	  int digit3 = 0;
	  int digit2 = 0;
	  int digit1 = 0;
	  int hoge2 = 0;
	  int hoge3 = 0;
	  int sum = 0;
	  for( int i = 1; i <= N; i++ ) {
		  hoge2 = i;
		  digit5 = i / 10000;
		  hoge2 = hoge2 % 10000;
		  digit4 = hoge2 / 1000;
		  hoge2 = hoge2 % 1000;
		  digit3 = hoge2 / 100;
		  hoge2 = hoge2 % 100;
		  digit2 = hoge2 / 10;
		  digit1 = i % 10;
		  hoge3 = digit5 + digit4 + digit3 + digit2 + digit1;
		  if( A <= hoge3 && hoge3 <= B ) {
			  sum += i;
		  }
	  }
	  System.out.println(sum);
  }
}
