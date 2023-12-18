public class Main{
	public static void main(String args[]){
    int a = 0,b = 0;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    try{
      String line = reader.readLine();
      String[] splitted = line.split(" ");
      a = Integer.parseInt(splitted[0]);
      b = Integer.parseInt(splitted[1]);
		}catch(Exception e){
    }
    if (a == b) {
      System.out.println("a == b");
    }
    if (a < b) {
      System.out.println("a < b");
    }
    if (a > b){
      System.out.println("a > b");
    }
	}
}
