import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	// テストコード
	public static void main(String[] args){
		
		// 方針：タブーリスト付きの深さ優先探索、この手に限る
		
		// 隣接行列、0か1なのでbooleanで十分
		boolean[][] adjacencyMatrix = createAdjacencyMatrix();
		int n= adjacencyMatrix.length;
		// 訪問履歴、タブーリスト
		boolean[] history = new boolean[n];
		// 1番のノード（インデックスの0）から探索を始めるよ
		int eulerianTrailNum = traverseAndCountEulerianTrail(0, adjacencyMatrix, history);
		System.out.println(eulerianTrailNum);
		
	}
	
	// 入力から隣接行列を作る
	public static boolean[][] createAdjacencyMatrix(){
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		boolean[][] ret = new boolean[n][n];
		
		IntStream.range(0, m)
			.forEach(nouse -> {
				// 配列の番号じゃなくて、ノード番号で渡されるので-1
				int p = scan.nextInt() - 1;
				int q = scan.nextInt() - 1;
				ret[p][q] = true;
				ret[q][p] = true;
			});
		
		scan.close();
		return ret;
		
	}
	
	public static int traverseAndCountEulerianTrail(int currentNode, boolean[][] adjacencyMatrix, boolean[] history) {
		// もう来てるならダメ
		if(history[currentNode]) {
			return 0;
		}
		
		// 訪問したよ
		history[currentNode] = true;
		
		int n = history.length;
		// ここがゴールだったみたいです。1本見つけましたよ
		if(IntStream.range(0, n).boxed().allMatch(index -> history[index])) {
			return 1;
		}
		
		// ゴールじゃなかったので再帰して木探索してきてね
		return (int)IntStream.range(0, n)
						// お次はどこに行こうかな？
						.filter(index -> adjacencyMatrix[currentNode][index])
						// 対してノード数じゃないと思うのでメモリ効率考えずにクローン、使いまわすの面倒だし
						.map(index -> traverseAndCountEulerianTrail(index, adjacencyMatrix, history.clone()))
						.count();
		
	}

}
