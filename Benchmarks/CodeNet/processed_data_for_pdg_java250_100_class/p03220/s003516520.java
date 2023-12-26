public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();  
    int T = sc.nextInt();  
    int A = sc.nextInt();  
    int[] H = new int[N];  
    int number = 0; 
    double x = 1000.0; 
    for(int i = 0; i < N; i++)
      H[i] = sc.nextInt();
    for(int i = 0; i < N; i++){
      double xi = A - (T - H[i] * 0.006);
        if(xi < 0) xi = -xi;
      if(xi < x){ x = xi; number = i + 1;}     
    }
    System.out.println(number);
  }  
}
