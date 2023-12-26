public class Main {
	public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
	  int N = sc.nextInt();
      int T = sc.nextInt();
      int min = 10001;
      for(int i=0;i<N;i++){
       int cost = sc.nextInt();
        if(sc.nextInt()<=T){
          min = Math.min(min,cost);
        }
      }
      if(min==10001){
        System.out.println("TLE");
      }else{
        System.out.println(min);
      }
    }
}
