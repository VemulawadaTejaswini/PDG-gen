import java.util.Scanner;
public class Main{
  public static void main(String[] args) {

    int n,k,h;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    k = sc.nextInt();
    int data[] = new int [n];
    int x = 0;

    if(1<=k && k<=500){
      for(int i=0 ; i<n ; i++){
        data[i] = sc.nextInt();
        if(data[i]>=k && data[i]<=500){
          x++;
        }
      }
    }
    System.out.println(x);
  }
}
