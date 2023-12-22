import java.util.Scanner;
import java.util.stream.Stream;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String[] b = a.split(" ");
        int[] c = Stream.of(b).mapToInt(Integer::parseInt).toArray();
        String d;
        if(c[0]<=c[1]){
            if(c[0]<=c[2]){
                if(c[1]>=c[2]){
                    d="Yes";
                }
                else{
                    d="No";
                }
            }
            else{
                d="No";
            }
        }
        else if(c[0]>=c[1]){
            if(c[1]<=c[2]){
                if(c[0]<=c[2]){
                    d="Yes";
                }
                else{
                    d="No";
                }
            }
            else{
                d="No";
            }
        }else{
            d="No";
        }
        System.out.println(d);
    }
}
