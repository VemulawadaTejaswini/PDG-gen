import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n;
        n = in.nextLine();
        StringBuilder result =new StringBuilder();
//        System.out.println(result.length());
        for(int i = 0 ;i<n.length();i++){
            if(n.charAt(i) == '0'){
                result.append(0);
            } else if(n.charAt(i) == '1'){
                result.append(1);
            }
            else{
                if(result.length() == 0){
                    continue;
                }else{
                    result.deleteCharAt(result.length() - 1);
                }
            }
        }
        System.out.println(result);


    }
}
