    import java.util.*;


    public class Main {
        public static void main(String[] args) {
            // 自分の得意な言語で
            // Let's チャレンジ！！

            Scanner sc = new Scanner(System.in);
            int N = Integer.parseInt(sc.nextLine());
            String[] line =  sc.nextLine().split(" ");
            int[] array = new int[line.length];
            
            for(int i = 0; i < line.length;i++){
                array[i] = Integer.parseInt(line[i]);
            }
            
            int index = 0;
            int result = 0;
            while(index < N-1){

                boolean isLargeFlg = false;
                while(index < N-1 && array[index] <= array[index+1]){
                    index++;
                    isLargeFlg = true;

                }
                
                if(isLargeFlg){
                    result++;
                }

                boolean isSmallFlg = false;
                while(index < N-1 && array[index] >= array[index+1]){
                    index++;
                    isSmallFlg = true;
                }
                
                if(isSmallFlg){
                    result++;
                }

                index++;
            }
            
            System.out.println(result);
        }
    }