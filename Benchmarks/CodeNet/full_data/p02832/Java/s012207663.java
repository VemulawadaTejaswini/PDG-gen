import java.util.*;

class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
      	int n = Integer.parseInt(sc.next());
      	int brokenCnt = 0;

      	int i = 0;
      	int num = n;
      	while (i != n) {
          	int a = Integer.parseInt(sc.next());
          	if ((i + 1) != a) { 
              brokenCnt++; 
              n--;
            } else {
              i++;
            }
          	
        }
      
      	if (brokenCnt == num) { System.out.println(-1); return; }

      	System.out.println(brokenCnt);
    }
}