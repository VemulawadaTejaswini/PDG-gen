import java.util.Scanner;
import java.util.ArrayList;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;
    ArrayList<Integer> array = new ArrayList<Integer>();
    for(int a=0;a<n;a++){
      array.add(sc.nextInt());
      array.add(sc.nextInt());
    }
    for(int b=0;b<2*n;b=b+2){
      count += array.get(b+1)-array.get(b)+1;
    }
    System.out.println(count);
  }
}