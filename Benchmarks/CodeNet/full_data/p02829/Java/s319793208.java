import java.util.*;

class Main{
 public static void main(String args[]){
   Scanner scn = new Scanner(System.in);
   String a = scn.nextLine();
   String b = scn.nextLine();
   List<String> li = new ArrayList<String>();
   li.add("1");
   li.add("2");
   li.add("3");
   li.remove(a);
   li.remove(b);
   System.out.println(Integer.parseInt(li.get(0)));
 }
}