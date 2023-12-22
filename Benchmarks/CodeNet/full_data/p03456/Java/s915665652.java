import java.util.*;

public class Main {

public static void main(String args[])throws Exception{
  Scanner sc = new Scanner(System.in);
  int a = Integer.parseInt(sc.next());
  int b = Integer.parseInt(sc.next());
  
  ArrayList<Integer> list = new ArrayList<Integer>();
  String flag = "No";
  for (int i = 0;i<100;i++){
    list.add((int)Math.pow(i+1,2));
  }
  for(int j =0;j<100;j++){
      if(a*b==list.get(j)){
          flag= "Yes";
      }
  }
  
  System.out.println(flag);

}
}