import java.util.*;

class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();

    char[] ch = new char[s.length()];
    int count = 0;

    for(int i=0; i<s.length(); i++){
       ch[i] = s.charAt(i);
    }

    int a =(s.length())%2;

    if(a == 0){
       for(int j=0; j<(s.length())/2){
          if(ch[j] != ch[s.length()-j]){
             count++;
          }else{
             continue;
          }
       }
    }

    else if(a != 0){
       for(int j=0; j<((s.length()-1)/2){
          if(ch[j] != ch[s.length()-j]){
             count++;
          }else{
             continue;
          }
       }
    }
    System.out.println(count);
  }
}