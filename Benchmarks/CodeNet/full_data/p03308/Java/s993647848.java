import java.util.scanner;
public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int max = 0;
    int min = 0;
    for(int i=0; i<N; i++){
      int x = sc.nextInt();
      if(i == 0){ max = x; min = x;}
      else{
        if(x > max) { max = x}
        if(x < min) { min = x}
      }
    }
    System.out.println( max - min);  
  }
}


