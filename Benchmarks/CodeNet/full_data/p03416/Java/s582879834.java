import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int[] number = new int[5];
    int cnt = 0;
    for(int i=a;i<=b;i++){
      int num=i;
      int j=0;
      while(num>0){
        number[j++] = num%10;
        num/=10;
      }
      if(number[0]==number[4]&&number[1]==number[3]) cnt++;
    }
    System.out.println(cnt);
  }
}