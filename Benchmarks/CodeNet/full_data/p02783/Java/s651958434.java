import java.util.*;

public class Main {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int H = sc.nextInt();
			int A = sc.nextInt();
			
			int i = 0;
          
			while(H>0){
				H = H-A;
			    i++;
			}
			System.out.println(i);
		}
		}