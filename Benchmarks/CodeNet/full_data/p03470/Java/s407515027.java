import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       ArrayList<Integer> arraylist = new ArrayList<Integer>();
       int N = sc.nextInt();
       int []array = new int[N];
       for(int i = 0; i < array.length; i++){
           array[i] = sc.nextInt();
       }
       Arrays.sort(array);
       for(int i = 0; i < array.length; i++){
           if(i != 0){
               if(array[i] != array[i-1]){
                   arraylist.add(array[i]);
               }else{
                   continue;
               }
           }else{
               arraylist.add(array[i]);
           }
       }
       System.out.println(arraylist.size());

    }
}
