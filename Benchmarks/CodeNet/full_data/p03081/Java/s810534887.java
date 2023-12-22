import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Q = sc.nextInt();
        char[] c = sc.next().toCharArray();

        char[] t = new char[Q];
        char[] d = new char[Q];

        for(int i=0; i<Q; i++){
            t[i] = sc.next().charAt(0);
            d[i] = sc.next().charAt(0);
        }

        sc.close();

        int[] golems = new int[N];
        Arrays.fill(golems, 1);

        List<List<Integer>> mapList = new ArrayList<>();
        for(int i=0; i<26; i++){
            mapList.add(new ArrayList<>());
        }

        for(int j=0; j<N; j++){ //マス
            int n = (int) c[j] -65;
            mapList.get(n).add(j);
        }



        /*
        //debug
        for(int f=0; f<N; f++){
            System.err.print(golems[f]);
        }
        System.err.println();
        */


        for(int i=0; i<Q; i++){ //呪文
            int aboutChar = t[i]; //移動対象文字
            List<Integer> aboutList = mapList.get(aboutChar -65);
            for(int j=0; j<aboutList.size(); j++){

                int about = aboutList.get(j);
                if(golems[about] != 0){
                    int golemCount = golems[about];
                    golems[about] = 0;
                    if(d[i] == 'L' && about != 0){
                        golems[about-1] += golemCount;
                        //System.err.println(about + " " + t[i] + " L"); //##############
                    }else if(d[i] == 'R' && about != N-1){
                        golems[about+1] += golemCount;
                        //System.err.println(about + " " + t[i] + " R"); //##############
                    }

                    /*
                    //debug
                    for(int f=0; f<N; f++){
                        System.err.print(golems[f]);
                    }
                    System.err.println();
                    */
                }
            }

            /*
            //debug
            System.err.println("####");
            */


        }

        int count = 0;

        for(int i=0; i<N; i++){
            count += golems[i];
        }

        System.out.println(count);

    }
}