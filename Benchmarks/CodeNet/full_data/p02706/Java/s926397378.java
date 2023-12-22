import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    // 休みの総数
    int vacation = sc.nextInt();

    // 宿題の数
    int homework = sc.nextInt();

    int count = 0;
    int totalDays = 0;
    while (count < homework) {
      // かかる日数
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