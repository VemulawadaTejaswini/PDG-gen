import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int w = scn.nextInt();
      	int h = scn.nextInt();
      	int x = scn.nextInt();
      	int y = scn.nextInt();
      	double ans = (double)w*h/2;
      	int check = 0;
      	if(x==w/2 && y==h/2) check = 1;
      	System.out.println(ans + " " + check);
	}
}
