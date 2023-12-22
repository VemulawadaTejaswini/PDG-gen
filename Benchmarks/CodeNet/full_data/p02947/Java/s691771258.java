import java.util.*;
 
class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        // String[] s = new String [n];
        char[][] c = new char [n][10];
        String[] s = new String[n];
        long answer = 0;
        Arrays.setAll(s, i -> stdIn.next());
        for(int  i = 0; i < n; i++){
            c[i] = s[i].toCharArray();
            Arrays.sort(c[i]);
            s[i] = new String(c[i]);
        }

            
        for(int i = 0; i < n - 1;i++){
            for(int j = i + 1; j < n; j++){
                if(s[i].contains(s[j])) answer++;
            }
        } 
        System.out.println(answer);
   }
}