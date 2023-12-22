import java.util.Scanner;

public class Main {


//整数の場合はnextInt()
public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    long sahen = (long)a * (long)b * 4;

    long uhen =( (long)c -(long)a - (long)b ) * ( (long)c -(long)a - (long)b );

    if (sahen < uhen) {
    	System.out.println("YES");
    }else {
    	System.out.println("NO");
    }

}


}
