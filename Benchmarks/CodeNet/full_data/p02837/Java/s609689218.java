import java.util.*;

class Main{
    static List<Map<Integer, Integer>> shougen = new ArrayList<>();
    static int res = 0;
    static int n = 0;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();


        Integer[] a = new Integer[n];
        for(int i=0;i<n;i++){
            a[i] = -1;
            int shougen_num = sc.nextInt();
            Map<Integer, Integer> one_shougen = new HashMap<>();
            for(int j=0;j<shougen_num;j++){
                Integer key = sc.nextInt();
                Integer val = sc.nextInt();
                one_shougen.put(key-1, val);
            }
            shougen.add(one_shougen);
        }

        a[0] = 1;
        saiki(a, 0);
        a[0] = 0;
        saiki(a, 0);

        System.out.println(res);

    }

    static void saiki(Integer[] a, Integer number){
        if(number==a.length){
            int count = 0;
            for(int i=0;i<n;i++){
                if(a[i]==1)count++;
                // System.out.print(a[i] + " ");
            }
            if(res < count){
                res = count;
            }
            // System.out.println(count);
            return;
        }

        Map<Integer, Integer> one_shougen = new HashMap<>();
        one_shougen = shougen.get(number);        
        if(a[number]==1){
            for(Integer key : one_shougen.keySet()){
                Integer val = one_shougen.get(key);
                if(a[key]==-1){
                    a[key] = val;
                }
                else if(a[key]!=val){
                    return;
                }
            }
            saiki(a, number+1);
        }
        else if(a[number]==0){
            for(Integer key : one_shougen.keySet()){
                Integer val = one_shougen.get(key);
                // 証言を反転
                if(val==1){
                    val = 0;
                }
                else{
                    val = 1;
                }
                if(a[key]==-1){
                    a[key] = val;
                }
                else if(a[key]!=val){
                    return;
                }
            }
            saiki(a, number+1);
        }
        else{
            a[number] = 1;
            saiki(a, number);
            a[number] = 0;
            saiki(a, number);
        }
    }
}
