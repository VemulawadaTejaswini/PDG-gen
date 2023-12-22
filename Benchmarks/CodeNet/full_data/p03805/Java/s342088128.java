import java.util.*;
public class Main {
    static List<String> list;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int sum = 0;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i = 0; i < M; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            list1.add(a);
            list2.add(b);
        }
        list = new ArrayList<>();
        //ここで全列挙を行う
        f(N, "1");
        int count = 0;
        for(int i = 0; i < list.size(); i++){
            for(int m = 0; m < N-1; m++){
                int cur = list.get(i).charAt(m) - '0';
                int next = list.get(i).charAt(m+1) - '0';
                if(list1.contains(cur)){
                    if(list2.get(list1.indexOf(cur)) == next){
                        count++;
                    }
                }
                if(list2.contains(cur)){
                    if(list1.get(list2.indexOf(cur)) == next){
                        count++;
                    }
                }
            }
            if(count == N-1){sum++;}
        }
        System.out.println(sum);
    }
    
    public static void f(int N, String str){
        if(str.length() == N){
            list.add(str);
        }
        for(int i = 2; i <= N; i++){
            if(!str.contains(Integer.toString(i))){
                f(N, str+Integer.toString(i));
            }
        }
    }
}