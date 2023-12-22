import java.util.* ;
class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
	int A = scan.nextInt();
    int B = scan.nextInt();
    int C =scan.nextInt();
    int D = scan.nextInt();
    
    if(A+B < C+D){
      System.out.println("RIGHT");
    }else if(A+B == C+D){
      System.out.println("BALANCED");
    }else{
      System.out.println("LEFT");
    }
  }
}
