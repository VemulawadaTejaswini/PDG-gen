import java.util.*;

class Main{
 public static void main(String args[]){
   Scanner scn = new Scanner(System.in);
   int n = scn.nextInt();
   List<Integer> li = new ArrayList<>();
   for(int i = 0; i<n; i++){
	 li.add(scn.nextInt());
   }
   if(!li.contains(1)){
     System.out.println(-1);
     return;
   }
   int breaking = 0;
   int currentNo = 1;
   while(li.contains(currentNo)){
     breaking += li.indexOf(currentNo);
	 li = li.subList(li.indexOf(currentNo)+1, li.size());
     currentNo++;
   }
   breaking += li.size();
   System.out.println(breaking);
 }
}