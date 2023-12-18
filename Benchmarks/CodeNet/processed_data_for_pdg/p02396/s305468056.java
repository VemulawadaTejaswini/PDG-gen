public class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int x,y;
      x = 1;
      y = 1;
      while(x != 0){
    	x = sc.nextInt();
    	if(x!=0){
    		System.out.println("Case "+y+": "+x);
    	}
    	y = y+1;
      }
	}
}
