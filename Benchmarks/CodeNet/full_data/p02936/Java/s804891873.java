import java.util.*;

public class Main {
    public static boolean debug = true;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        int input[][] = new int[n-1][2];
        Set<Integer> set = new TreeSet<>();
        for(int i=0; i<n-1;i++){
            input[i][0] = sc.nextInt();
            input[i][1] = sc.nextInt();
            set.add(input[i][0]);
            set.add(input[i][1]);
        }

        //de(input);

        int result[][] = new int[set.size()][2];
        int _i = 0;
        for(int temp :set){
            result[_i][0] = temp;
            result[_i][1] = 0;
            _i++;
        }


        int counter = 0;
        for(int i=0;i<q;i++){
            int no = sc.nextInt();
            int score = sc.nextInt();

            boolean flg = false;
            for(int j=0;j<set.size();j++){
                if(result[j][0] == no) {
                    result[j][1] += score;
                    counter++;
                    flg = true;
                    break;
                }
            }
            if(!flg){
                result[counter][0] = no;
                result[counter][1] = score;
                counter++;
            }
        }

        Arrays.sort(input,(a,b)-> Integer.compare(a[0],b[0]));
        Arrays.sort(result,(a,b)-> Integer.compare(a[0],b[0]));

        for(Integer no :set){
            int tempScore = 0;
            for(int i=0;i<result.length;i++){
                if(result[i][0] == no){
                    tempScore = result[i][1];
                    break;
                }
            }
            for(int i=0;i<input.length;i++){
                if(input[i][0] == no){
                    int resultno = input[i][1];
                    for(int j=0;j<result.length;j++){
                        if(result[j][0] == resultno){
                            result[j][1] += tempScore;
                            break;
                        }
                    }
                }
            }

        }

        //de(result);
        ans(result);


    }

    public static void de(int[][] input){
        for(int i=0; i<input.length;i++){
            d(input[i][0] + ":" + input[i][1]);
        }
    }
    public static void ans(int[][] input){
        for(int i=0; i<input.length;i++){
            System.out.print(input[i][1] + " ");
        }
    }

    public static void d(String message){
        System.out.println(message);
    }
}