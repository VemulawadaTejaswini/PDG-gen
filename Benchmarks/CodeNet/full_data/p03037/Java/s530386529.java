import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main{
  public static void main(String[] args){
    try{
    BufferedReader re = new BufferedReader(new InputStreamReader(System.in));
    String as = re.readLine();
    String aa[] = as.split(" ");
    String aaa = aa[0];
    String bbb = aa[1];  
    int a = Integer.parseInt(aaa);
    int b = Integer.parseInt(bbb);
    int[][] c = new int[b][2];
    int ans = 0;
    for(int i = 0;i < b;i++){
      String al = re.readLine();
      String bb[] = al.split(" ");
      String ccc = bb[0];
      String ddd = bb[1];  
      c[i][0] = Integer.parseInt(ccc);
      c[i][1] = Integer.parseInt(ddd);      
    }
    for(int x = 1;x <= a;x++){
      int count = 0;
      for(int y = 0;y < b;y++){
        for(int z = c[y][0];z <= c[y][1];z++){
          if(z == x){
            count++;
            break;
          }
        }
      }
      if(count == b) ans++;
    }
    System.out.println(ans);
    }catch(IOException e){
      System.out.println(e);
    }
  }
}