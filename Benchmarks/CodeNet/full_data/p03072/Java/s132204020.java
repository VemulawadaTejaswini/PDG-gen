import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt;
    int[] h;
    int i = 1;
    while(sc.hasNext()) {
      h[i] = sc.nextInt();
      i++;
    }
    
    int cnt = 0;
    int isGood = True;
    for(int i = 1; i <= h.length; i++) {
	  for (int j = 1; j < i; j++) {
		if (h[j] > h[i]) {
		  isGood = false;
        }
      }
      if (isGood) {
        cnt++;
      }
    }
    System.out.println(cnt);
  }
}