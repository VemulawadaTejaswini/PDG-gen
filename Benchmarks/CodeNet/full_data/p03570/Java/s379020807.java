import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println(Partitioning((new Scanner(System.in)).nextLine() ));    
    }
    private static int Partitioning(String palindrome){
        int[] count = new int[26];
        for(int i = 0; i < palindrome.length(); i++){
            for(char j = 'a'; j <= 'z'; j++){
                if(palindrome.charAt(i) == j) count[(int)j - 97] ++;
            }   
        }
        int countOdd = 0;
        for(int i = 0; i < 26; i++){
            if(count[i] % 2 != 0) countOdd ++;
        }
        if(countOdd == 0) countOdd = 1;
        return countOdd;
    }
}