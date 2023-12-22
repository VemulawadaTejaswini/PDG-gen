import java.util.Scanner;


class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
	int input[] = new int[n];
    int ans[]   = new int[n];
    for(int i = 0; i < n; i++){
      	input[i] = sc.nextInt();
      	arrayReverseCopy(i, input, ans);
      	arrayCopy(input, ans);
    }
    
    for(int i = 0; i < n; i++)
      System.out.printf("%d ", ans[i]); 
  }
  
  static void arrayCopy(int input[], int ans[]){
  	for(int i = 0; i < input.length;i++)
      input[i] = ans[i];
  }
  
  static void arrayReverseCopy(int index, int input[], int ans[]){
    for(int i = index, j = 0; i >= 0; i--, j++)
      ans[j] = input[i];
  }
}