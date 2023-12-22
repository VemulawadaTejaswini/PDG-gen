import java.util.*;
import java.util.stream.Stream;

public class Main {

    List<Integer> kouyaku = new ArrayList<Integer>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str  = sc.nextLine();
        String[] astr = str.split(" "); //状況に合わせて
        int[] in_data = Stream.of(astr).mapToInt(x->{
            try{
                return Integer.parseInt(x);
            }
            catch(Exception e){
                e.printStackTrace();
            }
            return 0;
        }).toArray();
        sc.close();
        int a = in_data[0];
        int b = in_data[1];
        if(a == 1 | b==1){
            System.out.println("1");
            System.exit(0);
        }

        List<Integer> kouyaku = new ArrayList<Integer>();
        List<Integer> ans = new ArrayList<Integer>();
        for(int i=1;i<a;i++){
            if(a%i == 0 && b%i== 0){
                kouyaku.add(i);
            }
        }
        for(int j=0;j<kouyaku.size();j++){
            for(int m=j+1;m<kouyaku.size();m++){
                if(check(kouyaku.get(j),kouyaku.get(m)) == true ){
                    if(ans.indexOf(kouyaku.get(j)) == -1){
                        ans.add(kouyaku.get(j));
                    }
                    if(ans.indexOf(kouyaku.get(m)) == -1){
                        ans.add(kouyaku.get(m));
                    }
                }
                else if(check(kouyaku.get(j),kouyaku.get(m)) == false){
                    int index = ans.indexOf(kouyaku.get(j));
                    if(index != -1){
                        ans.remove(index);
                    }
                    int index2 = ans.indexOf(kouyaku.get(m));
                    if(index2 != -1){
                        ans.remove(index2);
                    }
                }
                }
            }
        System.out.println(ans.size());
        }


    public static Boolean check(Integer a, Integer b){
        for(int l = 2;l<a;l++){
            if(a%l == 0 && b%l ==0){
                return false;
            }
        }
        return true;
    }
}