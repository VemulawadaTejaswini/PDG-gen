/*
文字列の配列の初期化、整数の型がlongになっているか
関数（splitとかcontainsとか）内では"+"とかは正規表現となされるので"\\+"とする
配列のコピーはarr1=arr.clone()
HashSet<>[]はおのおの初期化した？？？？？
 */
import java.util.*;
import java.awt.*;
import java.awt.geom.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] $) {
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] a=new int[m];
        int[] cnt={0,2,5,5,4,5,6,3,7,6};
        HashSet<Integer> set=new HashSet<>();
        TreeSet<Integer> ts=new TreeSet<>();
        for (int i = 0; i < m; i++) {
            a[i]=sc.nextInt();
            set.add(a[i]);
            ts.add(cnt[a[i]]);
        }
        int[] arr=new int[ts.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=ts.pollLast();
        }
        int d=2;
        if(set.contains(3))d=3;
        if(set.contains(5))d=5;
        if(set.contains(1)&&set.contains(7))d=71;
        int e=6;
        if(set.contains(9))e=9;
        if(set.contains(7))e=77;
        if(set.contains(1))e=111;
        String[] b={"","","1","7","4",String.valueOf(d),String.valueOf(e),"8"};
        HashMap<String,Integer> map=new HashMap<>();
        ArrayDeque<String> str=new ArrayDeque<>();
        ArrayDeque<Integer> c=new ArrayDeque<>();
        str.addFirst("");
        c.addFirst(n);
        //String temp="";
        TreeSet<Double> trst=new TreeSet<>();
        while (str.size()>0){
            String s=str.pollFirst();
            int count=c.pollFirst();
            if(count==0){
              //  temp=s;
                trst.add(Double.valueOf(s));
//                out.println(s);
            }
            for (int i = 0; i < arr.length; i++) {
                if(count-arr[i]>=0){
                    str.addFirst(b[arr[i]]+s);
                    c.addFirst(count-arr[i]);
                }
            }
        }/*
        char[] answer=temp.toCharArray();
        Arrays.sort(answer);
        for (int i = answer.length-1; i >= 0; i--) {
            out.print(answer[i]);
        }
        out.println();
        */
        String sss=trst.pollLast().toString().replaceAll("\\.","");
        sss=sss.replaceAll("0","");
        out.println(sss);
    }
}