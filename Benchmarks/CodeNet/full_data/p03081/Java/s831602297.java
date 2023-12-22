import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // 入力を取得
    int n = sc.nextInt();
    int maxSpell = sc.nextInt();
    String[] s = sc.next().split("",0);
    String[] target = new String[maxSpell];
    String[] move = new String[maxSpell];
    for(int i=0;i<maxSpell;i++){
      target[i] = sc.next();
      move[i] = sc.next();
    }

    int[] golem = new int[n];
    Arrays.fill(golem,1);
    int outGolem=0;

    for(int i=0;i<maxSpell;i++){
      if(move[i].equals("L")){
        for(int j=0;j<n;j++){
          if(s[j].equals(target[i])){
            if(j==0){
              outGolem+=golem[0];
              golem[0]=0;
            }else{
              golem[j-1]+=golem[j];
              golem[j]=0;
            }
          }
        }
      }else if(move[i].equals("R")){
        for(int j=n-1;j>=0;j--){
          if(s[j].equals(target[i])){
            if(j==n-1){
              outGolem+=golem[n-1];
              golem[n-1]=0;
            }else{
              golem[j+1]+=golem[j];
              golem[j]=0;
            }
          }
        }
      }
    }
    
    // 出力
    System.out.println(n-outGolem);
  }
}