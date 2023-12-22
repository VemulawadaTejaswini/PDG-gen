import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
    String s[] = new String[N];
    String sArray[][] = new String[N][];
    
    sc.nextLine();
    for(int i=0; i<N; i++){
      s[i] = sc.nextLine();
      sArray[i] = s[i].split("");
      Arrays.sort(sArray[i]);
    }
    
    long sumCnt = 0;
    for(int i=0; i<N-1; i++){
      for(int j=i+1; j<N; j++){
        if(Arrays.equals(sArray[i],sArray[j]))
          sumCnt++;
      }
    }
    System.out.println(sumCnt);
  }
}