import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc  = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int h = Integer.parseInt(sc.next());
    int[][] damage = new int[n][2];
    
    for(int i=0;i<n;i++){
      damage[i][0] = Integer.parseInt(sc.next());
      damage[i][1] = Integer.parseInt(sc.next());
    }
    Arrays.sort(damage,new Comparator<int[]>(){
      @Override
      public int compare(int[] o1,int[] o2){
        return o2[1]-o1[1];
      }
    });
   	int maxa = 0;
    int idx = 0;
    for(int i=0;i<n;i++){
      if(damage[i][0] >= maxa){
        maxa = damage[i][0];
        idx = i;
      }
    }
    int count = 0;
    for(int i=0;i<n;i++){
      if(damage[i][1] > maxa && i!=idx){
        h-=damage[i][1];
        count++;
      }
      if(h <= 0){
        break;
      }
    }
    if(h <= 0){
      System.out.println(count);
    }else if(h<=damage[idx][1]){
      System.out.println(count + 1);
    }else{
      
      System.out.println(count + 1 + (h-damage[idx][1]+maxa-1)/maxa);
    }
  }
}