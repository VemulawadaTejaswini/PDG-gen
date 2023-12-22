import java.util.*;

class Main {
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
String s = sc.next();
int length = s.length();
int a = length;
int z = -1;
String ss;
for(int i = 0;i < length ;i++){
  ss = s.substring(i,i+1);
  if(ss.equals("A") && a > i){
    a = i;
  }else if(ss.equals("Z") && z < i){
    z = i;
  }
}
int ans = z - a + 1;
System.out.println(ans);

}
}