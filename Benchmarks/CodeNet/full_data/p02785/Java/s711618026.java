import java.util.*;
public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

      //入力
      int m =sc.nextInt();
      int waza =sc.nextInt();//必殺技回数
      
      ArrayList<Long>hp=new ArrayList<>();
      
      for(int i=0; i<m; i++){
      		hp.add(sc.nextLong());
      }
      
      Collections.reverse(hp);
      
      long count =0;
      int kougeki =0;
      
      for(int i=0; i<hp.size(); i++){
        	count+=1;
        if(count > waza){
          		long specialwaza = hp.get(i);
          		kougeki += specialwaza;
        }
      }
      System.out.println(kougeki);
    }
}