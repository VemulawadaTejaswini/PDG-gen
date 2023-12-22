import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int mat[][] = new int[9][9];
    
    for (int i = 0; i < 9; i++){
      for (int j = 0; j < 9; j++){
        mat[i][j] = (i+1) * (j+1);
      }
    }
    int n = sc.nextInt();
    boolean band = false;

    for (int i = 0; i < 9; i++){
      for (int j = 0; j < 9; j++){
        if(n == mat[i][j]){
          band = true;
        }
      }
    }

    if (band == true){
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }
}