import java.io.*;
public class Main{
  public static void main(String[] args){
    try{
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	  int[] a = new int[4];
      String s = bf.readLine();
	  for(int i = 0; i < 4; i++)
        a[i] = charToInt(s, i);
      for(int i = 0; i < 8; i++){
        int ans = a[0];
      	for(int j = 0; j < 3; j++){
          int k = i>>j;
          if(k%2 == 1)
            ans += a[j+1];
          else
            ans -= a[j+1];
        }
        if(ans == 7){
          for(int j = 0; j < 3; j++){
            System.out.print(a[j]);
            System.out.print((i>>j)%2 == 1 ? "+" : "-");
          }
          System.out.println(a[3]+"=7");
          return;
        }
      }
    } catch(IOException e){}
  }
  public static int charToInt(String s, int k){
  	return Character.getNumericValue(s.charAt(k));
  }
}
    