import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int n = sc.nextInt();
    int[] skills = new int[n];
    int ds = 0;
    for(int i = 0; i < n; i++){
      skills[i] = sc.nextInt();
      ds += skills[i];
    }
    if(ds >= h){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}