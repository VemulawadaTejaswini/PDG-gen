import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    Set<Integer> s=new HashSet<>(1000000);
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
      if(s.contains(a[i])){
        s.remove(a[i]);
      }else{
        s.add(a[i]);
      }
    }
    System.out.println(s.size());
  }
}