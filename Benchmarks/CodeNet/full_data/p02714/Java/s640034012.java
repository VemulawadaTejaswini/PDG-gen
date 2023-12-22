import java.util.*;
import java.util.stream.Collectors;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        String[] s = sc.next().split("");
        List<Integer> r = new ArrayList<>();
        List<Integer> g = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
 
        for(int i=0;i<n;i++){
            if(s[i].equals("R"))r.add(i);
            if(s[i].equals("G"))g.add(i);
            if(s[i].equals("B"))b.add(i);
        }
 
        Long sum = 0L;
        sum += counter(r, g, b);
        sum += counter(r, b, g);
        sum += counter(g, r, b);
        sum += counter(g, b, r);
        sum += counter(b, g, r);
        sum += counter(b, r, g);
        System.out.println(sum);
    }

    private static Long counter(List<Integer> a, List<Integer> b, List<Integer> c) {
        Long sum = 0L;
        for(Integer at : a){
            for(Integer bt : b.stream().filter(x -> x>at).collect(Collectors.toList())){
                Integer d = bt-at;
                if(d<0)continue;
                for(Integer ct : c.stream().filter(x -> x>bt).collect(Collectors.toList())){
                    if(ct-bt==d)continue;
                    sum++;
                }
            }
        }
        return sum;
    }
}