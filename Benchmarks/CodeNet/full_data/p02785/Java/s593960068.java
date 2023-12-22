import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long K = sc.nextLong();
    ArrayList<Integer> hp = new ArrayList<>();
    long sum = 0;
    for(int i=0; i<N; i++){
      long tmp = sc.nextLong();
      hp.add(tmp);
      sum += tmp;
    }
    if(K>0){
      Collections.sort(hp);
      for(int i=0; i<K; i++){
        long tmpHp = hp[i] - K;
        if(tmpHp>0){
          sum -= K;
        }else{
          sum -= hp[i];
      }
    }
    System.out.println(sum);
  }
}
}
