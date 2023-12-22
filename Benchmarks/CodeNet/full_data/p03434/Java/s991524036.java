import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
    int scores[] = new int[N];
    for (int count = 0; count < N; count++){
      int a = sc.nextInt();
      scores[count] = a;
    }
    int Alice=0;
    int Bob=0;
    Arrays.toString(scores);
    for(int count2 = N-1;count2>=0;count2=count2-2){
     int count3 = count2-1;
     if(count3>=0){
     Alice = Alice + scores[count3];
     Bob = Bob + scores[count2];
   }
     else{
       int abc=N-1;
       Alice = Alice + scores[abc];
     }
  }
    int ans = Alice-Bob ;
    System.out.println(ans);
	}
}
