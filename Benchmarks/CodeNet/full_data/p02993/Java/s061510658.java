import java.util.Scanner; 
import java.util.stream.Stream;

public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str  = sc.nextLine();
        String[] astr = str.split("");
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

        for(int i=1;i<in_data.length;i++){
            flag = check(in_data[i-1], in_data[i]);
            if(flag == false){
                System.out.println("Bad");
                System.exit(0);
            }
        }
        if(flag == true){
            System.out.println("Good");
        }
    }

    public static Boolean check(Integer a, Integer b){
        if(a == b){
            return false;
        }
        else{
            return true;
        }
    }
}
