import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    for(int i=0; i<10; i++){
      for(int j=0; j<10; j++){
        if(n == i*j){
          System.out.println("Yes");
          continue;
        }
      }
    }
    System.out.println("No");
  }
}
