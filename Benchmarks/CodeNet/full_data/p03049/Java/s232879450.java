import java.io.*;

public class Main{
  public static void main(String... args) throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String line = stdin.readLine();
    String[] in = line.split(" ");
    int n = Integer.parseInt(in[0]);
    System.err.println(n);
    int beginB = 0;
    int endA = 0;
    int naka = 0;
	for (int i=0; i<n; i++) {
	    line = stdin.readLine();
      	if (line[0] == 'B') {
          beginB++;
        }
      	if (line[line.size()] == 'A') {
          endE++;
        }
        naka += line.replace("AB");
    }
    System.err.println(beginB);
    System.err.println(endA);
    System.err.println(naka);
    
    System.out.println(naka + Math.min(beginB, endA));
  }
}