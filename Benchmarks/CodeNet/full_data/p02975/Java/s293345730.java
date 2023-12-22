import java.util.*;
class Main{
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Set<Integer> a = new HashSet<>();
        for(int i=0;i<N;i++){
            a.add(sc.nextInt());
        }
        Set<Integer> tmp = new HashSet<>(a);
        String result = "No";
        Integer left = a.iterator().next();
        Integer mid = 0;
        Integer right = 0;
        a.remove(left);
        for(Integer e :a){
            Set<Integer> b = new HashSet<>(tmp);
            if(a.contains(left^e)){
                mid = left^e;
                right = e;
                b.remove(mid);
                b.remove(right);
                while(!b.isEmpty()){
                    int presize = b.size();
                    for(Integer e2 : b){
                        if(right == (e2^mid)){
                            b.remove(e2);
                            mid = right;
                            right = e2;
                            break;
                        }
                    }
                    if(presize == b.size()){
                        break;
                    }
                }
                if(b.isEmpty()){
                    result="Yes";
                    break;
                }
            }
        }
        System.out.println(result);
    }
}