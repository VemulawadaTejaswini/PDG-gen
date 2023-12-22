import java.util.Scanner;

public static void main (String[] args){
  Scanner Scan = new Scanner(System.in);
  int[] mas = Scan.next().split(1)(int[]);
  int cnt = 0;
  for(i : mas){
    if(mas[i] == 0)cnt++;
  }
  System.out.prinitln(cnt);
}