import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int xone = sc.nextInt();
		int yone = sc.nextInt();
		int xtwo = sc.nextInt();
        int ytwo = sc.nextInt();
		int xkyori = xtwo - xone;
		int ykyori = ytwo - yone;
		int xthree = xtwo - ykyori;
		int ythree = ytwo + xkyori;
		int xfour = xthree - xkyori;
		int yfour = ythree - ykyori;
		System.out.print(xthree + " " + ythree + " " + xfour + " " + yfour);

		
	}
}