import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<Integer> arr = new ArrayList<Integer>();
    for(int i=1;i<=n;i++){
      arr.add(i);
    }
    TreeMap<Integer, Integer> map = new TreeMap<Integer,Integer>();
    for(int i=0;i<n-1;i++){
      int a = sc.nextInt();
      if(map.get(a)!=null){
        map.put(a, map.get(a)+1);
      }
      else{
        map.put(a,1);
        arr.remove((Integer)a);
      }
    }
    for(int i=0;i<arr.size();i++){
      map.put(arr.get(i),0);
    }
    map.forEach((k, v) -> System.out.println(v)); 
  }
}