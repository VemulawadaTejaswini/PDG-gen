import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] a =s.split("");
        String ans = "WA";
        if(a[0].equals("A")){
            if(a[2].equals("C")){
                if(a[1].equals(a[1].toLowerCase())){
                    for(int i = 3; i < a.length; i++){
                        if(a[i].equals(a[i].toUpperCase())){
                            break;
                        }
                        ans = "AC";
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
