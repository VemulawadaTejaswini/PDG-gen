import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      String S = sc.next();
      
      // RGBリストを作成
      List<Integer> listR = new ArrayList<Integer>();
      List<Integer> listG = new ArrayList<Integer>();
      List<Integer> listB = new ArrayList<Integer>();
      for(int i = 0; i < N; i++){
        String color = strAt(S, i);
        if(color.equals("R")){
          listR.add(i);
        }else if(color.equals("G")){
          listG.add(i);
        }else{
          listB.add(i);
        }
      }
      
      // 各リストから1つ選択
      Long count = 0L;
      for(int i = 0; i < listR.size(); i++){
        for(int j = 0; j < listG.size(); j++){
          for(int k = 0; k < listB.size(); k++){
            int[] nums = new int[3];
            nums[0] = listR.get(i);
            nums[1] = listG.get(j);
            nums[2] = listB.get(k);
            nums = sort(nums);
            //System.out.println(nums[0] + " " + nums[1] + " " + nums[2]);
            if(isDiffInterbal(nums)){
              count++;
            }
          }
        }
      }
      
      // 出力
      System.out.println(count);
    }
    
    // 3数をソートする関数
    public static int[] sort(int[] nums){
      int[] result = new int[3];
      int n1 = nums[0];
      int n2 = nums[1];
      int n3 = nums[2];
      if(n1 < n2){
        if(n2 < n3){
          result[0] = n1;
          result[1] = n2;
          result[2] = n3;
        }else if(n1 < n3){
          result[0] = n1;
          result[1] = n3;
          result[2] = n2;
        }else{
          result[0] = n3;
          result[1] = n1;
          result[2] = n2;
        }
      }else{
        if(n1 < n3){
          result[0] = n2;
          result[1] = n1;
          result[2] = n3;
        }else if(n2 < n3){
          result[0] = n2;
          result[1] = n3;
          result[2] = n1;
        }else{
          result[0] = n3;
          result[1] = n2;
          result[2] = n1;
        }
      }
      
      return result;
    }
    
    // 3数の間隔が異なるか判定する関数(条件2)
    public static boolean isDiffInterbal(int[] nums){
      if(nums[1] - nums[0] == nums[2] - nums[1]){
        return false;
      }else{
        return true;
      }
    }
    

}