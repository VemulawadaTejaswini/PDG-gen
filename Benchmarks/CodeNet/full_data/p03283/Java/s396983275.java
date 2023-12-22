import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int qNum = sc.nextInt();
        
        int l[] = new int[m + 1];
        int r[] = new int[m];
        int p[] = new int[qNum];
        int q[] = new int[qNum];
        int lIndex[] = new int[m];
        int nIndex[] = new int[n + 1];
        int nrIndex[] = new int[n + 2];
        int result[] = new int[qNum];
        
        for(int i = 0; i < n + 1; i++){
            nIndex[i] = 0;
            nrIndex[i] = 0;
        }
        nrIndex[n + 1] = 0;
        
        for(int i = 0; i < m; i++){
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
            nIndex[l[i]]++;
        }
        l[m] = 501;
        
        int sum = 0;
        nrIndex[0] = 0;
        for(int i = 0; i < n + 1; i++){
            sum += nIndex[i];
            nrIndex[i + 1] = sum;
        }
        
        for(int i = 0; i < m; i++){
            for(int j = i + 1; j < m; j++){
                if(l[i] > l[j]){
                    int lTmp = l[i];
                    int rTmp = r[i];
                    l[i] = l[j];
                    l[j] = lTmp;
                    r[i] = r[j];
                    r[j] = rTmp;
                }
            }
        }
        
        for(int i = 1; i < n; i++){
            for(int j = nrIndex[i]; j < nrIndex[i + 1] ; j++){
                for(int k = j + 1; k < nrIndex[i + 1]; k++){
                    if(r[j] > r[k]){
                        int lTmp = l[j];
                        int rTmp = r[j];
                        l[j] = l[k];
                        l[k] = lTmp;
                        r[j] = r[k];
                        r[k] = rTmp;
                    }
                }
            }
        }

        for(int i = 0; i < qNum; i++){
            p[i] = sc.nextInt();
            q[i] = sc.nextInt();
            result[i] = 0;
        }
        
        for(int i = 0; i < qNum; i++){
            int index = p[i];
            for(int j = nrIndex[index]; ; j++){
                if(l[j] > q[i]){
                    break;
                }else{
                    if(r[j] <= q[i]){
                        result[i]++;
                    }else{
                        j = nrIndex[l[j] + 1] - 1;
                    }
                }
            }
        }
        
        for(int i = 0; i < qNum; i++){
            System.out.println(result[i]);
        }
    }
}
