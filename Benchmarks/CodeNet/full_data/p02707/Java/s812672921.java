import java.util.*;
 public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      	int N = scanner.nextInt();//会社に何人いるか
      
      //List <Integer> n = new ArrayList<Integer>();//各社員の部下の数を格納
      List <Integer> a = new ArrayList <Integer>();//各社員の上司番号を格納
      int n[] = new int[N];
      for(int i=0; i<N; i++){
      //n.add(0);//各社員の部下の数の表記を一旦0と置く...[0,0,0,0,0]
        n[i] = 0;
      }
      
      for(int i=0; i<N-1; i++){
         a.add(scanner.nextInt());//各社員の上司番号を入れる...[1,1,2,2]
      }
      
      int b = 0;
      for(int i=0; i<N-1; i++){
        b = a.get(i);//[1,1,2,2]をbに一つずつ代入していく
        //n.set(b-1,n.get(b-1)+1);//n.set(0,1)...0番目のところに1を置き換える
        //n.get(b-1)+1はi=0で始まっているため,nの0番目に+1加算していくことを表している
        n[b-1] +=1;//[b-1]番目にずつ1加算していく
      }
      for(int i=0; i<N; i++){
       System.out.println(n[i]);
      }
    }
 }