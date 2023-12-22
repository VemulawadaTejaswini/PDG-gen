import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();

        String[] s = new String[N];
        for(int i = 0; i < N; i++)
            s[i] = sc.next();       
        
        int count = 0;
        
        for(int i = 0; i < N-1; i++){
            for(int j = i+1; j < N; j++)
                if(anagram(s[i], s[j]))
                    count++;
        }
        System.out.println(count);
        sc.close();
    }

    static boolean anagram(String s1, String s2) {
        int[] str1 = new int[26];
        int[] str2 = new int[26];
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) == 'a')
                str1[0]++;
            if(s1.charAt(i) == 'b')
                str1[1]++;
            if(s1.charAt(i) == 'c')
                str1[2]++;
            if(s1.charAt(i) == 'd')
                str1[3]++;
            if(s1.charAt(i) == 'e')
                str1[4]++;
            if(s1.charAt(i) == 'f')
                str1[5]++;
            if(s1.charAt(i) == 'g')
                str1[6]++;
            if(s1.charAt(i) == 'h')
                str1[7]++;
            if(s1.charAt(i) == 'i')
                str1[8]++;
            if(s1.charAt(i) == 'j')
                str1[9]++;
            if(s1.charAt(i) == 'k')
                str1[10]++;
            if(s1.charAt(i) == 'l')
                str1[11]++;
            if(s1.charAt(i) == 'm')
                str1[12]++;
            if(s1.charAt(i) == 'n')
                str1[13]++;
            if(s1.charAt(i) == 'o')
                str1[14]++;
            if(s1.charAt(i) == 'p')
                str1[15]++;
            if(s1.charAt(i) == 'q')
                str1[16]++;
            if(s1.charAt(i) == 'r')
                str1[17]++;
            if(s1.charAt(i) == 's')
                str1[18]++;
            if(s1.charAt(i) == 't')
                str1[19]++;
            if(s1.charAt(i) == 'u')
                str1[20]++;
            if(s1.charAt(i) == 'v')
                str1[21]++;
            if(s1.charAt(i) == 'w')
                str1[22]++;
            if(s1.charAt(i) == 'x')
                str1[23]++;
            if(s1.charAt(i) == 'y')
                str1[24]++;
            if(s1.charAt(i) == 'z')
                str1[25]++; 
            
             if(s2.charAt(i) == 'a')
                str2[0]++;
            if(s2.charAt(i) == 'b')
                str2[1]++;
            if(s2.charAt(i) == 'c')
                str2[2]++;
            if(s2.charAt(i) == 'd')
                str2[3]++;
            if(s2.charAt(i) == 'e')
                str2[4]++;
            if(s2.charAt(i) == 'f')
                str2[5]++;
            if(s2.charAt(i) == 'g')
                str2[6]++;
            if(s2.charAt(i) == 'h')
                str2[7]++;
            if(s2.charAt(i) == 'i')
                str2[8]++;
            if(s2.charAt(i) == 'j')
                str2[9]++;
            if(s2.charAt(i) == 'k')
                str2[10]++;
            if(s2.charAt(i) == 'l')
                str2[11]++;
            if(s2.charAt(i) == 'm')
                str2[12]++;
            if(s2.charAt(i) == 'n')
                str2[13]++;
            if(s2.charAt(i) == 'o')
                str2[14]++;
            if(s2.charAt(i) == 'p')
                str2[15]++;
            if(s2.charAt(i) == 'q')
                str2[16]++;
            if(s2.charAt(i) == 'r')
                str2[17]++;
            if(s2.charAt(i) == 's')
                str2[18]++;
            if(s2.charAt(i) == 't')
                str2[19]++;
            if(s2.charAt(i) == 'u')
                str2[20]++;
            if(s2.charAt(i) == 'v')
                str2[21]++;
            if(s2.charAt(i) == 'w')
                str2[22]++;
            if(s2.charAt(i) == 'x')
                str2[23]++;
            if(s2.charAt(i) == 'y')
                str2[24]++;
            if(s2.charAt(i) == 'z')
                str2[25]++; 
        }
        if (Arrays.equals(str1, str2))
            return true;
        else
            return false;
    }
}