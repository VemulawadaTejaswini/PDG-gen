import java.util.*;
public class Main{
  public static Map<String, Long> map = new HashMap<>();
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long L = sc.nextLong();
    int N = sc.nextInt();
    long[] X = new long[N+1];
    X[0] = 0;
    for(int i = 1; i <= N; i++){
      X[i] = sc.nextLong();
    }
    System.out.println(solve(N, X, L));
  }
  
  public static long solve(int N, long[] X, long L){
    return reve(N, X, 0, L);
  }
  
  public static long func(int N, long[] array, boolean der, int index, long L){
    if(N == 0){
      return 0;
    }
    if(map.containsKey(Arrays.toString(array)) && N == array.length){
      return map.get(Arrays.toString(array));
    }
    long[] arrayCopy = Arrays.copyOf(array, array.length);
    int lastIndex = index;
    boolean flag = false;
    if(der){
      do{
        index++;
        if(index == array.length){
          index = 0;
          flag = true;
        }
      }while(arrayCopy[index] == 0);
    }else{
      do{
        index--;
        if(index == -1){
          index = array.length-1;
          flag = true;
        }
      }while(arrayCopy[index] == 0);
    }
    long tmp;
    if(!flag){
      tmp = Math.abs(arrayCopy[index]-arrayCopy[lastIndex]);
    }else if(der){
      tmp = Math.abs(L - arrayCopy[lastIndex] + arrayCopy[index]);
    }else{
      tmp = Math.abs(L - arrayCopy[index] + arrayCopy[lastIndex]);
    }
    arrayCopy[lastIndex] = 0;
    long ans = tmp + reve(N-1, arrayCopy, index, L);
    map.put(Arrays.toString(array), ans);
    return ans;
  }
  
  public static long reve(int N, long[] array, int index, long L){
    return Math.max(func(N, array, true, index, L), func(N, array, false, index, L));
  }
}