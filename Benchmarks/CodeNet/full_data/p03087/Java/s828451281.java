import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(),
            Q = sc.nextInt();
        String S = sc.next();
        int[] l = new int[Q],
              r = new int[Q];
        for(int i = 0; i < Q; i++){
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }
        char[] letter = S.toCharArray();
        for(int i = 0; i < Q; i++){
            int count = 0;
            for(int j = l[i]-1; j < r[i]-1; j++){ 
                if(letter[j] == 'A'){
                    if(letter[j+1] == 'C'){
                        count++;
                        j++;
                    }
                }
            }
            System.out.println(count);
        }        
    }
}