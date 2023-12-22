import java.util.*;
class Main{
    void main(){
        Scanner in = new Scanner(System.in);
        long n = in.nextLong(), d = in.nextLong();
        int s = 0;
        for(long i = 1 ; i < n ; i++){
            int c=0;String cs = Integer.toString(i);
            for(int j = 0; j < cs.length(); j++)
              if(cs.charAt(j)!='0')
                c++;
            if(c==d)
              s++;
        }
        System.out.println(s);
    }
}