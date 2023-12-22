import java.util.Scanner;
import java.util.Arrays;

class Main{

  private static int[] input;
  private static long[][][] data;

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int cardN = Integer.parseInt(scanner.next());
    int average = Integer.parseInt(scanner.next());
    input = new int[cardN];
    for(int i=0; i<cardN; i++){
      input[i] = Integer.parseInt(scanner.next());
    }
    data = new long[cardN][cardN+1][cardN*50];
    for(int i=0; i<cardN; i++){
      for(int j=0; j<cardN+1; j++){
        Arrays.fill(data[i][j], -1l);
      }
    }

    long ans = 0l;
    if(cardN == 1){
      if(input[0] == average){
        ans ++;
      }
    }

    for(int i=1; i<cardN+1; i++){
      ans += merge(cardN, i, i*average);
    }

    System.out.println(ans);
  }

  private static long merge(int totalN, int groupN, int sum){
    if(totalN == 0){
      if(groupN==0 && sum==0){
        data[0][0][0] = 1l;
        return 1l;
      }else{
        data[0][groupN][sum] = 0l;
        return 0l;
      }
    }else if(totalN > 0){
      long ans = 0l;
      if(groupN>=0 && sum>=0){
        if(data[totalN-1][groupN][sum]==-1l){
          data[totalN-1][groupN][sum] = merge(totalN-1, groupN, sum);
        }
        ans += data[totalN-1][groupN][sum];
        if(groupN-1>=0 && sum-input[totalN-1]>=0){
          if(data[totalN-1][groupN-1][sum-input[totalN-1]]==-1){
            data[totalN-1][groupN-1][sum-input[totalN-1]] = merge(totalN-1, groupN-1, sum-input[totalN-1]);
          }
          ans += data[totalN-1][groupN-1][sum-input[totalN-1]];
        }
        return ans;
      }else{
        return 0l;
      }
    }else{
      return 0l;
    }
  }
}
