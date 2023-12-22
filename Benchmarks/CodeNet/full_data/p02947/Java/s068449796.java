import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();

        String[] s = new String[N];
        for(int i = 0; i < N; i++)
            s[i] = sc.next();       
        
        int count = 0;
        int[][] str = new int[N][26];
        for(int j = 0; j < N; j++){
            for(int i = 0; i < 10; i++){
                if(s[j].charAt(i) == 'a')
                str[j][0]++;
                if(s[j].charAt(i) == 'b')
                str[j][1]++;
                if(s[j].charAt(i) == 'c')
                str[j][2]++;
                if(s[j].charAt(i) == 'd')
                str[j][3]++;
            if(s[j].charAt(i) == 'e')
                str[j][4]++;
            if(s[j].charAt(i) == 'f')
                str[j][5]++;
            if(s[j].charAt(i) == 'g')
                str[j][6]++;
            if(s[j].charAt(i) == 'h')
                str[j][7]++;
            if(s[j].charAt(i) == 'i')
                str[j][8]++;
            if(s[j].charAt(i) == 'j')
                str[j][9]++;
            if(s[j].charAt(i) == 'k')
                str[j][10]++;
            if(s[j].charAt(i) == 'l')
                str[j][11]++;
            if(s[j].charAt(i) == 'm')
                str[j][12]++;
            if(s[j].charAt(i) == 'n')
                str[j][13]++;
            if(s[j].charAt(i) == 'o')
                str[j][14]++;
            if(s[j].charAt(i) == 'p')
                str[j][15]++;
            if(s[j].charAt(i) == 'q')
                str[j][16]++;
            if(s[j].charAt(i) == 'r')
                str[j][17]++;
            if(s[j].charAt(i) == 's')
                str[j][18]++;
            if(s[j].charAt(i) == 't')
                str[j][19]++;
            if(s[j].charAt(i) == 'u')
                str[j][20]++;
            if(s[j].charAt(i) == 'v')
                str[j][21]++;
            if(s[j].charAt(i) == 'w')
                str[j][22]++;
            if(s[j].charAt(i) == 'x')
                str[j][23]++;
            if(s[j].charAt(i) == 'y')
                str[j][24]++;
            if(s[j].charAt(i) == 'z')
                str[j][25]++; 
            }
        }
        for(int i = 0; i < N-1; i++){
           loop: for(int j = i+1; j < N; j++) {
                for(int k = 0; k < 26; k++){
                    if (str[i][k] != str[j][k])
                        continue loop;
                    if (k == 25)
                        count++;
                }
           }
        }
        System.out.println(count);
        sc.close();
    }
}
