import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int K=sc.nextInt();
        int count=0;
        int index=0;
        int coeff=1;
        
        while(count<K){
            System.out.print(coeff);
            for(int i=0;i<index;i++){
                System.out.print("9");
            }
            System.out.println();
            if(coeff==9){
                coeff=1;
                index++;
            }else{
                coeff++;
            }
            count++;
        }
    } 
}