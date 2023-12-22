
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      String[] nyu=sc.nextLine().split(" ");
   //  String nyu=sc.nextLine();

int A=Integer.parseInt(nyu[0]);
int B=Integer.parseInt(nyu[1]);
int C=Integer.parseInt(nyu[2]);

int d=Math.max(Math.max(A,B),C);

System.out.println(A+B+C-d);

	}
}