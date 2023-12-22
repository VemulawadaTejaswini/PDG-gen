import java.util.*;

public class Main{
  public static void (String[] args){
    Scanner scan = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<Integer>();
	int all = scan.nextInt();
    int extraction  = scan.nextInt();
    int b=0;
    for(int i = 0; i<all;i++){
      b=scan.nextInt();
      list.add(b);
    }
    Collections.sort(list);
    int ans=214748364;
    for(int i = 0;i<(all-extraction);i++){
      if(ans>list.get(i+extraction-1)-list.get(i)) ans = list.get(i+extraction-1)-list.get(i);
    }
    System.out.println(ans);