import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


class Main{
    public static void main(String[] args){
        int n,h = 0;
        int[] a = null;
        int[] b = null;
        Index index = new Index();
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = reader.readLine();
            String[] temp = s.split(" ");
            n = Integer.parseInt(temp[0]);
            h = Integer.parseInt(temp[1]);
            a = new int[n];
            b = new int[n];
            for(int i=0;i<n;i++){
                s = reader.readLine();
                temp = s.split(" ");
                a[i] = Integer.parseInt(temp[0]);
                b[i] = Integer.parseInt(temp[1]);
            }
        } catch (IOException e){}
        int c = 0;
        Index value = index.calc(a);
        int aIndex = value.first;
        Arrays.sort(b);
        int i = b.length -1;
        while(true){
            if(i < 0){
                if(h % a[aIndex] == 0){
                    c += h / a[aIndex];
                } else{
                    c += h / a[aIndex] + 1;
                }
                break; 
            }
            if(b[i] > a[aIndex]){
                h -= b[i];
                c++;
                i--;
                if(h <= 0){
                    break;
                }
            }else{
                if(h % a[aIndex] == 0){
                    c += h / a[aIndex];
                } else{
                    c += h / a[aIndex] + 1;
                }
                break;
            }
        }
        System.out.println("" + c);
    }
           
    
}
class Index {
    int first;
    int second;

    public Index calc(int[] a){
        Index index = new Index();
        int max = a[0];
        int second = 0;
        int k = 0;
        int j = 0;
        for(int i=1;i<a.length;i++){
            if(a[i] >= max){
                second = max;
                max = a[i];
                j = k;
                k = i;
            }else{
                if(a[i] > second){
                    second = a[i];
                    j = i;
                }
            }
        }
        if(k == j || a[j] == 0){
            index.first = k;
            index.second = -1;
            return index;
        }
        index.first = k;
        index.second = j;
        return index;
    }
}
