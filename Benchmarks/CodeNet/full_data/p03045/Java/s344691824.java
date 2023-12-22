import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class Main{
  private static int rmc = 0;
  public static void main(String args[]){
    int n, m;
    ArrayList<int[]> input = new ArrayList<>();
    
    try {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String[] tmp = str.split(" ");
        n = Integer.parseInt(tmp[0]);
        m = Integer.parseInt(tmp[1]);
        String str2;
        while((str2 = reader.readLine())!=null){
            String[] tmp2 = str2.split(" ");
          	int nums[] = new int[2];
            nums[0] = Integer.parseInt(tmp2[0]);
            nums[1] = Integer.parseInt(tmp2[1]);
          	input.add(nums);
        }
      	int kekka = n + count(input);
      	System.out.println(kekka);
    } catch (IOException e) {
                e.printStackTrace();
    }
  }
  
  public static int count(ArrayList<int[]> list){
    int result = 0;
    int c = 0;
    Iterator<int[]> it = list.iterator();
  	while(it.hasNext()){
      	int[] val = it.next();
      	if(val[0] != 0 && val[1] != 0){
          rm(list,val[0]);
          rm(list,val[1]);
          result++;
          c++;c++;
          it.remove();
        }
    }
    
    it = list.iterator();
  	while(it.hasNext()){
      	int[] val = it.next();
      	if(val[0] == 0 && val[1] != 0){
          rm(list,val[1]);
          c++;
        }
        if(val[0] != 0 && val[1] == 0){
          rm(list,val[0]);
          c++;
        }
    }
    
    result -= c;
    return result;
  }
    
    
  public static void rm(ArrayList<int[]> list, int target){
    Iterator<int[]> it = list.iterator();
    while(it.hasNext()){
      int[] val = it.next();
      if(val[0] == target){
          val[0] = 0;
      }
      if(val[1] == target){
          val[1] = 0;
      }
    }
  }
  
  public static void print(ArrayList<int[]> list){
	for(int[] val : list){
		System.out.println(val[0] + ":" + val[1]);
    }
    System.out.println("----------------------------");
  }
}