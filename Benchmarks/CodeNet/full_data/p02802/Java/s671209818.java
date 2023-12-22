import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] num = new int[M];
        String[] ans = new String[M];
        int WA;
        int AC;
        int ACall = 0;
        int WAall = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < M ; i++){
          num[i] = sc.nextInt();
          ans[i] = sc.next();
        }
      
       
       for(int i = 0; i < M; ++i){
         AC = 0;
         WA = 0;
         int number = num[i]; 
         if(!list.contains(number)){
           for(int j = 0; j < M  ; ++j){
          if(num[j] == number && ans[j].equals("WA") && AC == 0){
            WA++;
          }else if(num[j] == number && ans[j].equals("AC") && AC == 0){
            AC++;
            break;
          }
        }
   
           ACall += AC;
           WAall += WA;
           list.add(number);
       }
         }
        
       System.out.println(ACall + " " + WAall);
	}
}