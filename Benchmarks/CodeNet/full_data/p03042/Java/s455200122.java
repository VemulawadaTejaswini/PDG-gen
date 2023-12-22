
import java.util.*;
public class Main {
    public static void main(String[] args) {

		Scanner s = new Scanner((System.in));
		int n = s.nextInt();
		int fh = n / 100;
		int sh = n % 100;
		String out;

		if (isMonth(fh) && isMonth(sh)){
			out = "AMBIGUOUS";
		}else if (isMonth(fh)){
			out = "MMYY";
		}else if (isMonth(sh)){
			out = "YYMM";
		}else{
			out = "NA";
		}

		System.out.println(out);

    }

    public static Boolean isMonth(int i){
    	return (1 <= i) && (i <= 12);
	}


}