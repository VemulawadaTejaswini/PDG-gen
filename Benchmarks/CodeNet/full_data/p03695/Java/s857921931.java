import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] color = new int[9];
    int count = 0, countMax = 0;
    int allColor = 0;
    for(int i = 0; i<n; i++){
      int a = sc.nextInt();
      if(a <400) {color[0] = 1;}
      else if(a <800) {color[1] = 1;}
      else if(a <1200) {color[2] = 1;}
      else if(a <1600) {color[3] = 1;}
      else if(a <2000) {color[4] = 1;}
      else if(a <2400) {color[5] = 1;}
      else if(a <2800) {color[6] = 1;}
      else if(a <3200) {color[7] = 1;}
      else if(a <=4800) {allColor++;}
    }
    for(int i = 0; i<8; i++){
      count += color[i];
    }

    countMax = count + allColor;

    System.out.print(count + " ");
    System.out.println(countMax);
  }
}
