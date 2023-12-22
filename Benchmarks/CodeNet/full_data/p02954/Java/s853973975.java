import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] c = str.toCharArray();
        int[] children = new int[100010];
        for(int i=0; i<str.length(); i++){
            children[i] = i;
        }
        for(int i=0; i<10; i++){
            for(int j=0; j<str.length(); j++){
                if(c[children[j]]=='L'){
                    children[j]--;
                }else{
                    children[j]++;
                }
            }
        }
        
        int[] data = new int[100010];
        for(int i=0; i<str.length(); i++){
            data[children[i]]++;
        }

        for(int j=0; j<str.length(); j++){
            System.out.print(data[j]+ " ");
        }
        System.out.println();
    }
}