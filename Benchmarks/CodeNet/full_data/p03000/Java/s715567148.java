import java.util.*;

public class Main{
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int result = 0;
    int cnt = 0;
    
    ArrayList<Integer> bndList = new ArrayList<Integer>();
    
    for(int i = 0; i<=n; i++){
      	if(i != 0){
        int l = sc.nextInt();
      	result = result + l;
        }
      	bndList.add(result);
    }
    
    for (int i=0; i<bndList.size(); ++i){
      int z = bndList.get(i);
      if(z <= x){
        cnt++;
      }
    }
    System.out.println(cnt);  
  }
 }
