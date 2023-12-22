import java.util.Scanner;
class Main{
	static Scanner sc = new Scanner(System.in);
  public static int nextSunday(String str){
      	final int SUNDAY = 7;
  	switch(str){
      case "SUN":
          return SUNDAY - 0;
      case "MON":
          return SUNDAY - 1;
      case "TUE":
          return SUNDAY - 2;
      case "WED":
          return SUNDAY - 3;
      case "THU":
          return SUNDAY - 4;
      case "FRI":
          return SUNDAY - 5;
      default:
        return 1;
    }
  }
  public static void main(String[] args){
  	final int SUNDAY = 7;
    String str = sc.next();
    System.out.println(nextSunday(str));
  }
}