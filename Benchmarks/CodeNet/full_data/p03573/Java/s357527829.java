public class Main {
    public static void main(String[] args) {
 
		int x = Integer.parseInt(args[0]);
  		int y = Integer.parseInt(args[1]);
  		int z = Integer.parseInt(args[2]);
      	
        int ans = x;
  		if (x == y) {
    		ans = z;
  		} else if (x == z) {
   			ans = y;
  		}
 		System.out.println(ans);
    }
}