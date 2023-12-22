import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int xone = sc.nextInt();
		int yone = sc.nextInt();
		int xtwo = sc.nextInt();
        int ytwo = sc.nextInt();
		int nagasa = ytwo - yone;
		System.out.print(xtwo + nagasa +" ");
		System.out.print(ytwo+" ");
		System.out.print(xone + nagasa+" ");
		System.out.print(yone+" ");
	}
}