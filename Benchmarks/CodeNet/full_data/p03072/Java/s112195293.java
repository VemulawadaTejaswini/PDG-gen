import java.util.*;
class Main {
  public static void main(String[] args){
    System.out.println(Mountain());
  }
  public static int Mountain() {
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    int maxNum = 0;
    int result = 0;

    for(int i = 0; i < x; i++){
      int num =  scanner.nextInt();
      maxNum = Math.max(maxNum, num); 
      if(maxNum == num) result++;
    }
    return result;
  }
}