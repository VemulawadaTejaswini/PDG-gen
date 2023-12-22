import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		list.add(0);
		int idx = 3;
		while (true) {
		    if (isPrime(idx) && isPrime((idx + 1) /2)) {
		        list.add(idx);
		    }
		    if (idx > 100000) {
		        break;
		    }
		    idx += 2;
		}
		int q = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < q; i++) {
		    int left = sc.nextInt();
		    int right = sc.nextInt();
		    int left1 = 0;
		    int right1 = list.size() - 1;
		    while (right1 - left1 > 1) {
		        int m = (left1 + right1) / 2;
		        if (list.get(m) >= left) {
		            right1 = m;
		        } else {
		            left1 = m;
		        }
		    }
		    int left2 = 0;
		    int right2 = list.size() - 1;
		    while (right2 - left2 > 1) {
		        int m = (left2 + right2) / 2;
		        if (list.get(m) > right) {
		            right2 = m;
		        } else {
		            left2 = m;
		        }
		    }
		    sb.append(left2 - left1).append("\n");
		    
		}
       System.out.print(sb);
   }
   
   static boolean isPrime(int x) {
       if (x == 1) {
           return false;
       }
       for (int i = 2; i <= Math.sqrt(x); i++) {
           if (x % i == 0) {
               return false;
           }
       }
       return true;
   }
}


