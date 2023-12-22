import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        int a,b;
        Scanner sc = new Scanner(System.in);
        
        a = sc.nextInt();
        b = sc.nextInt();
        ArrayList<Integer> list_koyaku = new ArrayList<Integer>(a);
        ArrayList<Integer> list_select = new ArrayList<Integer>();
        
        for(int i = 1; i <= a; i++){
            if((a % i == 0) && (b % i == 0)){
                list_koyaku.add(i);
            }
        }
        
        for(int j = 0; j < list_koyaku.size(); j++){
            if(j == 0){
                //最初は1だから入る
                list_select.add(list_koyaku.get(j));
            }else{
                int count = 0;
                for(int k = 0; k < list_select.size(); k++){
                    if((list_koyaku.get(j) % (k + 1) == 0) && (list_select.get(k) % (k + 1) == 0)) count++;
                }
                
                if(count == 1) {
                    list_select.add(list_koyaku.get(j));
                }
            }
        }
        
        System.out.println(list_select.size());
    }
}