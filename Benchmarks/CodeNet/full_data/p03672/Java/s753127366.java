import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    sc.close();
    for(int i=s.length()-1;i>0;i--){
      String st=s.substring(0,s.length()-i);
      if(isHasEvenWords(st)){
        System.out.println(st.length());
        return;
      }
    }
  }
  public static boolean isHasEvenWords(String str){
    if((str.length())%2!=0){
      return false;
    }
    String s[]=new String[str.length()];
    for(int i=0;i<s.length;i++){
      s[i]=str.substring(i,i+1);
    }
    Arrays.sort(s);
    for(int i=0;i<s.length-1;i+=2){
      if(!(s[i].equals(s[i+1]))){
        return false;
      }
    }
    return true;
  }
}