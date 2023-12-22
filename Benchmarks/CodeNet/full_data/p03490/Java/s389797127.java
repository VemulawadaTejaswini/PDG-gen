import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class Main{

    static boolean canSet(int x,List<Integer> list){
        Set<Integer> set = new HashSet<>();
        set.add(0);
        for(int i : list){
            Set<Integer> newSet = new HashSet<>();
            for(int j : set){
                newSet.add(Math.abs(j+i));
                newSet.add(Math.abs(j-i));
            }
            set = newSet;
        }
        return set.contains(x);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String s = scan.next() + 'T';
        int x = scan.nextInt();
        int y = scan.nextInt();
        
        List<Integer> hol = new ArrayList<>();
        List<Integer> ver = new ArrayList<>();
        int cnt=0;
        int vec=0;
        for(int i=0;i<s.length();++i){
            if(s.charAt(i)=='F')++cnt;
            else{
                ++vec;
                if(cnt>0){
                    if(vec%2==1)hol.add(cnt);
                    else ver.add(cnt);
                    cnt=0;
                }
            }
        }


        if(hol.size() > 0){
            x -= hol.get(0);
            hol.remove(0);
        }else{
            hol.add(0);
        }

        if(canSet(Math.abs(x), hol)&&canSet(Math.abs(y), ver)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}