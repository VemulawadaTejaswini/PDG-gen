import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
      	String s = scn.next();
      	String[] list = s.split("");
      	int count = 0;
      	int min = n;
      	for(int i=0; i<n; i++){
          for(int j=0; j<n; j++){
            if(list[j].equals("E")) count++;
          }
          for(int j=n+1; j<n; j++){
            if(list[j].equals("W")) count++;
          }
          if(min>count) min = count;
        }
      	System.out.println(count);
	}
}
