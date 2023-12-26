public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
      	int b = sc.nextInt();
      	int c = sc.nextInt();
      	int d = sc.nextInt();
      	int AoCount =0;
      	while(c > 0){
          c -= b; 
          AoCount ++; 
        }
      	int TkCount =0;
      	while(a > 0){
          a -= d; 
          TkCount ++; 
        }
      	if(TkCount<AoCount){
        System.out.println("No");
      }else{
        System.out.println("Yes");
      }
    }
}
