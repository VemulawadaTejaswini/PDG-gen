import java.util.*;
class Main{
    public static void main(String[]$){
        Scanner s=new Scanner(System.in);
        int f=s.nextInt(),t=s.nextInt(),k=s.nextInt();
        if(t-f>k*2){
            for(int i=f;i<f+k;++i)
                System.out.println(i);
            for(int i=t-k+1;i<=t;++i)
                System.out.println(i);
        }else{
            for(int i=f;i<=t;++i)
                System.out.println(i);
        }
    }
}
