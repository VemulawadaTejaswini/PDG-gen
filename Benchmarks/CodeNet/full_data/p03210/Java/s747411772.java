import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    
    switch (str) {
      case "7" :
      case "5" :
      case "3" :
        System.out.println("YES");
        break;
      default :
        System.out.println("NO");
    }
  }
}