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

        int start = 0;
        int count = 0;
        boolean first = true;
        for(int i = start; i < n - 1 && s[i].length()== 10;i++){
            s[i] += "!";
            for(int j = i + 1; j < n; j++){
                if(s[i].contains(s[j])){
                    count++;
                    s[j] += "!";
                } 
                else if(first && s[j].length() == 10){
                    start = j;
                    first = false;
                } 
            }
            answer += count*(count+1)/2;
            first = true;
            count = 0;
        } 
        System.out.println(answer);
   }
}
