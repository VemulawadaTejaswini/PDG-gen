import java.util.Scanner;
import java.util.HashMap;
import java.util.Collections;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      HashMap<String, Integer> list = new HashMap<String, Integer>();
      int count;
      int max=0;
      for(int i=0;i<n;i++){
        String s = sc.next();
        if(list.containsKey(s)) {
          count=list.get(s)+1;
        }else{
          count=1;
        }
        max=Math.max(max,count);
        list.put(s,count); 
      }
      ArrayList<String> strlist = new ArrayList<>();
      for(String Key : list.keySet()){
        if(list.get(Key)==max){
           strlist.add(Key);
        }
      }
      Collections.sort(strlist);
      for(String i : strlist) {
            System.out.println(i);
      }
    }
}
