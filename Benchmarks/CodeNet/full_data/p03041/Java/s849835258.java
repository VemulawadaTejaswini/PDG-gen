import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    ArrayList<String> x = new ArrayList<>();
    int n = sc.nextInt();
    int k = sc.nextInt();
    
    for(int i = 0;i < n;i++){
		x.add(sc.nextLine());
    }
    String lower = x.get(k - 1).toLowerCase();
    list.set(k - 1,lower);
    
    for(String i : x){
      System.out.print(i);
    }
  }
}
    
