import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

class Main {
  public static void main(String[] args) {
    final Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int red = sc.nextInt();
    int green = sc.nextInt();
    int wild = sc.nextInt();
    Integer[] rednum = getArray(red, sc);
    Integer[] greennum = getArray(green, sc);
    Integer[] wildnum = getArray(wild, sc);
    
    Integer[] pri = new Integer[x+y+wild];
    System.arraycopy(rednum, 0, pri, 0, (x>red) ? red:x);
    System.arraycopy(greennum, 0, pri, (x>red) ? red:x, (y>green) ? green:y);
    System.arraycopy(wildnum, 0, pri,((x>red) ? red:x) + ((y>green) ? green:y), wild);
    Arrays.sort(pri, Collections.reverseOrder());
    int sum = 0;
    for(int i = 0; i < x+y;i++){
      sum+= pri[i];
    }
    System.out.println(sum);
  }
  
  static Integer[] getArray(int size, Scanner sc){
    Integer[] ret = new Integer[size];
    for(int j = 0;j<size;j++){
      ret[j] = sc.nextInt();
    }
    Arrays.sort(ret, Collections.reverseOrder());
    return ret;
  }
}