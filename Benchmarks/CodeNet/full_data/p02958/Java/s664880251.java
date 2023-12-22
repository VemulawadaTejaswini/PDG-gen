import java.io.*;

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String[] line = br.readLine().split(" ");
    int[] array = new int[n];
    int i=0;
    int count = 0;
    for(; i<n; i++){
      array[i] = Integer.parseInt(line[i]);
      if( array[i] != i+1 ){
        count++;
        if( 2 < count ){
          System.out.println("NO");
          break;
        }
      }
    }
    if( i == n )
      System.out.println("YES");
  }
}
