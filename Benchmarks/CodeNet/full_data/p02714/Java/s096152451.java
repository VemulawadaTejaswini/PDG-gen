import java.util.*;
 
class Main{
    static Integer maxC[] = {0,0,0};
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
            if(s[i].equals("R")){
                r[i]=maxC[0]+1;
                maxC[0]++;
            }
            if(s[i].equals("G")){
                g[i]=maxC[1]+1;
                maxC[1]++;
            }
            if(s[i].equals("B")){
                b[i]=maxC[2]+1;
                maxC[2]++;
            }
        }
 
        Long sum = 0L;
        sum += counter(r, g, b, 2);
        sum += counter(r, b, g, 1);
        sum += counter(g, r, b, 2);
        sum += counter(g, b, r, 0);
        sum += counter(b, g, r, 0);
        sum += counter(b, r, g, 1);
        System.out.println(sum);
    }
 
    private static Long counter(Integer[] a, Integer[] b, Integer[] c, Integer color) {
        Long sum = 0L;
        int n = a.length;
        for(int i=0;i<n-2;i++){
            if(a[i]==0)continue;
            for(int j=i+1;j<n-1;j++){
                if(b[j]==0)continue;
                for(int k=j+1;k<n;k++){
                    if(c[k]!=0){
                        sum += maxC[color]-c[k]+1;
                        break;
                    }
                }
                if(j+(j-i)<n && c[j+(j-i)]!=0) sum--;
            }
        }
        return sum;
    }
}