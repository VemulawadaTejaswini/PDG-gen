import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
        for(int i = 0; i < k; i++){
           if(i%2 == 0){
               if(a%2 == 1){
                    a = a - 1;
                    int[] array = change(a,b,i);
                    a = array[0];
                    b = array[1];
               }else{
                   int[] array = change(a,b,i);
                   a = array[0];
                   b = array[1];
               }
           }else{
               if(b%2 == 1){
                   b = b - 1;
                   int[] array = change(a,b,i);
                   a = array[0];
                   b = array[1];
               }else{
                   int[] array = change(a,b,i);
                   a = array[0];
                   b = array[1];
               }
           }
        }
        System.out.print(a);
        System.out.print(b);
    }
    public static int[] change(int ac,int bc,int i){
        if(i%2 == 0){
            int aa = ac/2;
            ac = aa;
            bc = bc + aa;
            int[] array = {ac,bc};
            return array;
            
        }else{
            int bb = bc/2;
            ac = ac + bb;
            bc = bb;
            int[] array = {ac,bc};
            return array;
        }
    }
}