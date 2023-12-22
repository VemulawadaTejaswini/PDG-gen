import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] chars={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        int n=sc.nextInt();
        String[] input=new String[n];
        for(int i=0;i<n;i++){
            input[i]=sc.next();
        }
        int[] output=new int[26];
        int tmp;
        for(int i=0;i<26;i++){
            tmp=Integer.MAX_VALUE;
            for(int j=0;j<n;j++){
                tmp=Math.min(tmp,input[j].length()-input[j].replaceAll(chars[i],"").length());
            }
            output[i]=tmp;
        }
        for(int i=0;i<26;i++){
            for(int j=0;j<output[i];j++){
                System.out.print(chars[i]);
            }
        }
        System.out.println();
    }
}