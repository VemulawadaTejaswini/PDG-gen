import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
      	int Limit = sc.nextInt();
      	int Current,Count=0;
      for (int i = 0 ; i < N; i ++){
          Current = sc.nextInt();          
          if (Current>=Limit)
          {
            Count++;
          }
        }     
        System.out.println(Count);
      }
	}