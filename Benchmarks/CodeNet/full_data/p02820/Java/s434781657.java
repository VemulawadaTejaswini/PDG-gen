import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int r = sc.nextInt();
    int s = sc.nextInt();
    int p = sc.nextInt();
    char[] c = sc.next().toCharArray();
    int score = 0;
    ArrayList<Character> list = new ArrayList<>();
    for(int i=0;i<n;i++)list.add(c[i]);
    for(int i=k;i<list.size();i++)
      if(list.get(i)==list.get(i-k))list.set(i,'n');
    for(char u:list){
      if(u=='r')score+=p;
      else if(u=='s')score+=r;
      else if(u=='p')score+=s;
    }
    System.out.println(score);
  }
}