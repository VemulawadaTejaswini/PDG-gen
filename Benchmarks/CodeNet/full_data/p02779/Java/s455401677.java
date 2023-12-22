import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   List<String> list = new ArrayList<>();
   for(int i=0; i<N; i++) {
	   list.add(sc.next());
   }
   Collections.sort(list);
   boolean flag = true;
   for(int i=0; i<list.size()-1; i++) {
   if(list.get(i).equals(list.get(i+1))) {
	   flag = false;
	   break;
   }
   }
   if(flag == true) {
       System.out.print("YES");
   }else {
	   System.out.print("NO");
   }
  }
 }

