import java.util.*;

class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    char[] S = sc.next().toCharArray();
    Set<Character> stype = new HashSet<Character>();
    int[] counts = new int[N];
    int max = 0;
    
    for(int i=0; i < N - 1; i++){
      if(stype.contains(S[i])){
        continue;
      }
      stype.add(S[i]);
      //後ろから
      boolean match = false;
      for(int ri=N - 1; !match && ri > i; ri--){
        if(S[i] == S[ri]){
          match = true;
          for (int j=i; j <= ri; j++){
            ++counts[j];
            if(counts[j] > max){
              max = counts[j];
            }
          }
        }
      }      
    }
    
    System.out.println(max);
  }
}