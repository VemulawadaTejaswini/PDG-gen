public class Main{
  public static void main(String[] args) {
    try {
      BufferedReader stdReader =
        new BufferedReader(new InputStreamReader(System.in));
      String line;
      while ((line = stdReader.readLine()) != null) { 
    	  int x = Integer.parseInt(line);
        System.out.println(x*x*x);
      }
      stdReader.close();
    } catch (Exception e) {
      e.getStackTrace();
      System.exit(0); 
    }
  }
}
