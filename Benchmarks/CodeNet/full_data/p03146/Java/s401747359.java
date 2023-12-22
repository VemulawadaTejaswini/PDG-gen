import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main{
  static int f1(int n){return n/2;}
  static int f2(int n){return 3*n+1;}


  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    List<Integer> list = new ArrayList<Integer>();
    int s = sc.nextInt();

    list.add(s);
    int i=1;
    do{
      list.add(s);
      if(s%2==0){
        s = f1(s);
      }else{
        s = f2(s);
      }
      i++;
    }while(!(list.contains(s)));
    System.out.println(i);

  }

}