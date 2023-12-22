import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int upp = N/100;
        int downn = N%100;
        boolean my = ((1<=upp)&&(upp<=12));
        boolean ym = ((1<=downn)&&(downn<=12));
        
        if (my&&ym)
          System.out.println("AMBIGUOUS");
        else if(my)
          System.out.println("MMYY");
        else if(ym)
          System.out.println("YYMM");
        else
          System.out.println("NA");
	}
}