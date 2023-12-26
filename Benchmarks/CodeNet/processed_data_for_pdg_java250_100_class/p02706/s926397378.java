public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int vacation = sc.nextInt();
    int homework = sc.nextInt();
    int count = 0;
    int totalDays = 0;
    while (count < homework) {
      totalDays += sc.nextInt();
      count++;
    }
    int result = vacation - totalDays;
    if (result >= 0) {
	    System.out.println(result);
    } else {
	    System.out.println("-1");
    }
  }
}
