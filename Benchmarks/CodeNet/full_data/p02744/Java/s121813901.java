import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
      String[] aj = {"a","b","c","d","e","f","g","h","i","j"};
      int n = sc.nextInt();
      int[] aaa = new int[n];
      String baseN = "0";
      String f ="%0"+n+"d";
      int befor = 0;
      int now = 0;
      int count =0;
      boolean flg = true;
      ArrayList<String> list = new ArrayList<>();
      ArrayList<String> makelist = new ArrayList<>();
      for(int i=0;i<n ;i++){
    	aaa[i] = i;
      }
      for(int i=n-1;i>0;i--){
        for(int j = i;j>-1;j--){
          aaa[i] = j;
          for(int a:aaa){
        	makelist.add(aj[a]);
      	  }
      	  list.add(String.join("", makelist));
          makelist =new ArrayList<>();
        }
      }
      Collections.reverse(list);
      
      for(String str:list){
        System.out.println(str);
      }
    }
  
  
}
