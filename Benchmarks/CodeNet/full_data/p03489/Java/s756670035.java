import java.util.*;

public class Main{

    private static void Sequence(int[] a){
        Map<Integer, Integer> sequence = new HashMap<Integer, Integer>();
        for(int i = 0; i < a.length; i++){
            if(!sequence.containsKey(a[i])){
                sequence.put(a[i], 1);
            }
            else{
                sequence.put(a[i], sequence.get(a[i]) + 1);
            }
        }
        int remove = 0;
        for(Integer key : sequence.keySet()){
            if(key > sequence.get(key)) remove += sequence.get(key);
            else if(sequence.get(key) > key) remove += sequence.get(key) - key;
        }
        System.out.println(remove);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] a = new int[N];
        for(int i = 0; i < N; i ++){
            a[i] = input.nextInt();
        }
        input.close();
        Sequence(a);
    }
}