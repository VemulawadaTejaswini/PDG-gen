public class Main {
	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		  try{
              	          String ab = input.readLine();
			  String[] strAry = ab.split(" ");
			  int x = Integer.parseInt(strAry[0]);
			  int y = Integer.parseInt(strAry[1]);
			  System.out.println(x*y +" "+ 2*(x+y));
		    }catch(IOException e) {   System.out.println("Exception : " + e);
		    }
	}
}
