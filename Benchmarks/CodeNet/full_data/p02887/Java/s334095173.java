import java.util.*;
public class Main{
	public static void main(String[] args){
      	Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();
      	char[] c = sc.next().toCharArray();
      	int ans = 1;
      	for(int i=0;i<N-1;i++){
          if(c[i]!=c[i+1]){
            ans++;
          }
        }
        System.out.println(ans);
    }
}
      	