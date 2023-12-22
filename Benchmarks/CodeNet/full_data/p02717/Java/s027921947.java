import java.util.stream.Stream;

public class Main {
    public static void main(String args[]){
      	if(args.length < 3 ){
         	System.out.println("引数の長さが規定値未満です。");
          return ;
        }
        String[] result = swap(args , 1 , 2);
        String[] result2 =  swap(result , 1, 3);
        StringBuilder sb = new StringBuilder();

        Stream.of(result2).forEach(r ->
        {
           sb.append(r + " "); 
        });
        
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb.toString());
    }

    public static String[] swap (String[] target, int i , int j) {
        boolean isInclude = target.length >= i && target.length >= j;
        if(!isInclude){
            System.out.println("配列の長さが異なります。");
            return target;
        }

        String[] result = new String[target.length];

        for(int k = 0; k < target.length; k++){
            if(k == i - 1){
                result[k] = target[j - 1];
            }else if(k == j - 1){
                result[k] = target[i - 1];
            }else{
                result[k] = target[k];
            }
        }

        return result;
    }
}