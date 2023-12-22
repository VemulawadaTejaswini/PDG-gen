import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    ArrayList<Integer> arr = new ArrayList<Integer>();
    for (int i =0;i<n;i++){
    	arr.add(sc.nextInt());
    }
    Collections.sort(arr);

    long ans = 0l;
    for (int i = 0; i < n-k;i++) {
    	ans+=arr.get(i);
    }
    System.out.println(ans);
  }
}


