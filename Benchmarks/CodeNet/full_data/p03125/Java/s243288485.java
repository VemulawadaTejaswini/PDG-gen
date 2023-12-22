import java.io.PrintWriter;
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int A = sc.nextInt();
		int B = sc.nextInt();
        if (B%A == 0){
            out.println(A+B);
        }else{
          out.println(B-A);
        }
     out.flush();
    }
}