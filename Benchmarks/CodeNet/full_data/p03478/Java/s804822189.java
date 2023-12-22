import java.util.*;
 
public class Main {
    static int[] bits;
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        bits=new int[5];
        int a=sc.nextInt();
        int b=sc.nextInt();
        int tmp;
        int ans=0;
        for(int i=0;i<n;i++){
            update(0);
            tmp=0;
            for(int j=0;j<5;j++){
                tmp+=bits[j];
            }
            if(a<=tmp&&b>=tmp){
                ans+=i+1;
            }
        }
        System.out.println(ans);
 
    }
    static void update(int pointer){
        
        if(bits[pointer]==9){
            bits[pointer]=0;
            update(pointer+1);
            
        }else{
            bits[pointer]++;
        }
    }
}