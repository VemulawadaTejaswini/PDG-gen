import java.util.*;

public class Main{
    static ArrayList<ArrayList<Integer>> abc;
    static int n, ma, mb;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        n=Integer.parseInt(sc.next());
        ma=Integer.parseInt(sc.next());
        mb=Integer.parseInt(sc.next());
        abc=new ArrayList<ArrayList<Integer>>();
        int a,b,c;
        for(int i=0;i<n;i++){
            a=Integer.parseInt(sc.next());
            b=Integer.parseInt(sc.next());
            c=Integer.parseInt(sc.next());
            abc.add(new ArrayList<Integer>(Arrays.asList(a,b,c)));
        }
        sc.close();
        Collections.sort(abc,(list1,list2)->{
            if(list1.get(2)>list2.get(2)) return 1;
            else if(list1.get(2)<list2.get(2)) return -1;
            else return 0;
        });
        int ans=search(0, 0, 0, 0);
        if(ans==Integer.MAX_VALUE) ans=-1;
        System.out.println(ans);

    }

    public static int search(int sumA, int sumB, int sumC, int st){
        int a=abc.get(st).get(0);
        int b=abc.get(st).get(1);
        int c=abc.get(st).get(2);
        if(sumA*mb==sumB*ma && sumA!=0) return sumC;
        else if((sumA+a)*mb==(sumB+b)*ma) return sumC+c;
        else{
            if(st==n-1) return Integer.MAX_VALUE;
            else return Math.min(search(sumA+a, sumB+b, sumC+c, st+1), search(sumA, sumB, sumC, st+1));
        }   
    }

}