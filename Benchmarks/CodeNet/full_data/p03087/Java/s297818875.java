import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] line1 = br.readLine().split(" ");
    
    int n = Integer.parseInt(line1[0]);
    int q = Integer.parseInt(line1[1]);
    
    String s = br.readLine();
    
    StringBuilder result = new StringBuilder();
    
    int l;
    int r;
    int temp;
    String[] question;
    for (int i=0; i<q; i++){
      question = br.readLine().split(" ");
      l = Integer.parseInt(question[0]);
      r = Integer.parseInt(question[1]);
      
      temp = s.substring(l-1, r).replaceAll("AC", "").length();
      result.append((r-l+1-temp)/2);
      result.append("\n");
    }
    System.out.println(result);
  }
}