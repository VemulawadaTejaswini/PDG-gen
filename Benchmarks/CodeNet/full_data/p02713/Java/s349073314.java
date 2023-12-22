import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

class Main {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        scanner.close();
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=k; i++){
            for(int j=1; j<=k; j++){
                list.add(gcd(i,j));
                // for(int l=1; l<=k; l++){
                //     List<Integer> inputList = new ArrayList<>();
                //     inputList.add(i);
                //     inputList.add(j);
                //     inputList.add(l);
                //     list.add(inputList);
                // }
            }
        }
        int sum = 0;
        for (Integer val : list) {
            for(int i=1; i<=k; i++){
                sum += gcd(val, i);
            }
        }
        
        // int sum = 0;
        // for(int i=0; i<Math.pow(k, 3); i++){
        //     List<Integer> input = list.get(i);
        //     sum += gcd(input.get(0),input.get(1),input.get(2));
        // }
        System.out.print(sum);

    }    

    public static int gcd(int val1, int val2){
        if(val2==0){
            return val1;
        }else{
            return gcd(val2, val1%val2);
        }
    }

    public static int gcd(int... val){
        int len = val.length;
        int g = gcd(val[0], val[1]);
        for(int i=1; i<len-1; i++){
            g = gcd(g, val[i+1]);
        }
        return g;
    }
}