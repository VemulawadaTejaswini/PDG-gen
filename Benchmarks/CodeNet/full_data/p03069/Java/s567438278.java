import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String line = sc.next();
        String S[] = line.split("");
        boolean wasSharp = false;
        boolean wasDot = false;
        int count1 = 0;
        int count2 = 0;
        int total = 0;
        for(int i = 0; i < N ;i++){
            if(S[i].equals("#")){
                wasSharp = true;
                count1++;
                continue;
            }
            if(wasSharp&&S[i].equals(".")){
                for(int j = i; j < N; j++){
                    if(!S[j].equals("#")){
                        count2++;
                    }else{
                        break;
                    }
                }
                wasSharp = false;
                if(count1 > count2){
                    total += count2;
                }else{
                    total += count1;
                }
                count1 = 0;
                count2 = 0;
            }
        }
        System.out.println(total);
    }
    // ....#######.....####.....
    // ....################.....
}
