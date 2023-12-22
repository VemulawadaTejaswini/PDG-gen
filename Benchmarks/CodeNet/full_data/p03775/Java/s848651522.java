import java.util.*;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        long N=s.nextLong();
        int F=0;
        String a,b;
        int i=0;
    int t=0;
    String len=String.valueOf(N);
    long k=1;

    int y=0;
    if(((len.length()/2)-1)<0){
        y=0;
    }else{
        y=(len.length()/2)-1;
    }

    for(int p=0;p<y;p++){
        k*=10;
    }

        for(i=(int)k;i<=N;i++){
            if(N%i!=0)continue;
            else{
            a=String.valueOf(i);
            b=String.valueOf(N/i);
            if(a.length()<=b.length()){
        t=b.length();    
        }
       if(a.length()>b.length()){
        t=a.length();
        break;

        }
            }
        }

        System.out.print(t);

    }

}