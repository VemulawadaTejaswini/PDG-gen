import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	int n = Integer.parseInt(sc.next());
    String[] s = new String[n];
    for(int i=0;i<n;i++){
      s[i] = sc.next();
    }
    Map<String,Integer> map = new HashMap<>();
    Integer count;
    for(int i=0;i<n;i++){
      count=map.get(s[i]);
      if(count==null){
        map.put(s[i],1);
      }else{
        map.replace(s[i],count+1);
      }
    }
    int max = 0;
    for(Integer ii : map.values()){
      if( ii> max){
        max = ii;
      }
    }
    List<String> list = new ArrayList<>();
    for(Map.Entry<String,Integer> e : map.entrySet()){
      if(e.getValue() == max){
        list.add(e.getKey());
      }
    }
    Collections.sort(list);
    for(String str : list){
      System.out.println(str);
    }
    System.out.flush();
    
  }
}