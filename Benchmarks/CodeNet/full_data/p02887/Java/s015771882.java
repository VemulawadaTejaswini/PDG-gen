import java.util.*;
public class Main {
public static void main(String[] args){
Scanner s=new Scanner(System.in);
  int n=s.nextInt();
  String slime=s.next();
  List<Character> color=new ArrayList<>();
  for(int i=0;i<n;i++){
    color.add(slime.charAt(i));
  }
  int cnt=color.size();
  int ans=color.size();
  for(int i=0;i<ans-1;i++){
 if(color.get(i).equals(color.get(i+1))){
 cnt--;
 }
  }
 System.out.println(cnt);
}
}