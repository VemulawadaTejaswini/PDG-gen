import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();

        // 最終出力する照らせる最大値
        int maxMasu = 0;

        // 縦に繋がっている場合の連鎖マップ
        // 照らせる数が最大の縦と横の繋がりを記録する
        // 例）3: {height:2, width:3}
        // この場合、左から3列目は縦に2つ、横に3つ繋がっていることを示す
        Map<Integer, Map<String, Integer>> chainMappingMasu = new HashMap<>();

        for (int i = 0; i < H; i++) {
            // 横一列読み込み
            String line = sc.next();
            // 前のシャープ位置
            // 初検索時はシャープが存在しないとして初期値を-1とする
            int beforeSharpIndex = -1;
            // 現在のシャープ位置
            int currentSharpIndex = 0;
            // 横列で照らせる最大値
            int maxMasuLine = 0;
            // 横何マス目がOKかつ最大何マス照らせるかを記録するマップ
            Map<Integer, Map<String, Integer>> lineMappingMasu = new HashMap<>();

            // シャープが見つからなくなるまでループ
            while (currentSharpIndex != -1) {
                // ドットの始まりは前回のシャープの右隣
                int dotBeginIndex = beforeSharpIndex + 1;
                // ドットの始まりからシャープを検索
                currentSharpIndex = line.indexOf("#", dotBeginIndex);

                // #が見つからない場合
                if (currentSharpIndex == -1) {
                    // 初検索の場合は全て"."なのでマップに記録
                    if (beforeSharpIndex == -1) {
                        for (int j = 0; j < W; j++) {
                            lineMappingMasu.put(j, new HashMap<String, Integer>() {
                                {
                                    put("height", 1);
                                    put("width", W);
                                }
                            });
                        }
                        maxMasuLine = W;
                    }
                    // そうでない場合は終端なので終端までの"."の数をマップに記録
                    else {
                        for (int j = dotBeginIndex; j < W; j++) {
                            lineMappingMasu.put(j, new HashMap<String, Integer>() {
                                {
                                    put("height", 1);
                                    put("width", W - dotBeginIndex);
                                }
                            });
                        }
                    }
                }

                // それ以外の場合は、"."の位置と数をマップに記録
                else {
                    int dotMasuCount = currentSharpIndex - dotBeginIndex;
                    for (int j = dotBeginIndex; j < currentSharpIndex; j++) {
                        lineMappingMasu.put(j, new HashMap<String, Integer>() {
                            {
                                put("height", 1);
                                put("width", dotMasuCount);
                            }
                        });
                        // 横列で照らせる最大値を記録しておく
                        if (maxMasuLine < dotMasuCount) {
                            maxMasuLine = dotMasuCount;
                        }
                    }
                    beforeSharpIndex = currentSharpIndex;
                }
            }

            // "."は1つ以上存在するので、以下コードはデッドコード
            // // 今見ている列が全て#だった場合
            // if (lineMappingMasu.isEmpty()) {
            // // 連鎖が途切れたとして、連鎖マップを削除
            // chainMappingMasu.clear();
            // }

            // 前列までで繋がっているマスが存在する場合
            // 前回までの記録(連鎖マップ)と併せて照らせるマス数を更新する
            if (!chainMappingMasu.isEmpty()) {
                for (Map.Entry<Integer, Map<String, Integer>> masuLine : lineMappingMasu.entrySet()) {
                    // 横列のマスインデックス
                    int masuLineIndex = masuLine.getKey();

                    // 縦に繋がっていたとき
                    if (chainMappingMasu.containsKey(masuLineIndex)) {

                        // 連鎖マップのValue値であるマップを取得
                        Map<String, Integer> chainValueMap = chainMappingMasu.get(masuLineIndex);

                        int chainHeight = chainValueMap.get("height");
                        int chainWidth = chainValueMap.get("width");
                        int lineWidth = masuLine.getValue().get("width");

                        // 縦の長さを更新
                        masuLine.getValue().put("height", chainHeight + 1);

                        // 連鎖マップに記録されている横の長さより長いなら更新
                        if (chainWidth < lineWidth) {
                            masuLine.getValue().put("width", lineWidth);
                        }
                        // 短いなら連鎖マップの値で更新
                        else {
                            masuLine.getValue().put("width", chainWidth);
                        }

                        int chainMasu = chainHeight + masuLine.getValue().get("width");
                        // 現在の照らせる最大値より大きければ更新
                        if (maxMasu < chainMasu) {
                            maxMasu = chainMasu;
                        }
                    }
                }
                // 今見ている横一列のMapで連鎖Mapを更新する
                chainMappingMasu = lineMappingMasu;
            } else {
                // 連鎖マップが存在しない場合
                // 今見ている横一列のMapで連鎖Mapを更新する
                chainMappingMasu = lineMappingMasu;
            }

            // 横一列の照らせる最大数が、全体の照らせる最大数を超えていたら更新
            if (maxMasu < maxMasuLine) {
                maxMasu = maxMasuLine;
            }
            // System.out.println("■■■■■■■■■■" + (i + 1) + "列目開始" + "■■■■■■■■■■");
            // System.out.println("途中経過chainMappingMasu: " + chainMappingMasu);
            // System.out.println("途中経過maxMasu: " + maxMasu);
            // System.out.println("■■■■■■■■■■" + (i + 1) + "列目修了" + "■■■■■■■■■■");
        }

        // 照らせる最大値を出力
        System.out.println(maxMasu);
        sc.close();
    }
}