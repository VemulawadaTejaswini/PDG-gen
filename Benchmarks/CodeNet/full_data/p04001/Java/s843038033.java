
import java.util.*;
import java.util.stream.Collectors;



public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] strings=scanner.next().split("");
        int[] ints=new int[strings.length];
        for(int i=0;i<ints.length;i++){
            ints[i]=Integer.parseInt(strings[i]);
        }
        System.out.println(func(0,ints,new long[]{ints[0]}));
    }
    public static long func(int index, int[] ints,long[] vals){
        if(index==ints.length-1){
            long result=0;
            for(int i=0;i<vals.length;i++){
                result+=vals[i];
            }
            return result;
        }
        long[] vals1=new long[vals.length];
        for(int i=0;i<vals1.length;i++){
            if(i==vals1.length-1){
                vals1[i]=vals[i]*10+ints[index+1];
                continue;
            }
            vals1[i]=vals[i];
        }
        long[] vals2=new long[vals.length+1];
        for(int i=0;i<vals2.length;i++){
            if(i==vals2.length-1){
                vals2[i]=ints[index+1];
                continue;
            }
            vals2[i]=vals[i];
        }
        return func(index+1,ints,vals1)+func(index+1,ints,vals2);
    }
}