import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String a, b , c;
        a=sc.next();
        b=sc.next();
        c=sc.next();
        Integer res = Math.min(getMin(a,b,c), Math.min(getMin(a,c,b), getMin(b,c,a)));
        System.out.println(res);
    }
    public static Integer getMin(String a, String b, String c){
        return merge(a,b).stream()
                .flatMap(s->merge(s,c).stream())
                .min(Comparator.comparingInt(String::length)).get().length();
    }

    public static List<String> merge(String a, String b){
        return IntStream.rangeClosed(-b.length(), a.length())
                .mapToObj(ofs->merge(a,b,ofs))
                .filter(s->s.length()>0)
                .collect(Collectors.toList());
    }

    public static String merge(String a, String b, int b_offset){
        StringBuilder bld = new StringBuilder();
        char[] ac;
        char[] bc;
        if(b_offset > 0) {
            b_offset = -b_offset;
            ac = b.toCharArray();
            bc = a.toCharArray();
        }else{
            ac = a.toCharArray();
            bc = b.toCharArray();
        }

        for (int b_i = 0; b_i < bc.length; b_i++) {
            int a_i = b_i + b_offset;
            if (a_i >= 0 && a_i < ac.length) {
                if(ac[a_i] == '?'){
                    bld.append(bc[b_i]);
                }else if(bc[b_i] == '?'){
                    bld.append(ac[a_i]);
                }else if(bc[b_i] == ac[a_i]){
                    bld.append(bc[b_i]);
                }else{
                    return "";
                }
            }else{
                bld.append(bc[b_i]);
            }
        }
        for(int a_i=b_offset + bc.length; a_i<ac.length;a_i++){
            bld.append(ac[a_i]);
        }
        return bld.toString();
    }

}
