import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str  = sc.nextLine();
        String[] astr = str.split(" ");
        int n = 0;
        int l = 0;
        Boolean flag  = true;
        int[] in_data = Stream.of(astr).mapToInt(x->{
            try{
                return Integer.parseInt(x);
            }
            catch(Exception e){
                e.printStackTrace();
            }
            return 0;
        }).toArray();
        sc.close();

        n = in_data[0];
        l = in_data[1];
        int[] vaule = new int[n];
        for(int i=0;i<n;i++){
            vaule[i] = l + i;
        }
        int sum = java.util.Arrays.stream(vaule).sum();
        int min_vaule = min(vaule);
        if(sum <= 0){
            System.out.println(sum + min_vaule);
        }
        else{
            System.out.println(sum - min_vaule);
        }

    }

    public static int min(int [] hoge){
        int min = Math.abs(hoge[0]);
        for(int i =0;i< hoge.length;i++){
            if(min > Math.abs(hoge[i])){
                min = Math.abs(hoge[i]);
            }
        }
        return min;
    }
}