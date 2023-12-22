import java.util.Scanner;
  public class Main{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
  //  int n =10;
    int max = 999999999;
    int answer = 0;
    int i = 0;
    Boolean w = true;
    while(w){
      if((i%n == 0) && (i%2 == 0)){
        answer = i;
        w=false;
      }
      i++;
    }
    System.out.println(answer);
  }
}
