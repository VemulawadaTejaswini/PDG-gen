import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
		String dayofweek = sc.next();
		System.out.println(7-week(dayofweek));
  }
  public static int week(String day){
		String[] days = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		for(int i = 0; i < 7; i++){
			if(day.equals(days[i])){
				return i;
			}
		}
		return 6;
  }
}
