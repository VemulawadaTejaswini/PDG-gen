import java.util.*;
public class Main {
    private static void prin(String ans){
    System.out.println(ans);
    }

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int upp = N/100;
        int downn = N%100;
        boolean my = ((1<=upp)&&(upp<=12));
        boolean ym = ((1<=downn)&&(downn<=12));
        
        if (my&&ym)
          prin("AMBIGUOUS");
        else if(my)
          prin("MMYY");
        else if(ym)
          prin("YYMM");
        else
          prin("NA");
	}
}

