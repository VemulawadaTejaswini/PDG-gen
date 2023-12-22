import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int h[] = new int[N];
    for(int i = 0; i < N; i++){
      h[i] = sc.nextInt();
    }
    int tmp = 0;
    int count = 0;
    do{
      tmp = count;
      int min = 100;
      int index = 0;
      int lastValue = 0;
      for(int i = 0; i < N; i++){
        if(h[i] == 0){
          if(lastValue == 0){
            index = i + 1;
            continue;
          }
          for(int j = index; j < i; j++){
            h[j] -= min;
          }
          count += min;
          min = 100;
          index = i + 1;
          lastValue = 0;
        }else if(i == N-1){
          min = (min < h[i]) ? min : h[i];
          for(int j = index; j <= i; j++){
            h[j] -= min;
          }
          count += min;
          min = 100;
          index = i + 1;
        }
        min = (min < h[i]) ? min : h[i];
        lastValue = h[i];
      }
    }while(tmp != count);
    System.out.println(count);
  }
}