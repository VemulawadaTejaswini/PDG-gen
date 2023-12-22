import java.util.*;

class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
      	int a = Integer.parseInt(sc.next());
      	int b = Integer.parseInt(sc.next());
      	int c = Integer.parseInt(sc.next());
      	boolean is_poison = false;
      	int deli = 0;
      	
      	int size = a + b + c;
      	for (int i = 0; i < size; i++) {
        	if (!is_poison && c > 0) {
            	c--;
              	deli++;
              	is_poison = true;
            } else if (b > 0) {
            	b--;
              	deli++;
              	is_poison = false;
            } else if (a > 0) {
            	a--;
              	is_poison = false;
            }
        }
      System.out.println(deli);
    }
}