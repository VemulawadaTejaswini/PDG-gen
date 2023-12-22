import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    static void answer(long a){
        System.out.println(a);
        System.exit(0);
    }
    static void impossible(){
        answer(-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        SortedSet<Integer>[] sChars = new SortedSet[26];
        for(int x=0; x<26; x++) sChars[x] = new TreeSet<Integer>();
        for(int i=0; i<s.length(); i++){
            sChars[s.charAt(i)-'a'].add(i);
        }
        long word = 0;
        int current=0;
        for(int j=0; j<t.length(); j++){
            if(sChars[t.charAt(j)-'a'].tailSet(current).isEmpty()){
                word++;
                if(sChars[t.charAt(j)-'a'].isEmpty()) impossible();
                else current = sChars[t.charAt(j)-'a'].first();
            }else{
                current = sChars[t.charAt(j)-'a'].tailSet(current).first() + 1;
            }
        }
        answer(word*s.length()+current);
    }
}
