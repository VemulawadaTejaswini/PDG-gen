import java.util.HashMap;
import java.util.Scanner;

public class Main {

    private static HashMap<String,Boolean> resultMap;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        resultMap = new HashMap<>();

	    Result result = execute(sc.nextLine());
        System.out.println(result);
    }

    public static Result execute(String str){
        if(!isPalindrone(str)){
            return Result.No;
        }
        int length = str.length();
        String firstHalf = str.substring(0,(length - 1)/2);
        if(!isPalindrone(firstHalf)){
            return Result.No;
        }
        String lastHalf = str.substring((length + 1)/2);
        if(!isPalindrone(lastHalf)){
            return Result.No;
        }
        return Result.Yes;
    }

    public static boolean isPalindrone(String str){
        if(resultMap.containsKey(str)){
            return resultMap.get(str);
        }
        boolean result = palidroneCheck(str);
        resultMap.put(str,result);
        return result;

    }

    private static boolean palidroneCheck(String str) {
        int length = str.length();
        if(length == 1){
            return true;
        }
        if(str.charAt(0) != str.charAt(length - 1)){
            return false;
        }
        return isPalindrone(str.substring(1,length - 1));
    }

    public static enum Result{
        Yes,
        No;
    }
}
