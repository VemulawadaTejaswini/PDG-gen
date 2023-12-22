import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<String> w = new ArrayList<String>();
        boolean jud = true;
        for(int i = 0; i < n;i++){
            String word = sc.next();
            w.add(word);            
        }

            for(int i = 0;i < w.size()-1;i += 2){
                String w1 = w.get(i);
                String w2 = w.get(i+1);
                char a = w1.charAt(w1.length()-1);
                char b = w2.charAt(0);
                if(a != b){
                    jud = false;
                    break;
                }
            }

            for(int i = 0;i < w.size();i++){
                String w1 = w.get(i);
                for(int j = 0;j < w.size();j++){
                    String w2 = w.get(j);
                    if(w1.equals(w2)){
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