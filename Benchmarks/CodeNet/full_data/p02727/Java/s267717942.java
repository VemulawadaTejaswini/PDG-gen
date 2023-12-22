import java.util.Arrays;
import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int[] da = new int[a];
    int[] db = new int[b];
    int[] dc = new int[c];
    for(int i = 0; i < a; i++){
      da[i] = sc.nextInt();
    }
    for(int i = 0; i < b; i++){
      db[i] = sc.nextInt();
    }
    for(int i = 0; i < c; i++){
      dc[i] = sc.nextInt();
    }
    Arrays.sort(da);
    Arrays.sort(db);
    Arrays.sort(dc);
    
    int atail = a - x;
    int btail = b - y;
    int ctail = c - 1;
    int sum = 0;
    for(int i = 0; i < x + y; i++){
      if(da[atail] < dc[ctail] || db[btail] < dc[ctail]){
        if(da[atail] <= db[btail]){
          sum += dc[ctail];
          ctail--;
          atail++;
        }else{
          sum += dc[ctail];
          ctail--;
          btail++;
        }
      }else{
        for(int j = atail; j < a; j++){
          sum += da[j];
        }
        for(int j = btail; j < b; j++){
          sum += db[j];
        }
        break;
      }
      if(ctail == 0){
        for(int j = atail; j < a; j++){
          sum += da[j];
        }
        for(int j = btail; j < b; j++){
          sum += db[j];
        }
        break;
      }
    }
    System.out.println(sum);
  }
}