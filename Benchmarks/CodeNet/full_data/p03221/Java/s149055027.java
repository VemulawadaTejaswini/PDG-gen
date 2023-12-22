import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class Main {

 public static void main(String[] args) throws IOException {
//  System.setIn(new FileInputStream("C:\\ats-2.1.0\\workspace\\test\\t.txt"));
  BufferedReader xx = new BufferedReader(new InputStreamReader(System.in));
  StringTokenizer in = new StringTokenizer(xx.readLine());
  int N = Integer.parseInt(in.nextToken());
  int M = Integer.parseInt(in.nextToken());
  int[][] area = new int[M][2];
  
  for(int i = 0; i < M; i++){
   in = new StringTokenizer(xx.readLine());
   area[i][0] = Integer.parseInt(in.nextToken());
   area[i][1] = Integer.parseInt(in.nextToken());
  }

  List<Map<Integer, String>> quyu = new LinkedList<Map<Integer,String>>();
  for(int i = 0; i < N; i++){
   Map<Integer, String> xiaquMap = new HashMap<Integer, String>();
   for(int j = 0; j < M; j++){
    int city = area[j][0];
    int year = area[j][1];
    if(city == (i+1)){
     int citySix = 1000000+city;
     xiaquMap.put(j, citySix+"_"+year);
    }
   }
   
   List<Map.Entry<Integer, String>> list = new ArrayList<Map.Entry<Integer,String>>(xiaquMap.entrySet());
   Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
    @Override
    public int compare(Entry<Integer, String> o1,
      Entry<Integer, String> o2) {
     return o1.getValue().compareTo(o2.getValue());
    }
   });
   

   int index = 1;
   for(Map.Entry<Integer, String> entry:list){
    String  value  = entry.getValue();
    
    String[] temarr = value.split("_");
    String yearStr = String.valueOf(1000000+index).substring(1);
    String cityStr = temarr[0].substring(1);
    entry.setValue(cityStr+yearStr);
    index ++;
   }
   
   quyu.add(xiaquMap);
  }
  
  Map<Integer, String> resultMap = new HashMap<Integer, String>();
  for (Map<Integer, String> map : quyu) {
   resultMap.putAll(map);
  }
  
  
  List<Map.Entry<Integer, String>> list1 = new ArrayList<Map.Entry<Integer,String>>(resultMap.entrySet());
  Collections.sort(list1, new Comparator<Map.Entry<Integer, String>>() {
   @Override
   public int compare(Entry<Integer, String> o1,
     Entry<Integer, String> o2) {
    return o1.getValue().compareTo(o2.getValue());
   }
  });
  
  for(Map.Entry<Integer, String> entry : list1){
//   System.out.println("key=" + entry.getKey() + ", value=" + entry.getValue());
   System.out.println(entry.getValue());
  }
 }
}
