import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int h ;
    ArrayList<Integer> list = new ArrayList<Integer>();

    for(int i=0; i<n; i++){
      h = sc.nextInt();
      list.add(h);

    }
    //System.out.println(list);

    for(int j=0; j<n-1; j++){
      if(list.get(j)>list.get(j+1)){
        list.set(j,list.get(j)-1);
        if(j==0 && list.get(j)>list.get(j+1)){
          //処理しても右の方が大きい場合の処理
          System.out.println("No");
          return ;
        }
        if(list.get(j-1)>list.get(j)||list.get(j)>list.get(j+1)){
          System.out.println("No");
          return ;
        }
      }
      //System.out.println(list);
    }
    System.out.println("Yes");
  }
}