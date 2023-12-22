import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main{
  public static void main(String args[]){
    int n, m;
    ArrayList<Integer> x = new ArrayList<Integer>();
    ArrayList<Integer> y = new ArrayList<Integer>();
    ArrayList<Integer> aList = new ArrayList<Integer>();
    int result = 0;
    try {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String[] nums = str.split(" ");
        n = Integer.parseInt(nums[0]);
        m = Integer.parseInt(nums[1]);
        String str2;
        while((str2 = reader.readLine())!=null){
            String[] nums2 = str2.split(" ");
            x.add(Integer.parseInt(nums2[0]));
            y.add(Integer.parseInt(nums2[1]));
        }

        int input[][] = new int[m][3];

        for(int i = 0; i < m; i++){
          input[i][0] = x.get(i);
          input[i][1] = y.get(i);
          input[i][2] = 1;
        }

        for(int i = 0; i < m; i++){
          if(check(aList,input[i][0]) != true){
            int tmp = input[i][0];
            aList.add(input[i][0]);
            for(int j = 0; j < m; j++){
              if(input[j][0] == tmp && check(aList,input[j][1]) != true){
				aList.add(input[j][1]);     
              }else if(input[j][1] == tmp && check(aList,input[j][0]) != true){
                aList.add(input[j][0]);
              }
            }
            result++;
          }
        }

        for(int i = 0; i < m; i++){
          if(check(aList,input[i][0]) != true){
            int tmp = input[i][1];
            aList.add(input[i][1]);
            for(int j = 0; j < m; j++){
              if(input[j][0] == tmp && check(aList,input[j][1]) != true){
				aList.add(input[j][1]);     
              }else if(input[j][1] == tmp && check(aList,input[j][0]) != true){
                aList.add(input[j][0]);
              }
            }
            result++;
          }
        }
        System.out.println(result);
    } catch (IOException e) {
                e.printStackTrace();
    }
  }
  
  static boolean check( ArrayList<Integer> aList, int num){
  	for(int p:aList){
      if(p==num){
        return true;
      }
    }
    return false;
  }
}