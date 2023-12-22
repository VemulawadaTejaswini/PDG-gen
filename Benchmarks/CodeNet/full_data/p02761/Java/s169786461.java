import java.util.*;

public class Main{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();
    int number_digit;
    int number;

    Map<Integer,Integer> map = new HashMap<>();


    for(int i=0; i<m; i++){
      number_digit = sc.nextInt()-1;
      number = sc.nextInt();
      if(map.containsKey(number_digit)&&number!=map.get(number_digit)){//値の上書き禁止
        System.out.println(-1);
        return;
      }
      map.put(number_digit,number);
    }


    if(map.containsKey(0)){
      if(map.get(0)==0&&n>1){
        System.out.println(-1);
        return;
      }
    }
    int ans;
    int[] c = new int[n];
    Arrays.fill(c,-1);
    for(int key : map.keySet()){
      c[key]=map.get(key);
    }
    if(c[0]==-1){
      c[0]=1;
    }
    for(int i=1; i<n; i++){
      if(c[i]==-1){
        c[i]=0;
      }
    }

    StringBuilder val = new StringBuilder();
    for(int i=0; i<n; i++){
      val.append(String.valueOf(c[i]));
    }
    System.out.println(val);


  }
}