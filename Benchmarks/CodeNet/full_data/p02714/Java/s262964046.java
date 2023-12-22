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

        Integer sum = 0;
        sum += counter(r, g, b);
        sum += counter(r, b, g);
        sum += counter(g, r, b);
        sum += counter(g, b, r);
        sum += counter(b, g, r);
        sum += counter(b, r, g);
        System.out.println(sum);
    }

    private static Integer counter(Integer[] a, Integer[] b, Integer[] c) {
        Integer sum = 0;
        int n = a.length;
        for(int i=0;i<n-2;i++){
            if(a[i]==0)continue;
            for(int j=i+1;j<n-1;j++){
                if(b[j]==0)continue;
                if(a[i]==b[i])continue;
                for(int k=j+1;k<n;k++){
                    if(c[k]==0)continue;
                    if((k-j)==(j-i))continue;
                    if(a[i]==c[k])continue;
                    if(c[k]==b[j])continue;
                    sum++;
                }
            }
        }
        return sum;
    }
}