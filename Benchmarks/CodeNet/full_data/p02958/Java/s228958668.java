import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] input = new int[n];
    int difference = 0;
    for(int i = 0;i<,n;i++){
      input[i] = sc.nextInt();
      if(input[i] != i + 1){
        difference++;
      }
    }
    if(difference == 0 || difference == 2){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}