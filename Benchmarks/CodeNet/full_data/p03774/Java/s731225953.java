import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] line1 = br.readLine().split(" ");
    int n = Integer.parseInt(line1[0]);
    int m = Integer.parseInt(line1[1]);
    int[][] students = new int[n][2];
    int[][] checkpoints = new int[m][2];
    String[] data;
    for (int i=0; i<n; i++){
      data = br.readLine().split(" ");
      students[i][0] = Integer.parseInt(data[0]);
      students[i][1] = Integer.parseInt(data[1]);
    }
    for (int i=0; i<m; i++){
      data = br.readLine().split(" ");
      checkpoints[i][0] = Integer.parseInt(data[0]);
      checkpoints[i][1] = Integer.parseInt(data[1]);
    }
    
    StringBuilder stringBuilder = new StringBuilder();
    for (int i=0; i<n; i++){
      int minDistance = Integer.MAX_VALUE;
      int minIndex = 0;
      int tempDistance;
      for (int j=0; j<m; j++){
        tempDistance = Math.abs(students[i][0] - checkpoints[j][0]) + Math.abs(students[i][1] - checkpoints[j][1]);
        if (minDistance>tempDistance){
          minIndex = j + 1;
          minDistance = tempDistance;
        }
      }
      stringBuilder.append(minIndex).append("\n");
    }
    System.out.print(stringBuilder.toString());
  }
}
