import java.util.*;
public class Main {
	public static void main(String args[]) {
     Scanner scan = new Scanner(System.in);
     int socketsInEachStrip = scan.nextInt();
     int emptySockets scan.nextInt();
     int board = 0;
     if(emptySockets%socketsInEachStrip==0) {
      	board = emptySockets/socketsInEachStrip;
     }else{
     	board = (emptySockets/socketsInEachStrip)+1;
     }
      System.out.println(board);
    }
}