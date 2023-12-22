import java.util.*;

public class Main {

    private static int distance(int a){
        return 26-a;
    }        
        
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String input = scanner.nextLine();
       int k = scanner.nextInt();
       
       input = input.toLowerCase();
       int length = input.length();
       
       char[] ar = input.toCharArray();       
       int[] arD = new int[length];
       for (int i=0;i<length;i++){
           arD[i] = (ar[i]-97);
       }       
       
       int pos=0;
       while (k>0){
           if (pos==length-1){
               arD[pos]+=k;
               k=0;
           }
           else{
               int d = distance(arD[pos]);
               if (d<k){
                 k-=d;
                arD[pos] += d;
                pos++;
               }
               else{
                pos++;
               }
           }
       }       
       //transform
       for (int i=0;i<length;i++){
           ar[i] = (char) ((arD[i]%26) + 97);
       }
       
       String output = new String(ar);
       System.out.println(output);
    }
        
}
