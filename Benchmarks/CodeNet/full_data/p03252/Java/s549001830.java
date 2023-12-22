import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();
        char[] sArray= s.toCharArray();
        char[] tArray = t.toCharArray();
        List<Character> sHash = new ArrayList<>();
        List<Character> tHash = new ArrayList<>();
        for(char c : sArray) if (!sHash.contains(c)) sHash.add(c);
        for(char c : tArray) if (!tHash.contains(c)) tHash.add(c);
        if(sHash.size() == tHash.size()){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}