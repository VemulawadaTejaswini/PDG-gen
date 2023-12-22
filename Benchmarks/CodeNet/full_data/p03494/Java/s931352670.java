import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
      	int number[] = new int[n];
      	boolean a = true;
      	int count = 0;
      
      	for (int i=0; i<n; i++) {
          number[i]=sc.nextInt();
        }
      	sc.close();
      
        while (a==true) {
          for (int i=0; i<n; i++) {
            if (number[i]%2!=0) {
              a = false;
            }
          }
          if (a == false) {
            break;
          }
          for (int i=0; i<n; i++) {
            number[i]/=2;
          }
          count++;
        }
      System.out.println(count);
	}
}