import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int k = sc.nextInt();
    List<String> sub = new ArrayList<String>();
    String c;
    int count = 0;
    for(int i = 0;i < s.length();i++){
      for(int j = i+1;j <= s.length();j++){
        c = s.substring(i,j);
        if(!sub.contains(c)){
          sub.add(c);
        }
        count++;
        if(count == k){
          break;
        }
      }
    }
    Collections.sort(sub);
    System.out.println(sub.get(k-1));
  }
}