import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
      	
      	int ret = n;
      	for (int i = 0; i < n; i += 9){
        	int tmp = 0;
          	int itmp = i;
          	while (itmp > 0){
            	tmp += itmp % 9;
              	itmp /= 9;
            }
          	itmp = n - i;
            while (itmp > 0){
            	tmp += itmp % 6;
              	itmp /= 6;
            }
          	if (ret > tmp) ret = tmp;
        }
      	System.out.println(ret);
    }
}