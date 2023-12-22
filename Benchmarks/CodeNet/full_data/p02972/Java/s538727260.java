import java.util.*;

public class Main{
  public static void main(String[] args){
  	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] nums = new int[n];
    int num;
    for (int ind=0; ind <n; ind++){
    	num = sc.nextInt();
      	nums[ind] = num;
    }
    int[] res = new int[n];
    for (int i=n-1; i >= 0; i--){
    	int nex = i;
      	while (nex < n) {
        	res[i] ^= nums[nex];
          	nex += i+1;
        }
    }
    int rescnt = 0;
    List<Integer> ret = new ArrayList<>();
    for (int j=0; j < n; j++){
    	if (res[j] == 1){
        	rescnt += 1;
          ret.add(nums[j]);
        }
    }
    System.out.println(rescnt);
    if (rescnt >0){
    for (int k=0; k<rescnt-1; k++){
    System.out.print(ret.get(k));
      System.out.print(' ');
    }
    System.out.print(ret.get(rescnt-1));}
  }
}