import java.util.*;
 
class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
  String s1=sc.nextLine();
  String s2=sc.nextLine();
  int count=0,i;
  for(i=0;i<s1.length();i++){
    if(s1.charAt(i)==s2.charAt(i))
      count++;
}
  System.out.println(count);
}

}