import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] s = new String[n];

        for(int i = 0; i < n; i++){
            s[i] = sc.next();
        }

        int max = 0;
        do{
            StringBuilder sb = new StringBuilder();
            for(String i : s){
                sb.append(i);
            }
            String str = sb.toString();
            int num = 0;
            for(int i = 0; i < str.length(); i++){
                int index = str.indexOf("AB", i);
                if(index != -1){
                    i = index;
                    num++;
                }else{
                    i = str.length();
                }
            }
            max = Math.max(max, num);
        }while(nextPermutation(s));

        System.out.println(max);

    }

    static <T extends Comparable<T>> boolean nextPermutation(T[] array){
        for(int i = array.length - 1; i > 0; i--){
            if(array[i - 1].compareTo(array[i]) < 0){
                int j = find(array, array[i - 1], i, array.length - 1);
                j = j < 0 ? ~j : j;
                T temp = array[j];
                array[j] = array[i - 1];
                array[i - 1] = temp;
                Arrays.sort(array, i, array.length);
                return true;
            }
        }
        return false;
    }

    static <T extends Comparable<T>> int find(T[] array, T key, int f, int l){
        if(f == l){
            return f;
        }
        int m = (f + l + 1) / 2;
        return (array[m].compareTo(key) <= 0) ? find(array, key, f, m - 1) : find(array, key, m, l);
    }

}
