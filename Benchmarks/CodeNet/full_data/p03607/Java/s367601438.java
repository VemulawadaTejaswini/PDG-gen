import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      
      Set<Integer> hash_set = new HashSet<Integer>();
      int nam = 0;
      
      for(int i=0;i < n;i++){
        nam = sc.nextInt();
        if(hash_set.contains(nam)){
          hash_set.remove(nam);
        }else{
          hash_set.add(nam);
        }
      }
      
      System.out.print(hash_set.size());
      
    }
}