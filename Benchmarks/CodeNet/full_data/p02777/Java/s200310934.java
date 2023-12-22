import java.util.ArrayList;
import java.util.*;
import java.lang.Math;
 class Main{
     public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      List<String> l=new ArrayList<>();
      String s1=sc.next();
      String s2=sc.next();
      int i1=sc.nextInt();
      int i2=sc.nextInt();
      l.add(s1);
      l.add(s2);

      String find=sc.next();

      if(find.equals("red"))
            i1--;
      else if(find.equals("blue"))
            i2--;
      else{}
      System.out.print(i1+" "+i2);
      


      }
}  
