import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
      
      //入力
      int N =sc.nextInt();//商品の種類
      int M =sc.nextInt();//選択する個数
      
      int item[] = new int[N];
      double sum =0;
      int count =0;
      
      //各商品の投票数を配列へ
      for(int i=0; i<N; i++){
        	item [i] = sc.nextInt();
             sum += item[i];//総投票数
      }
       //選択されるための最低投票数
      double min = sum/(4*M);    
      
      for(int i=0; i<N; i++){
        
        //各投票数が最低投票数を超えているか
        if(item[i]>=min){
          count++;
        }
      }
      //最低投票数以上の票がある商品をM 以上選択できるか
      if(count>=M){
          System.out.println("Yes");
            
      }
      else{
          System.out.println("No");   
      }     
    }
}