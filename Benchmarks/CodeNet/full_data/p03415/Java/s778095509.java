import java.util.* ;
class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
	char arr[][]= new char [3][3] ;
    
    for(int i = 0 ; i < 3 ; i++){
      for(int j = 0 ; j <3  ; j++){
        arr[i][j] = scan.next().charAt(0);
      }
    }
    
    for(int i = 0 ; i < 3 ; i++){
      for(int j = i ; j <=i  ; j++){
        System.out.print(arr[i][j]);
      }
    }
    
  }
}
