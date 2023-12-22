import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int array[] = new int[n];
    for(int i = 0; i<n; i++){
      array[i] = sc.nextInt();
    }
    for(int i = 0; i<n; i++){
      for(int k = 0; k<n; k++){
        if(i+1 == array[k]){
          System.out.print(k);
        }
      }
    }
  }
}
          
      