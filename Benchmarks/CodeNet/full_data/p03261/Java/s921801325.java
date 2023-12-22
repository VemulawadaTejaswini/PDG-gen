import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<String> w = new ArrayList<String>();
        boolean jud = false;
        for(int i = 0; i < n;i++){
            String word = sc.next();
            if(w.contains(word)){
                jud = false;
                break;
            }
            w.add(word);
            jud = true;            
        }

        if(jud == true){
            for(int i = 0;i < w.size();i++){
                String w1 = w.get(i);
                String w2 = w.get(i+1);
                char a = w1.charAt(w1.length()-1);
                char b = w2.charAt(0);
                if(a != b){
                    jud = false;
                    break;
                }
            }
        }

        if(jud == true){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}