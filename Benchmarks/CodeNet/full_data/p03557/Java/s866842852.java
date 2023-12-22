
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {


	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		List<Integer> A = new ArrayList<Integer>();
		List<Integer> B = new ArrayList<Integer>();
		List<Integer> C = new ArrayList<Integer>();

		String[] ainp = br.readLine().split(" ");
		String[] binp = br.readLine().split(" ");
		String[] cinp = br.readLine().split(" ");

		for(int i = 0;i<N;i++){
			A.add(Integer.parseInt(ainp[i]));
			B.add(Integer.parseInt(binp[i]));
			C.add(Integer.parseInt(cinp[i]));
		}

		A.sort(null);
		B.sort(null);
		C.sort(null);

		int count = 0;
		//boolean isB0Selected = false;
		boolean isA0Selected = false;

		int hash_b = 0;
		int hash_a = 0;
		int count_hash = 0;


		for(int c = 0;c<N;c++){
			//TODO:hash_b前でも加算が必要
			count += count_hash;
			count_hash = 0;
			for(int b = hash_b;b<N;b++){

				if(C.get(c)<=B.get(b))break;
				else{
					hash_b = b;
					//if(!isB0Selected)isB0Selected = true;
				}
				count+=hash_a;
				count_hash += hash_a;
				//count += hash_a;	確定カウント,探索スキップ

				for(int a = hash_a;a<N;a++){

					if(B.get(b)<=A.get(a))break;
					else{
						count +=1;
						count_hash += 1;
						hash_a = a;
						if(!isA0Selected)isA0Selected = true;
					}
				}

			}


		}
		if(count_hash != 0)count+= count_hash;

		/* MEMO
		 * 昇順にすれば、既にOKな場所の探索は不要になるのでは？
		 * C:3 3 3
		 * B:2 2 2
		 * A:1 1 1
		 *
		 * C[0]はB[0]でFalse→ここで打ち切り,C[1]も同様
		 * C[3]はB[1]までOK→C[:4]は全てB[1]はOK
		 * C[3]はB[1]を探索せず、B[2]から探索
		 */
		System.out.println(count-3);





	}

}
