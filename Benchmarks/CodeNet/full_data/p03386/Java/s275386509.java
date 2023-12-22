import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		int s = in.nextInt();
      	int g = in.nextInt();
      	int k = in.nextInt();
      
      for(int i = s;i <= g;i++){
        if(s+k>i||g-k<i){System.out.println(i);}
      }
	}
}