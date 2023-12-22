import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        for(int h=(int)N/4; h<=3500; h++){
            if(4*h<=N) continue;
            for(int w=(int)Math.max(h,N*h/(4*h-N));w<=3500;w++){
                if(4*h*w-N*w-N*h<=0) continue;
                long low = N*h*w/(4*h*w-N*w-N*h);
                if(low>3500) continue;
                for(long n= low;n<=low+1;n++){
                    if(n*(4*h*w-N*w-N*h)==N*h*w){
                        String ans = Integer.toString(h)+" "+Long.toString(n)+" "+Integer.toString(w);
                        System.out.println(ans);
                        System.exit(0);
                    }
                }
            }
        }
        //System.out.println(ans);
    }
}