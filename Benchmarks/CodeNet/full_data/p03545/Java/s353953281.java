import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int A = Character.getNumericValue(s.charAt(0));
        int B = Character.getNumericValue(s.charAt(1));
        int C = Character.getNumericValue(s.charAt(2));
        int D = Character.getNumericValue(s.charAt(3));
        String[] op = new String[3];

        loop:
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                for(int k = 0; k < 2; k++){
                    int sum = A;
                    if(i == 0) { sum += B; op[0] = "+"; }
                    else { sum -= B; op[0] = "-"; }
                    
                    if(j == 0){ sum += C; op[1] = "+"; }
                    else { sum -= C; op[1] = "-"; }
                    
                    if(k == 0){ sum += D; op[2] = "+"; }
                    else { sum -= D; op[2] = "-"; }
                    
                    if(sum == 7) break loop;
                }
                
            }
           
        }
        System.out.println(A+op[0]+B+op[1]+C+op[2]+D+"=7");
    }
}