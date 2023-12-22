import java.util.*;
public class Main{
	
	public static void main(String[] args){
 Scanner scanner = new Scanner(System.in);
  int N = scanner.nextInt();
  int K = scanner.nextInt();
  scanner.nextLine();
  String[] d = scanner.nextLine().split(" ");
  Double[] exp = new Double[N];
  Double val;
  for(int x =0; x<N; x++){
    val = Double.parseDouble(d[x]);
    exp[x] = (val+1)/2;
  }
  Double res = 0.0;
  for(int y = 0; y<K; y++){
    res = res + exp[y];
  }
  Double sum = res;
  for(int y = K; y<N; y++){
    res = res + exp[y] - exp[y-K];
    sum = Math.max(sum, res);
  }
  System.out.println(sum);
  

}
}