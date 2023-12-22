import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

 public static void main(String[] args) throws FileNotFoundException {
  Scanner in = new Scanner(System.in);
  int N = in.nextInt();
  int M = in.nextInt();
  int[][] area = new int[M][2];
  
  for(int i = 0; i < M; i++){
   area[i][0] = in.nextInt();
   area[i][1] = in.nextInt();
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
  
  for(Map.Entry<Integer, String> entry : resultMap.entrySet()){
   System.out.println(entry.getValue());
  }
 }
}
