import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int l[] = new int[n];
    int d = 0;
    int l = 1;
    for(int a = 0; a < n; a++){
      l[a] = sc.nextInt();
      d = d + l[a];
      if(d <= x){
        l++;
      }        
    }
    System.out.println(l);
  }
}