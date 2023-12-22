import java.util.*;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        String[] s = sc.next().split("");
        Integer[] r = new Integer[n];
        Integer[] g = new Integer[n];
        Integer[] b = new Integer[n];
    
        for(int i=0;i<n;i++){
            r[i]=0;
            g[i]=0;
            b[i]=0;
            if(s[i].equals("R"))r[i]=1;
            if(s[i].equals("G"))g[i]=1;
            if(s[i].equals("B"))b[i]=1;
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

    private static Long counter(Integer[] a, Integer[] b, Integer[] c) {
        Long sum = 0L;
        int n = a.length;
        for(int i=0;i<n-2;i++){
            if(a[i]==0)continue;
            for(int j=i+1;j<n-1;j++){
                if(b[j]==0)continue;
                List<Integer> cc = Arrays.asList(Arrays.copyOfRange(c, j+1, n));
                sum += cc.stream().filter(x -> x==1).count();
                if(j+(j-i)<n && c[j+(j-i)]==1) sum--;
            }
        }
        return sum;
    }
}