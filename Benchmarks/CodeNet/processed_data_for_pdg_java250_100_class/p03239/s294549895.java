public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
    int firstT = sc.nextInt();
    int printCost = 1001;
    for(int i =0; i < N; i++){
  		int c = sc.nextInt();
      int t = sc.nextInt();
      if( firstT >= t ){
        if(printCost > c ){
          printCost = c;
        }
      }
    }
    if(printCost == 1001){
      System.out.println("TLE");
    }
    else {
  		System.out.println(printCost);
    }
	}
}
