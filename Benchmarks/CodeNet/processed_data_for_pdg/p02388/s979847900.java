public class Main {
  public static void main(String[] args) {
    int num;
    try ( BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in)) ) {
      num = Integer.parseInt( br.readLine() );
      System.out.println( num * num * num );
    } catch( IOException e) {
      System.out.println("IOException!");
    }
  }
}
