import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	static int rowBitAnd(long mat[][] , int row){
		int ret = 1;
		for(int c = 0 ; c < mat[row].length ; ++c){
			if(mat[row][c] == -1){
				continue;
			}
			ret &= mat[row][c];
		}
		return ret;
	}

	static int rowBitOr(long mat[][] , int row){
		int ret = 0;
		for(int c = 0 ; c < mat[row].length ; ++c){
			if(mat[row][c] == -1){
				continue;
			}
			ret |= mat[row][c];
		}
		return ret;
	}

	static int colBitAnd(long mat[][] , int col){
		int ret = 1;
		for(int r = 0 ; r < mat.length ; ++r){
			if(mat[r][col] == -1){
				continue;
			}
			ret &= mat[r][col];
		}
		return ret;
	}

	static int colBitOr(long mat[][] , int col){
		int ret = 0;
		for(int r = 0 ; r < mat.length ; ++r){
			if(mat[r][col] == -1){
				continue;
			}
			ret |= mat[r][col];
		}
		return ret;
	}

	static long[][] constructBit(int S[] , int[] T , int U[] , int V[]){
		int N = S.length;
		long result[][] = new long[N][N];
		Set<Integer> undefRow = new HashSet<Integer>();
		Set<Integer> undefCol = new HashSet<Integer>();

		for(int i = 0 ; i < N ; ++i){
			Arrays.fill(result[i], -1);
			undefRow.add(i);
			undefCol.add(i);
		}
		for(int i = 0 ; i < N ; ++i){
			if(S[i] == 0 && U[i] == 1){
				undefRow.remove(i);
				for(int j = 0 ; j < N ; ++j){
					result[i][j] = 1;					
				}
			}
			if(S[i] == 1 && U[i] == 0){
				undefRow.remove(i);
				for(int j = 0 ; j < N ; ++j){
					result[i][j] = 0;
				}			
			}
		}
		for(int i = 0 ; i < N ; ++i){
			if(T[i] == 0 && V[i] == 1){
				undefCol.remove(i);
				for(int j = 0 ; j < N ; ++j){
					if(result[j][i] == 0){
						return null;
					}
					result[j][i] = 1;
				}
			}
			if(T[i] == 1 && V[i] == 0){
				undefCol.remove(i);
				for(int j = 0 ; j < N ; ++j){
					if(result[j][i] == 1){
						return null;
					}
					result[j][i] = 0;
				}			
			}			
		}
//		System.out.println(Arrays.deepToString(result));
		List<Integer> rows = new ArrayList<Integer>(undefRow);
		List<Integer> cols = new ArrayList<Integer>(undefCol);
		if(undefCol.size() > 1 && undefRow.size() > 1){
			Collections.sort(rows);
			Collections.sort(cols);
			for(int i = 0 ; i < rows.size() ; ++i){
				for(int j = 0 ; j < cols.size() ; ++j){
					int r = rows.get(i);
					int c = cols.get(j);
					result[r][c] = (i + j) % 2 == 0 ? 1 : 0;
				}
			}
			return result;
		}else if(undefCol.size() <= 1){
			if(undefCol.isEmpty()){
				for(int r : undefRow){
					if(S[r] == 0 && rowBitAnd(result, r) == 1)return null;
					if(S[r] == 1 && rowBitOr(result, r ) == 0)return null;
				}
				return result;
			}else{ // undefCol.size() == 1
				int c = cols.get(0);
				for(int r : undefRow){
					if(S[r] == 0){
						if(rowBitAnd(result, r) == 1)result[r][c] = 0;
						else result[r][c] = T[c] == 1 ? 1 : 0;
					}else{
						if(rowBitOr(result, r) == 0)result[r][c] = 1;
						else result[r][c] = T[c] == 1 ? 1 : 0;
					}
				}
				if(T[c] == 0 && colBitAnd(result, c) == 1) return null;
				if(T[c] == 1 && colBitOr(result, c) == 0)return null; 
				return result;
			}
		}else{ // undefRow.size() <= 1
			if(undefRow.isEmpty()){
				for(int c : undefCol){
					if(T[c] == 0 && colBitAnd(result, c) == 1)return null;
					if(T[c] == 1 && colBitOr(result, c) == 0)return null;					
				}
				return result;
			}else{
				int r = rows.get(0);
				for(int c : undefCol){
					if(T[c] == 0){
						if(colBitAnd(result, c) == 1)result[r][c] = 0;
						else result[r][c] = S[r] == 1 ? 1 : 0;
					}else{
						if(colBitOr(result, c) == 0)result[r][c] = 1;
						else result[r][c] = S[r] == 1 ? 1 : 0;						
					}
				}
				if(S[r] == 0 && rowBitAnd(result, r) == 1)return null;
				if(S[r] == 1 && rowBitOr(result, r) == 0)return null;
				return result;
			}
		}
	}
	static boolean construct(int S[] , int T[] , BigInteger U[] , BigInteger V[]){
		int N = S.length;
		BigInteger result[][] = new BigInteger[N][N];
		for(int i = 0 ; i < N ; ++i){
			for(int j = 0 ; j < N ; ++j){
				result[i][j] = BigInteger.ZERO;						
			}
		}
		BigInteger bit = BigInteger.ONE;
		for(int i = 0 ; i < 64 ; ++i){
			int Ubit[] = new int[N];
			int Vbit[] = new int[N];
			for(int j = 0 ; j < U.length ; ++j){
				if((! (U[j].and(bit)).equals(BigInteger.ZERO)) ){
					Ubit[j] = 1;
				}
				if((! (V[j].and(bit)).equals(BigInteger.ZERO)) ){
					Vbit[j] = 1;
				}
			}			
			long A[][] = constructBit(S, T , Ubit , Vbit);
			if(A == null){
//				continue;
				return false;
			}
//			System.out.println(bit+" "+Arrays.deepToString(A));
			for(int j = 0 ; j < N ; ++j){
				for(int k = 0 ; k < N ; ++k){
					result[j][k] = result[j][k].add( bit.multiply(BigInteger.valueOf(A[j][k])) );
				}
			}
			bit = bit.shiftLeft(1);
		}
		for(int i = 0 ; i < N ; ++i){
			StringBuilder line = new StringBuilder();
			for(int j = 0 ; j < N ; ++j){
				if(j > 0){
					line.append(' ');
				}
				line.append(result[i][j]);
			}
			System.out.println(line);
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int S[] = new int[N];
		int T[] = new int[N];
		BigInteger U[] = new BigInteger[N];
		BigInteger V[] = new BigInteger[N];
		for(int i = 0 ; i < N ; ++i){
			S[i] = sc.nextInt();
		}
		for(int i = 0 ; i < N ; ++i){
			T[i] = sc.nextInt();
		}
		for(int i = 0 ; i < N ; ++i){
			U[i] = sc.nextBigInteger();
		}
		for(int i = 0 ; i < N ; ++i){
			V[i] = sc.nextBigInteger();
		}
		if(!construct(S, T , U , V)){
			System.out.println(-1);
		}
	}
}
