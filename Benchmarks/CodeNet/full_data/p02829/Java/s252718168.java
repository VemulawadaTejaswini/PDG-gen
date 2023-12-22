import java.util.*;
public class Main {
    /**
     * @param args
     */
    public static void main(final String[] args) {
          
        //入力の例
        Scanner sc = new Scanner(System.in);
        final String aStrA = sc.next();
        final String aStrB = sc.next();

	int aSum = Integer.parseInt(aStrA) + Integer.parseInt(aStrB);

	int aOut;

	if(aSum == 3) aOut = 3;
	else if(aSum == 4) aOut = 2;
	else if(aSum == 5) aOut = 1;
	else aOut = 0;
        //出力の例
        System.out.println(aSum);

    }
}


