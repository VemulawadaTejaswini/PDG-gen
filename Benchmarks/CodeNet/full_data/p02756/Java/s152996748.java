
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		executeCountBalls();
//		executeTaxIncrease();
		executeStringFormation();
	}

	private static void execute() {

		Scanner in = new Scanner(System.in);

		try {
			String s1 = in.nextLine();
			String s2 = in.nextLine();
			String s3 = in.nextLine();

			int  a = Integer.parseInt(s1);
			String[] s2Array = s2.split(" ");
			int b = Integer.parseInt(s2Array[0]);
			int c = Integer.parseInt(s2Array[1]);

			int sum  = a + b + c;

//			System.out.println(a + "," + b + "," + c );

			System.out.println(sum + " " + s3);
		} catch (NumberFormatException e) {
			// TODO 自動生成された catch ブロック
			System.out.println("");
//			e.printStackTrace();
		}

	}

	public static void execute_product() {

		Scanner in = new Scanner(System.in);

		try {
			int a  = in.nextInt();
			int b  = in.nextInt();

			if( (a*b)%2 == 0 ) {
				System.out.println("Even");
			} else {
				System.out.println("Odd");
			}
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

	public static void executeCountBalls() {
		Scanner in = new Scanner(System.in);

		try {
			long N = in.nextLong();
			long A = in.nextLong();
			long B = in.nextLong();

			long surplus = N%(A+B);
			long surplusA = surplus >= A ? A : surplus;

			 long countA = N/(A+B) * A + surplusA;

			System.out.println(countA);
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}


	public static final int TAX_RATE_8 = 8;
	public static final int TAX_TATE_10 = 10;

	public static void executeTaxIncrease(){

		Scanner in = new Scanner(System.in);

		double tax8 = (double)in.nextInt();
		double tax10 = (double)in.nextInt();

		int taxExclude_min = (int)Math.ceil((tax8 * 100)/TAX_RATE_8);

		int taxExclude_max = 0;
		if( ((tax8 + 1)*100)%8 == 0 ) {
			taxExclude_max = (int)(((tax8 + 1) * 100)/TAX_RATE_8 - 1);
		}	else {
			taxExclude_max = (int)Math.floor(((tax8 + 1) * 100)/TAX_RATE_8);
		}

//		System.out.println(taxExclude_min + " " + taxExclude_max);

		int taxExclude_fix = -1;
		for( int val = taxExclude_min; val <= taxExclude_max; val++) {
			if ( (int)Math.ceil(val/TAX_TATE_10) == tax10 ) {
				taxExclude_fix = val;
				break;
			}
		}
		System.out.println(taxExclude_fix);
	}



	private static final int ENTRY_HEAD = 0x0;
	private static final int ENTRY_TAIL = 0xFFFFFFFF;
	private static int headFlag = ENTRY_HEAD;

	public static void executeStringFormation() {


//		long start = System.currentTimeMillis();

		String s1 = null;
		String s2 = null;
		int num = 0;
		List<String> queryList = new ArrayList<String>();

		if( false ) {
			Scanner in = new Scanner(System.in);

			s1 = in.nextLine();
			s2 = in.nextLine();
			num =Integer.parseInt(s2);

			for(  int i=0; i<num; i++ ) {
				queryList.add(in.nextLine());
			}

		} else {

			try {

				BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

				s1 = stdin.readLine();
				s2 = stdin.readLine();
				num = Integer.parseInt(s2);

				for(int i = 0;i<num;i++) {
					queryList.add(stdin.readLine());
				}
			} catch (NumberFormatException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}
//		long p1 = System.currentTimeMillis();

		StringBuilder sb = new StringBuilder();
		sb.append(s1);

		for( int i=0; i<num; i++ ) {
			String query = queryList.get(i);

			String[] queryArray = query.split(" ");
			if( "1".equals(queryArray[0]) ) {
				// 反転
				exchange(~headFlag);

			} else if( "2".equals(queryArray[0]) ) {
				// 追加
				if( "1".equals(queryArray[1] )) {
					// 先頭追加
					if(  headFlag == ENTRY_HEAD) {
						sb = addHead(sb, queryArray[2]);
					} else {
						sb = addTail(sb, queryArray[2]);
					}
				} else if( "2".equals(queryArray[1])) {
					// 末尾追加
					if( headFlag == ENTRY_HEAD ) {
						sb = addTail(sb, queryArray[2]);
					} else {
						sb = addHead(sb, queryArray[2]);
					}
				} else {
					;
				}
			} else {
				;
			}
		}

//long p2 = System.currentTimeMillis();
		// 出力処理
		if( headFlag == ENTRY_TAIL ) {
			sb = sb.reverse();
		}

		System.out.println(sb.toString());

//long end = System.currentTimeMillis();

//		System.out.println("start-end " + (end-start) + "ms");
//		System.out.println("start-p1 " + (p1-start) + "ms");
//		System.out.println("p1-p2 " + (p2-p1) + "ms");
//		System.out.println("p2-end " + (end-p2) + "ms");

	}


	private static void exchange(int entry){
		headFlag = entry;
	}

	private static StringBuilder addTail(StringBuilder sbuilder, String c) {
		return sbuilder.append(c);
	}

	private static StringBuilder addHead(StringBuilder sbuilder, String c) {
		return sbuilder.insert(0, c);
	}
}
