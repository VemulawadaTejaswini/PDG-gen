import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String inp = sc.nextLine();
        int n = inp.length();

        int rleft;
        int lleft;
        int rright;
        int lright;

        String rev = new StringBuilder(inp).reverse().toString();

        int[] fin = new int[n];

        for(int i=0;i<n;i++){

            if(inp.charAt(i)=='R'){
                lright = inp.indexOf("L",i+1);
                if((lright-i)%2==0){
                    fin[lright] += 1;
                }else{
                    fin[lright-1] += 1;
                }
            }else{
                rleft = n-1 - rev.indexOf("R",n-1-i);
                if((i-rleft)%2==0){
                    fin[rleft] += 1;
                }else{
                    fin[rleft+1] += 1;
                }
            }
        }

        for(int i=0;i<n;i++){
            System.out.print(fin[i]+" ");
        }

 
    }
}