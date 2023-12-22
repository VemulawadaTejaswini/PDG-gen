import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
        int count = 1;
        boolean ans = true;
        String front[] = new String[100];
        String back[] = new String[100];
      	String tmp,tmp2;
      
        
        List<String> list = new ArrayList<String>();
        tmp = sc.next();
        list.add(tmp);
        while(count < n){
          tmp2 = sc.next();
          list.add(tmp2);
          front = tmp.split("");
          back =  tmp2.split("");
          if(!back[0].equals(front[front.length - 1])){
            System.out.println("No");
            return;
          }
          
          ans = (list.size() == new HashSet<>(list).size());
          if(ans == false){
            System.out.println("No");
            return;
          }
          
          tmp = tmp2;
          count++;
        }
        
        
        
        System.out.println("Yes");
    }
}