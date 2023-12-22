import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int numData = Integer.parseInt(br.readLine());
    
    int currentT = 0;
    int currentX = 0;
    int currentY = 0;
    int nextT = 0;
    int nextX = 0;
    int nextY = 0;
    int amountMove = 0;
    
    for(int i=0; i<numData; i++){
      String[] data = br.readLine().split(" ");
      nextT = Integer.parseInt(data[0]);
      nextX = Integer.parseInt(data[1]);
      nextY = Integer.parseInt(data[2]);
      
      amountMove = Math.abs(nextX - currentX) + Math.abs(nextY - currentY);
      if(amountMove > nextT-currentT || (nextT-currentT-amountMove)%2 != 0){
        System.out.println("No");
        return;
      }
    }
    System.out.println("Yes");
  }
}