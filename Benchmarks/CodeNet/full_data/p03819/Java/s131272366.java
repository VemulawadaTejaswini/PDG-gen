import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main{
        public static void main(String[] args) {
                int bentoType = 0;
                int stationCnt = 0;
                Scanner scanner = new Scanner(System.in);
                System.out.print("弁当の種類を指定してください：");
                bentoType = scanner.nextInt();
                System.out.print("駅の合計数を指定してください：");
                stationCnt = scanner.nextInt();

                Map<Integer, Integer> bentoMap = null;
                ArrayList<Map<Integer, Integer>> array = new
ArrayList<Map<Integer, Integer>>();
                int startSta = 0;
                int endSta = 0;
                System.out.println("AAA:"+bentoType);
                for(int i = 1; i <= bentoType; i++){
                        bentoMap = new HashMap<Integer, Integer>();
                        System.out.print("弁当"+i+"の開始駅を指定してくださ
い：");
                        startSta = scanner.nextInt();
                        System.out.print("弁当"+i+"の終了駅を指定してくださ
い：");
                        endSta = scanner.nextInt();
                        for(int start = startSta; start <= endSta; start++){
                                bentoMap.put(start, 1);
                        }
                        array.add(bentoMap);
                }
                int bentoCnt = 0;
                // 飛ばす駅数のループ
                for(int n = 1; n <= stationCnt; n++){
                        bentoCnt = 0;
                        // 種類のループ
                        for(Map<Integer, Integer> outMap : array){
//                              System.out.print("[");
                                //到着する駅でのループ
                                for(int m = 0; m <= stationCnt; m +=n){
                                        if(outMap.containsKey(m)){
                                                bentoCnt++;
//                                              System.out.print(m);
                                                break;
                                        }
                                }
//                              System.out.print("],");
                        }
//                      System.out.print(" = ");
                        System.out.println(bentoCnt);
                }
                scanner.close();
        }
}