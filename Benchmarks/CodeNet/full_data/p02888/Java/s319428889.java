import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] nums = new int[n];

    for(int i=0; i<n; i++){
      nums[i] = sc.nextInt();
    }

    Arrays.sort(nums);
    int cnt = 0;

    for(int i=0; i<n-2; i++){
      for(int j=i+1; j<n-1; j++){
        for(int k=j+1; k<n; k++){
          if(nums[k]<nums[i]+nums[j]){
            cnt++;
          }
        }
      }
    }
    System.out.println(cnt);
  }
}
