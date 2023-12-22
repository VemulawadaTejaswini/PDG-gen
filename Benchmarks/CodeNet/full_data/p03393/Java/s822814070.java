import java.util.*;
public class Main {
	  public static void main(String[] args){
		    Scanner sc = new Scanner(System.in);
        String abc = "abcdefghijklmnopqrstuvwxyz";
        char[] abcd = abc.toCharArray();
        String cba = "zyxwvutsrqponmlkjihgfedcba";
        char[] dcba = cba.toCharArray();
        String word = sc.nextLine();
        if(word == cba){
            System.out.println(-1);
        }
        else{
            if(word.length() != 26){
                int i;
                for(i=0;word.indexOf(abcd[i]) != -1;i++){
                }
                System.out.println(word + abcd[i]);
            }
            else{
                char[] word2 =word.toArray();
                for(j=25;j != 0;--j){
                    if(word[j] != dcba[j]){
                        char lw = word.charAt(j + 1);
                        int slw = abc.indexOf(lw) - 1;
                        word.substring(0,slw - 1);
                        System.out.println(word + lw);
                        break;
                    }
                }
            }
        }
    }
}
