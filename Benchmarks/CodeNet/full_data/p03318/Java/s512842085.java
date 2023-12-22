import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int K=sc.nextInt();
        int count=0;
        int index=0;
        int coeff=2;
        
        for(count=0;count<K;count++){
            for(int i=1;i<10;i++){
                System.out.print(i);
                for(int j=0;j<index;j++){
                    System.out.print("9");
                }
                System.out.println();
            }
            index++;
        }
    } 
}