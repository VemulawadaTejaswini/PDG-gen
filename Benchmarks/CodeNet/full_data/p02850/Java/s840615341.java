import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        String con = br.readLine();
        int size = Integer.parseInt(con);

        /*int[] array = new int[size];

        for(int i = 0; i < size; i++){
          array[i] = new ArrayList<Integer>();
        }

        LinkedHashMap<Integer, List<Integer>> l_list = new LinkedHashMap<>();
        List<Integer> for_result = new ArrayList<>();
        
        //make_tree
        for(int i = 0; i < size - 1; i++){
          String[] str = br.readLine().split(" ");
          if(i == 0){
            l_list.put(Integer.parseInt(str[0]), new ArrayList<Integer>(Arrays.asList(Integer.parseInt(str[1]))));
          }else{
            if(l_list.containsKey(Integer.parseInt(str[0]))){
              l_list.get(Integer.parseInt(str[0])).add(Integer.parseInt(str[1]));
            }else{
              l_list.put(Integer.parseInt(str[0]), new ArrayList<Integer>(Arrays.asList(Integer.parseInt(str[1]))));
            }
          }
        }*/

        Map<Integer, List<Integer>> list_mp = new HashMap<>();
        List<Integer> index = new ArrayList<>();

        //make tree
        for(int i = 0; i < size -1; i++){
          String[] str = br.readLine().split(" ");
          if(i == 0){
            List<Integer> tmp_list = new ArrayList<>();
            tmp_list.add(Integer.parseInt(str[1]));
            list_mp.put(Integer.parseInt(str[0]), tmp_list);
          }else{
            if(list_mp.containsKey(Integer.parseInt(str[0]))){
              list_mp.get(Integer.parseInt(str[0])).add(Integer.parseInt(str[1]));
            }else{
              List<Integer> tmp_list = new ArrayList<>();
              tmp_list.add(Integer.parseInt(str[1]));
              list_mp.put(Integer.parseInt(str[0]), tmp_list);
            }
          }
          index.add(Integer.parseInt(str[1]));
        }

        //take_color
        int parent_color = 0;
        int min = 0;
        List<Integer> original_list = new ArrayList<>();
        Map<Integer,Integer> mp = new HashMap<>();
        
        for(int i = 0; i < size-1; i++){
          original_list.add(i+1);
        }

        for(Integer key : list_mp.keySet()) {
          if(key == 1){
            for(int i = 0; i < list_mp.get(key).size(); i++){
              mp.put(list_mp.get(key).get(i), i+1);
            } 
          }else{
            min = Collections.min(original_list);
            parent_color = mp.get(key);
            for(int i = 0; i < list_mp.get(key).size(); i++){
              if(parent_color != min){
                mp.put(list_mp.get(key).get(i), min);
              }else{
                mp.put(list_mp.get(key).get(i), min+1);
                min += 1;
              }
              min += 1;
            }
          }
        }

        //output_max
        System.out.println(Collections.max(mp.values()));

        //System.out.println(index);
        //System.out.println(mp);
        //output_for_result
  
        for (Integer i : index) {
          System.out.println(mp.get(i));
        }

      }
    }
}