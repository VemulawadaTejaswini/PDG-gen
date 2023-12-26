public class Main {
  public static void main(String args[]) {
	Scanner in = new Scanner(System.in);
	int num = in.nextInt();
    int kisuu = 0;
    for (int i = 1; i <= num;  i++){
      if (i % 2 != 0){
        kisuu++;
      }
    }
    System.out.println((double)kisuu / num);
  }
}
