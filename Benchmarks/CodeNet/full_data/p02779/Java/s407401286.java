import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    ArrayList<Integer> num = new ArrayList<>();
    for(int i=0; i<N; i++){
      int tmp = sc.nextInt();
      if(!num.contains(tmp)){
        num.add(tmp);
      }else{
        System.out.print("No");
        return;
      }
    }
    System.out.print("Yes");
  }
}