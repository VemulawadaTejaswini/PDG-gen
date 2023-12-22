import java.util.*;
public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
      
      //入力
      int N = sc.nextInt();//数列の長さ
      
      List<Integer>youso = new ArrayList<>();
      
      //数列のlist作成
      for(int i=0; i<N; i++){
        	youso.add(sc.nextInt());
      }
      
      //数列の並び替え
      Collections.sort(youso);
      
      //数列の最後が最大値のとき
      for(int i=0; i<youso.size(); i++){
      		if(youso.get(i) < youso.get(youso.size()-1)){
              	System.out.println(youso.get(youso.size()-1));

            }
        	//数列の最後を除いたときの最大値を求める
        	else if (youso.get(i) == youso.get(youso.size()-1)){
              	System.out.println(youso.get(N-2));
            }
      }
      
    }
}