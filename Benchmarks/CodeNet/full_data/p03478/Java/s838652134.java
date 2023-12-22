import java.util.Scanner;

//  B - Some Sums

public class Main {
  public static void main(String[] args ) throws Exception {

    Scanner sc = new Scanner(System.in);
    int A = Integer.parseInt(sc.next());
    int B = Integer.parseInt(sc.next());
    int C = Integer.parseInt(sc.next());


    int totalAll = 0;
	for(int i = 1; i <= A; i++) {
		int total = kesan(i);
		if(total >= B && total <= C) {

			totalAll += i;
		}
	}


    System.out.println(totalAll);
  }

  public static int kesan(int i) {
		int total = 0;
		while(true) {
			if(i / 10 > 0) {
				total += i % 10;
				i /= 10;
			} else {
				total += i;
				return total;
			}
		}

  }
}