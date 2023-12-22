import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String s = sc.next();

      int[][] arr = new int[n][3];
      for(int i = s.length() - 2; i >= 0; i--) {
        arr[i][0] = arr[i+1][0];
        arr[i][1] = arr[i+1][1];
        arr[i][2] = arr[i+1][2];
        char c = s.charAt(i+1);
        if(c == 'R') {
          arr[i][0]++;
        } else if(c == 'G'){
          arr[i][1]++;
        } else {
          arr[i][2]++;
        }
      }
      
      long sum = 0;
      for(int i = 0; i < n; i++) {
        char a = s.charAt(i);
        
        for(int j = i + 1; j < n; j++) {
          char b = s.charAt(j);
          if(a == b) continue;
          
          if(a == 'R' && b == 'G' || a == 'G' && b == 'R') {
            sum += arr[j][2]; //B
            if(j + j - i < s.length() && s.charAt(j + j - i) == 'B')
              sum--;
          }
          else if(a == 'B' && b == 'G' || a == 'G' && b == 'B') {
            sum += arr[j][0]; // R
            if(j + j - i < s.length() && s.charAt(j + j - i) == 'R')
              sum--;
          }
          else {
            sum += arr[j][1]; // G
            if(j + j - i < s.length() && s.charAt(j + j - i) == 'G')
              sum--;
          }
        }
      } 

      System.out.println(sum);
  }
}
