import java.util.*;
 
class Main{
    static Integer maxC[] = {0,0,0};
    static Integer minIndex[] = {4000, 4000, 4000};
    static Integer maxIndex[] = {0,0,0};
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
                minIndex[0] = Math.min(minIndex[0], i);
                maxIndex[0] = Math.max(maxIndex[0], i);
            }
            if(s[i].equals("G")){
                g[i]=maxC[1]+1;
                maxC[1]++;
                minIndex[1] = Math.min(minIndex[0], i);
                maxIndex[1] = Math.max(maxIndex[0], i);
            }
            if(s[i].equals("B")){
                b[i]=maxC[2]+1;
                maxC[2]++;
                minIndex[2] = Math.min(minIndex[0], i);
                maxIndex[2] = Math.max(maxIndex[0], i);
            }
        }
 
        Long sum = 0L;
        sum += counter(r, g, b, 0, 1, 2);
        sum += counter(r, b, g, 0, 2, 1);
        sum += counter(g, r, b, 1, 0, 2);
        sum += counter(g, b, r, 1, 2, 0);
        sum += counter(b, g, r, 2, 1, 0);
        sum += counter(b, r, g, 2, 0, 1);
        System.out.println(sum);
    }
 
    private static Long counter(Integer[] a, Integer[] b, Integer[] c, Integer c1, Integer c2, Integer c3) {
        Long sum = 0L;
        int n = a.length;
        for(int i=0;i<n-2;i++){
            if(a[i]==0)continue;
            if(maxIndex[c1]<i)break;
            for(int j=i+1;j<n-1;j++){
                if(b[j]==0)continue;
                if(maxIndex[c2]<j)break;
                for(int k=j+1;k<n;k++){
                    if(maxIndex[c3]<k)break;
                    if(c[k]!=0){
                        sum += maxC[c3]-c[k]+1;
                        break;
                    }
                }
                if(j+(j-i)<n && c[j+(j-i)]!=0) sum--;
            }
        }
        return sum;
    }
}