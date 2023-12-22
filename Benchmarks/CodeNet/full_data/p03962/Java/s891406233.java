import java.util.Scanner;
import java.util.Arrays;

class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] colors = new int[3];
    for(int i=0; i<3; i++){
      colors[i] = Integer.parseInt(scanner.next());
    }
    scanner.close();

    Arrays.sort(colors);

    int ans = 1;
    for(int i=1; i<3; i++){
      if(colors[i] != colors[i-1]){
        ans ++;
      }
    }

    System.out.println(ans);
  }
}
