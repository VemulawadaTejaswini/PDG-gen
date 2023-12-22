import java.util.* ;
class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
	int A = scan.nextInt();
   int B = scan.nextInt();
    int C = scan.nextInt();
    
    if(B-A == C-B){
      System.out.println("YES");
    }else{
		System.out.println("NO");
    }
    

  }
}
