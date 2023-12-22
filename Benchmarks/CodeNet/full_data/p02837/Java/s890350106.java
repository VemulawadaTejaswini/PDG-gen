import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
      
        //for_output
        int result = 0;
        List<Integer> result_list = new ArrayList<>();

        // input
        int num = Integer.parseInt(br.readLine());
        List<Integer> people = new ArrayList<>(num);

        Answer[] ans = new Answer[num];
        for(int i = 0; i < num; i++){
          ans[i] = new Answer();
          people.add(i);
        }

        for(int i = 0; i < num; i++){
          int speak = Integer.parseInt(br.readLine());
          for(int j = 0; j < speak; j++){
            String[] answer = br.readLine().split(" ");
            ans[i].mp.put(Integer.parseInt(answer[0])-1, Integer.parseInt(answer[1]));
          }  
        }

        // for_algorithm
        int pattern = (int)Math.pow(2.0, (double)num);
        boolean false_flag = false;

        //algorithm
        for(int i = 0; i < pattern; i++){
          List<Integer> true_list = new ArrayList<>();
          List<Integer> false_list = new ArrayList<>();
 
          for(int j = 0; j < num; j++){
            if((1&i>>j) == 1){
              true_list.add(j);
            }else{
              false_list.add(j);
            }
          }

          result = 0;
          //false_flag = false;

          if(true_list.size() == 0){
            result = 0;
            result_list.add(result);
          }else{
            loop:for(int t = 0; t < true_list.size(); t++){
              for (Integer key : ans[true_list.get(t)].mp.keySet()) {
                if(true_list.contains(key)){
                  if(ans[true_list.get(t)].mp.get(key) == 1){
                    result = true_list.size();
                  }else{
                    result = 0;
                    break loop;
                    //false_flag = true;
                  }
                }else if(false_list.contains(key)){
                  if(ans[true_list.get(t)].mp.get(key) == 0){
                    result = true_list.size();
                  }else{
                    result = 0;
                    break loop;
                    //false_flag = true;
                  }
                }
              }
            }
            /*if(false_flag){
              result = 0;
            }*/
            //System.out.println(result);
            result_list.add(result);
          }
        }
        //System.out.println(result_list);
        System.out.println(Collections.max(result_list));
      }
    }

    public static class Answer{
      Map<Integer, Integer> mp;

      Answer(){
        this.mp = new HashMap<>();
      }
    } 
}
