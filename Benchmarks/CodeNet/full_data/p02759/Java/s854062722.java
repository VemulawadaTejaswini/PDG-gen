import java.util.Scanner;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int page = 0;
	for(int i = 0;i < N;i++){
      page = i;
    }
    page = page / 2;
    System.out.print(page);
}
}