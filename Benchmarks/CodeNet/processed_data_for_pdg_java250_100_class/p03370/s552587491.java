public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(); 
    int X = sc.nextInt(); 
    int[] m = new int[N]; 
    for(int i = 0; i < N; i++){
      m[i] = sc.nextInt();
    }
    int max = 0; 
    int all1 = 0;
    int min = X;
    for(int i=0; i<N; i++){
      all1 += m[i];
      if( m[i] < min) min = m[i];
    }
    X = X - all1;
    int count = N;
    while(X - min >= 0){
    	count++;
      X -= min;
    }
    System.out.println(count);
  }
}
