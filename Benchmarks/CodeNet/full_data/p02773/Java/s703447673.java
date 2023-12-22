import java.util.ArrayList;
import java.util.TreeMap;
import java.util.List;
import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    TreeMap<String,Integer> map = new TreeMap<>();
    for(int i = 0; i < n; i++){
      String key = sc.next();
      if(map.get(key) == null){
        map.put(key,0);
      }else{
          map.put(key, map.get(key) + 1);
      }
    }
    List<String> keylist = new ArrayList<>(map.keySet());
    List<String> output = new ArrayList<>();
    int max = 0;
    for(int i = 0; i < keylist.size(); i++){
      if(map.get(keylist.get(i)) > max){
        output.clear();
        output.add(keylist.get(i));
        max = map.get(keylist.get(i));
      }else if(map.get(keylist.get(i)) == max){
        output.add(keylist.get(i));
        max = map.get(keylist.get(i));
      }
    }
    for(int i = 0; i < output.size(); i++){
      System.out.println(output.get(i));
    }
  }
}