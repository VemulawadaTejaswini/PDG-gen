import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String[] ns1 = n.split("");
        List<String> s = Arrays.asList(ns1);
        List<String> kotae = new ArrayList<>();
        int x = 0;
        int y = 0;
        int z = 0;
        for(int i = 0; i < s.size(); i++){
            if (s.get(i).equals("1")){
                kotae.add("9");
            }
            else if(s.get(i).equals("9")){
                kotae.add("1");
            }
        }
        if(kotae.size() == 1){
            z = Integer.parseInt(kotae.get(0)) * 1;
        }
        else if(kotae.size() == 2){
            y = Integer.parseInt(kotae.get(0)) * 10;
            z = Integer.parseInt(kotae.get(1)) * 1;
        }
        else if(kotae.size() == 3){
            x = Integer.parseInt(kotae.get(0)) * 100;
            y = Integer.parseInt(kotae.get(1)) * 10;
            z = Integer.parseInt(kotae.get(2)) * 1;
        }

        System.out.println(x + y + z);
    }
}
