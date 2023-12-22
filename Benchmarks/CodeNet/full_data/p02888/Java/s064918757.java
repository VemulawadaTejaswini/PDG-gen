import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String str  = sc.nextLine();
        String[] astr = str.split(" "); //状況に合わせて
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
        int ans =0;
        Boolean flag = false;

        for(int i =0;i< in_data.length ;i++){
            for(int j = i+1;j<in_data.length;j++){
                for(int k =j+1;k<in_data.length;k++){
                    flag = check(in_data[i],in_data[j],in_data[k]);
                    if(flag == true){
                        ans +=1;
                    }
                }
            }
        }
        System.out.println(ans);
    }

    public static Boolean check(Integer a, Integer b, Integer c){
        if(a < b + c && b < a + c &&  c < a + b){
            return  true;
        }
        else{
            return  false;
        }
    }

}