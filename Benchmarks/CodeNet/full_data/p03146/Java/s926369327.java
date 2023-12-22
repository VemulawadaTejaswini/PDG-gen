import java.util.*;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int S = sc.nextInt();
        int m = 1;
            while(S>1){
                 if(S%2==0){
                     S = S/2;
                     m +=1;
                }else{
                     S = 3*S +1;
                     m +=1;
                }
            }
            System.out.println(m+1);
        

    }

}