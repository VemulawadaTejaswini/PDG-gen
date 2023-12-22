import java.util.*;
public class Main{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);

    int x = sc.nextInt();
    int y = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    int[] sweetA = new int[a];
    int[] sweetB = new int[b];
    int[] sweetC = new int[c];
    
    for (int i = 0; i < a; i++){
      sweetA[i] = sc.nextInt();
    }

    for (int i = 0; i < b; i++){
      sweetB[i] = sc.nextInt();
    }

    for (int i = 0; i < c; i++){
      sweetC[i] = sc.nextInt();
    }
    
    Arrays.sort(sweetA);
    Arrays.sort(sweetB);
    Arrays.sort(sweetC);
    
    for(int i = 0; i < c; i++){
      boolean flg = true;
      if(sweetA[0] > sweetB[0]){
        flg = false;
      }
      
      if(flg){
        if(sweetA[0] < sweetC[i]){
          sweetA[0] = sweetC[i];
          Arrays.sort(sweetA);
        }
      } else {
        if(sweetB[0] < sweetC[i]){
          sweetB[0] = sweetC[i];
          Arrays.sort(sweetB);
        }
      }
    }
    
    int ans = 0;
    
    for(int i = 0; i < x; i++){
      ans += sweetA[a-1-i];
    }

    for(int i = 0; i < y; i++){
      ans += sweetB[b-1-i];
    }
    
    System.out.println(ans);
  }
}