import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int l = sc.nextInt();
    int r = sc.nextInt();
    int a = 0;
    int min = r*l;
    for(int i = l;i<r;i++){
      for(int j = i+1;j<=r;j++){
        a = (i*j)%2019;
        if(a<min){
          min = a;
        }
      }
    }
    System.out.println(min);
  } 
}