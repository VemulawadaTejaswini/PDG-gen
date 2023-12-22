import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
      	int x = scn.nextInt();
      	int count = 0;
      	for(int i=a; i<=b; i++){
          if(i%x==0) count++;
        }
      	System.out.println(count);
	}
}