import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<>();
        Map<Integer,Integer> Hindo = new HashMap<>();
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            int num = sc.nextInt();
            int b_num = num - (i+1);
            List.add(b_num);
            if(Hindo.get(b_num)==null) Hindo.put(b_num,1);
            else Hindo.replace(b_num,Hindo.get(b_num)+1);
        }
        int sum = 0,key =0;
        for(int i :Hindo.keySet()){
            if(sum<Hindo.get(i)) {
                key=i;
                sum = i;
            }
        }
        int opt=0;
        if(sum==1){
            for(int i=0;i<List.size();i++){
                opt+=Math.abs(List.get(i));
            }
        }
        else {
            for(int i=0;i<List.size();i++){
                opt+= Math.abs(List.get(i)-key);
            }
        }
        System.out.println(opt);
    }
}
