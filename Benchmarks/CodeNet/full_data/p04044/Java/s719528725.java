import java.util.*;

public class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int l = sc.nextInt();
      ArrayList<String> list = new ArrayList<>();
      for(int i=0;i<n;i++){
        list.add(sc.next());
      }
      Collections.sort(list);
      String output = "";
      for(String s:list){
        output = output+s;
      }
      System.out.println(output);
    }
}