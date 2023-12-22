
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        String S=  sc.next();

        List<Integer> list = new ArrayList<>();
        List<Character> list01 = new ArrayList<>();
        char prev = S.charAt(0);
        int count =1;
        for (int i = 1; i < S.length(); i++) {
            char c = S.charAt(i);
            if(prev==c){
                count++;
            }else{
                list.add(count);
                list01.add(prev);
                count=1;
            }
            prev=c;
        }
        list.add(count);
        list01.add(prev);

        if(list01.get(0)=='0'){
            list.add(0,0);
            list01.add(0,'1');
        }
        if(list01.get(list01.size()-1)=='0'){
            list.add(0);
            list01.add('1');
        }
        int ans=0;
        for (int i = 0; i < K; i++) {
            ans = merge(list,list01);
        }
        System.out.println(ans);

    }

    static private int merge(List<Integer> list,List<Character> list01){
        int max=0;
        int maxIdx =-1;
        for (int i = 0; i < list.size() ; i++) {
            if(list01.get(i)=='0') {
                int potentialSize =  list.get(i) ;
                if(i-1>=0){
                    potentialSize +=list.get(i-1);
                }
                if(i+1<list.size()){
                    potentialSize +=list.get(i+1);
                }

                if(potentialSize>max) {
                    max = potentialSize;
                    maxIdx=i;
                }
            }
        }

        //No zero
        if(maxIdx==-1) return list.get(0) ;

        if(maxIdx-1>=0){
            list.set(maxIdx-1,max);
            list.remove(maxIdx);
            list01.remove(maxIdx);
            if(maxIdx<=list.size()-1){
                list.remove(maxIdx);
                list01.remove(maxIdx);
            }
        }else{
            list.set(maxIdx,max);
            if(maxIdx+1<=list.size()-1){
                list.remove(maxIdx+1);
                list01.remove(maxIdx+1);
            }
        }
        return  max;
    }


}
