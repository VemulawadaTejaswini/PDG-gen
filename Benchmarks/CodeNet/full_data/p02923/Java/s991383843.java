import java.util.Scanner;
     
public class Main {
    	
    private final static Scanner sc = new Scanner(System.in);
    	
    public static void main(String[] arg) {
    	int N  = sc.nextInt();
        int pred = sc.nextInt();
      	int max = 0;
      	int tmp = 0;
      	for (int i = 0; i < N-1; i++) {
         	int now = sc.nextInt();
          	if(now <= pred) {
              	tmp++;
              	if(tmp > max) max = tmp;
            } else {
              tmp = 0;
            }
          	pred = now;
        }  
      	System.out.println(max);
   	}
}