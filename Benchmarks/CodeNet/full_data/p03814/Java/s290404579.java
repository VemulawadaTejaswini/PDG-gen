import java.util.*;
public class Main{

public static void main(String[] args){
  Scanner inp = new Scanner(System.in);
  String u = input.nextLine();
  int aPos = -1;
  int zPos = u.length();
  for(int i = u.length() - 1; i > 0; i--){
    String chr = u.substring(i - 1,i);
    if(chr.equals("A"))
      aPos = i;
     
  }
 public class Main{

public static void main(String[] args){
  Scanner inp = new Scanner(System.in);
  String u = input.nextLine();
  int aPos = -1;
  int zPos = u.length();
  for(int i = u.length() - 1; i > 0; i--){
    String chr = u.substring(i - 1,i);
    if(chr.equals("A"))
      aPos = i;
     
  }
  for(int j = aPos; j < u.length() - 1; j++){
    String chr2 = u.substring(j,j+ 1);
    if(chr2.equals("Z"))
      zPos = j;
  }
  System.out.println(zPos - aPos + 1); 
}
}
 for(int j = aPos; j < u.length() - 1; j++){
    String chr2 = u.substring(j,j+ 1);
    if(chr2.equals("Z"))
      zPos = j;
  }
  System.out.println(zPos - aPos + 1); 
}
}
