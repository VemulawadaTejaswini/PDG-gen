import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    List<String> list = new ArrayList<String>();
    int N = scan.nextInt();
    for(int i = 0;i < N;i++){
      list.add(scan.nextLine());
    }
    Map<String,Integer> map = new HashMap<String,Integer>();
    List<Integer> list2 = new ArrayList<Integer>();
    for(int i = 0;i < N;i++){
      list2.set(i,0);
      for(int j = 0;j < N-1;j++){
        if(list.get(i) == list.get(j)){
          list2.set(i,list.get(i)+1);
        }
      }
    }
  }
}
