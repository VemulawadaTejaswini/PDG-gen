import java.util.*;
import java.util.stream.*;

public class Main {

	public static void main(String[] args){
		
		// 方針：タブーリスト付きの深さ優先探索、この手に限る
		
		// 隣接行列、0か1なのでbooleanで十分
		boolean[][] adjacencyMatrix = createAdjacencyMatrix();
		int n= adjacencyMatrix.length;
		// 訪問履歴、タブーリスト
		boolean[] history = new boolean[n];
		// 1番のノード（インデックスの0）から探索を始めるよ
		history[0] = true;
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
		
		history[currentNode] = true;
		
		int n = history.length;
		// ここがゴールだったみたいです。1本見つけましたよ
		if(IntStream.range(0, n).boxed().allMatch(index -> history[index])) {
			history[currentNode] = false;
			return 1;
		}
		
		// ゴールじゃなかったので再帰して木探索してきてね
//		return IntStream.range(0, n)
		int ans  = IntStream.range(0, n)
						// 隣接してて、行ったことのないところに行きたい
						.filter(index -> adjacencyMatrix[currentNode][index] && history[index] == false)
						// map関数の中でhistoryトグルさせるのは予期できない挙動なので本当は嫌
						.map(index -> {
//							history[index] = true;
							// 再帰していってきます
							int num = traverseAndCountEulerianTrail(index, adjacencyMatrix, history);
							// 深さ優先探索なので配列を使いまわせる
//							history[index] = false;
							return num;
						})
						.sum();
		
		history[currentNode] = false;
		
		return ans;
		
	}

}
