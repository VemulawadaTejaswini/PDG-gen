public class Main{
	public static void main(String args[]){
    int ans1 = 1, ans2 = 0;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    try{
      String line = reader.readLine();
      for(String splitted: line.split(" ")){
        ans1 *= Integer.parseInt(splitted);
        ans2 += Integer.parseInt(splitted) * 2;
      }
		}catch(Exception e){
      ans1 = 0;
    }
		System.out.println(ans1 + " " + ans2);
	}
}
