import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main{
 public static void main(String[] args){

   Scanner sc = new Scanner(System.in);
   String N = sc.next();
   long sum = 0;
   List<String> list = new ArrayList<>();
   list.add(N);

   while(!list.get(0).equals(0)) {
       List<String> copy = new ArrayList<>(list);
       list.clear();

   for(String s : copy) {
	   long lon = Long.parseLong(s);
	   lon = lon/2;
       String str = String.valueOf(lon);
       list.add(str);
       list.add(str);
       sum += 1;
   }
   }
	 System.out.print(sum);
   }

}