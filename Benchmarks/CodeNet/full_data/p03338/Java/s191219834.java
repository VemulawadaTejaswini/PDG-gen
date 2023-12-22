import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        
        int Max = 1;
        for(int i = 1; i < N; i++){
           int count = 0;
           String str1 = S.substring(0,i);
           String str2 = S.substring(i,N);
           ArrayList <String> list = new ArrayList<>();
           for(int j = 0; j < i; j++){
             if(str2.contains(str1.substring(j,j+1)) && !list.contains(str1.substring(j,j+1))){
                  list.add(str1.substring(j,j+1));
                  count++;
              }
              
             if(Max < count){
                Max = count;
             }
           }
        }
        
        System.out.println(Max);
        
    }
}