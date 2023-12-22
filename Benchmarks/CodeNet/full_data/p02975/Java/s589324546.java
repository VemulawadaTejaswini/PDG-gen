import java.util.*;
public class Main {
  public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
    List<Integer> list = new ArrayList<>();
    for(int i=0;i<N;i++){
      list.add(sc.nextInt());
    }
    Set<Integer> set = new HashSet<>(list);
    List<Integer> s = new ArrayList<>(set);

    if(s.size()==1 && s.get(0) == 0){
        System.out.println("Yes");
    }else if(s.size()==3){
      if((s.get(0)^s.get(1))==s.get(2)){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }else{
      System.out.println("No");
    }
  }
}
