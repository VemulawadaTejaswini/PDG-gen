
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.AbstractMap;
import java.util.NoSuchElementException;

/** ABC-114-C */
public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int N = sc.nextInt();

		int count = 0;
		int numLength = String.valueOf(N).length();

		for (;;) {
			if (numLength < 3) {
				break;
			}
			for (int a2 = 3; a2 <= 7; a2 += 2) {
				for (int a1 = 3; a1 <= 7; a1 += 2) {
					for (int a0 = 3; a0 <= 7; a0 += 2) {
						if (a0 + 10 * a1 + 100 * a2 > N) {
							break;
						}
						boolean exist3 = false;
						boolean exist5 = false;
						boolean exist7 = false;
						if (a0 == 3 || a1 == 3 || a2 == 3) {
							exist3 = true;
						}
						if (a0 == 5 || a1 == 5 || a2 == 5) {
							exist5 = true;
						}
						if (a0 == 7 || a1 == 7 || a2 == 7) {
							exist7 = true;
						}
						if (exist3 && exist5 && exist7) {
							count++;
						}
					}
				}
			}
			if (numLength < 4) {
				break;
			}
			for (int a3 = 3; a3 <= 7; a3 += 2) {
				for (int a2 = 3; a2 <= 7; a2 += 2) {
					for (int a1 = 3; a1 <= 7; a1 += 2) {
						for (int a0 = 3; a0 <= 7; a0 += 2) {
							if (a0 + 10 * a1 + 100 * a2 + 1000 * a3 > N) {
								break;
							}

							boolean exist3 = false;
							boolean exist5 = false;
							boolean exist7 = false;
							if (a0 == 3 || a1 == 3 || a2 == 3 || a3 == 3) {
								exist3 = true;
							}
							if (a0 == 5 || a1 == 5 || a2 == 5 || a3 == 5) {
								exist5 = true;
							}
							if (a0 == 7 || a1 == 7 || a2 == 7 || a3 == 7) {
								exist7 = true;
							}
							if (exist3 && exist5 && exist7) {
								count++;
							}
						}
					}
				}
			}

			if (numLength < 5) {
				break;
			}
			for (int a4 = 3; a4 <= 7; a4 += 2) {
				for (int a3 = 3; a3 <= 7; a3 += 2) {
					for (int a2 = 3; a2 <= 7; a2 += 2) {
						for (int a1 = 3; a1 <= 7; a1 += 2) {
							for (int a0 = 3; a0 <= 7; a0 += 2) {
								if (a0 + 10 * a1 + 100 * a2 + 1000 * a3 + 10000 * a4 > N) {
									break;
								}
								boolean exist3 = false;
								boolean exist5 = false;
								boolean exist7 = false;
								if (a0 == 3 || a1 == 3 || a2 == 3 || a3 == 3 || a4 == 3) {
									exist3 = true;
								}
								if (a0 == 5 || a1 == 5 || a2 == 5 || a3 == 5 || a4 == 5) {
									exist5 = true;
								}
								if (a0 == 7 || a1 == 7 || a2 == 7 || a3 == 7 || a4 == 7) {
									exist7 = true;
								}
								if (exist3 && exist5 && exist7) {
									count++;
								}
							}
						}
					}
				}
			}

			if (numLength < 6) {
				break;
			}
			for (int a5 = 3; a5 <= 7; a5 += 2) {
				for (int a4 = 3; a4 <= 7; a4 += 2) {
					for (int a3 = 3; a3 <= 7; a3 += 2) {
						for (int a2 = 3; a2 <= 7; a2 += 2) {
							for (int a1 = 3; a1 <= 7; a1 += 2) {
								for (int a0 = 3; a0 <= 7; a0 += 2) {
									if (a0 + 10 * a1 + 100 * a2 + 1000 * a3 + 10000 * a4 + 100000 * a5 > N) {
										break;
									}
									boolean exist3 = false;
									boolean exist5 = false;
									boolean exist7 = false;
									if (a0 == 3 || a1 == 3 || a2 == 3 || a3 == 3 || a4 == 3 || a5 == 3) {
										exist3 = true;
									}
									if (a0 == 5 || a1 == 5 || a2 == 5 || a3 == 5 || a4 == 5 || a5 == 5) {
										exist5 = true;
									}
									if (a0 == 7 || a1 == 7 || a2 == 7 || a3 == 7 || a4 == 7 || a5 == 7) {
										exist7 = true;
									}
									if (exist3 && exist5 && exist7) {
										count++;
									}
								}
							}
						}
					}
				}
			}
			if (numLength < 7) {
				break;
			}
			for (int a6 = 3; a6 <= 7; a6 += 2) {
				for (int a5 = 3; a5 <= 7; a5 += 2) {
					for (int a4 = 3; a4 <= 7; a4 += 2) {
						for (int a3 = 3; a3 <= 7; a3 += 2) {
							for (int a2 = 3; a2 <= 7; a2 += 2) {
								for (int a1 = 3; a1 <= 7; a1 += 2) {
									for (int a0 = 3; a0 <= 7; a0 += 2) {
										if (a0 + 10 * a1 + 100 * a2 + 1000 * a3 + 10000 * a4 + 100000 * a5 +
												1000000 * a6 > N) {
											break;
										}
										boolean exist3 = false;
										boolean exist5 = false;
										boolean exist7 = false;
										if (a0 == 3 || a1 == 3 || a2 == 3 || a3 == 3 || a4 == 3 || a5 == 3
												|| a6 == 3) {
											exist3 = true;
										}
										if (a0 == 5 || a1 == 5 || a2 == 5 || a3 == 5 || a4 == 5 || a5 == 5
												|| a6 == 5) {
											exist5 = true;
										}
										if (a0 == 7 || a1 == 7 || a2 == 7 || a3 == 7 || a4 == 7 || a5 == 7
												|| a6 == 7) {
											exist7 = true;
										}
										if (exist3 && exist5 && exist7) {
											count++;
										}
									}
								}
							}
						}
					}
				}
			}
			if (numLength < 8) {
				break;
			}
			for (int a7 = 3; a7 <= 7; a7 += 2) {
				for (int a6 = 3; a6 <= 7; a6 += 2) {
					for (int a5 = 3; a5 <= 7; a5 += 2) {
						for (int a4 = 3; a4 <= 7; a4 += 2) {
							for (int a3 = 3; a3 <= 7; a3 += 2) {
								for (int a2 = 3; a2 <= 7; a2 += 2) {
									for (int a1 = 3; a1 <= 7; a1 += 2) {
										for (int a0 = 3; a0 <= 7; a0 += 2) {
											if (a0 + 10 * a1 + 100 * a2 + 1000 * a3 + 10000 * a4 + 100000 * a5 +
													1000000 * a6 + 1000000 * a7 > N) {
												break;
											}
											boolean exist3 = false;
											boolean exist5 = false;
											boolean exist7 = false;
											if (a0 == 3 || a1 == 3 || a2 == 3 || a3 == 3 || a4 == 3 || a5 == 3
													|| a6 == 3 || a7 == 3) {
												exist3 = true;
											}
											if (a0 == 5 || a1 == 5 || a2 == 5 || a3 == 5 || a4 == 5 || a5 == 5
													|| a6 == 5 || a7 == 5) {
												exist5 = true;
											}
											if (a0 == 7 || a1 == 7 || a2 == 7 || a3 == 7 || a4 == 7 || a5 == 7
													|| a6 == 7 || a7 == 7) {
												exist7 = true;
											}
											if (exist3 && exist5 && exist7) {
												count++;
											}
										}
									}
								}
							}
						}
					}
				}
			}

			if (numLength < 9) {
				break;
			}
			for (int a8 = 3; a8 <= 7; a8 += 2) {
				for (int a7 = 3; a7 <= 7; a7 += 2) {
					for (int a6 = 3; a6 <= 7; a6 += 2) {
						for (int a5 = 3; a5 <= 7; a5 += 2) {
							for (int a4 = 3; a4 <= 7; a4 += 2) {
								for (int a3 = 3; a3 <= 7; a3 += 2) {
									for (int a2 = 3; a2 <= 7; a2 += 2) {
										for (int a1 = 3; a1 <= 7; a1 += 2) {
											for (int a0 = 3; a0 <= 7; a0 += 2) {
												if (a0 + 10 * a1 + 100 * a2 + 1000 * a3 + 10000 * a4 + 100000 * a5 +
														1000000 * a6 + 1000000 * a7 + 10000000 * a8 > N) {
													break;
												}
												boolean exist3 = false;
												boolean exist5 = false;
												boolean exist7 = false;
												if (a0 == 3 || a1 == 3 || a2 == 3 || a3 == 3 || a4 == 3 || a5 == 3
														|| a6 == 3 || a7 == 3 || a8 == 3) {
													exist3 = true;
												}
												if (a0 == 5 || a1 == 5 || a2 == 5 || a3 == 5 || a4 == 5 || a5 == 5
														|| a6 == 5 || a7 == 5 || a8 == 5) {
													exist5 = true;
												}
												if (a0 == 7 || a1 == 7 || a2 == 7 || a3 == 7 || a4 == 7 || a5 == 7
														|| a6 == 7 || a7 == 7 || a8 == 7) {
													exist7 = true;
												}
												if (exist3 && exist5 && exist7) {
													count++;
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}

		}

		//		for (int i = ary; i <= index; i++) {
		//			boolean exist3 = false;
		//			boolean exist5 = false;
		//			boolean exist7 = false;
		//
		//			String str = new Integer(i).toString();
		//			int tmpCount = 0;
		//			for (char x : str.toCharArray()) {
		//				if (x == '3') {
		//					tmpCount++;
		//					exist3 = true;
		//				} else if (x == '5') {
		//					tmpCount++;
		//					exist5 = true;
		//				} else if (x == '7') {
		//					tmpCount++;
		//					exist7 = true;
		//				} else {
		//					break;
		//				}
		//			}
		//			if (tmpCount == str.length() && exist3 && exist5 && exist7) {
		//				count++;
		//			}
		//		}

		//************************************/
		// ここから出力処理
		//************************************/
		PrintWriter out = new PrintWriter(System.out);

		out.println(count);

		// 最後に必ずFlush
		out.flush();
	}

}

///** ABC-114-B */
//public class Main {
//	public static void main(String[] args) {
//		FastScanner sc = new FastScanner();
//		String S = sc.next();
//
//		char[] cary = S.toCharArray();
//		int[] ary = new int[S.length()];
//
//		for(int i = 0; i < S.length(); i++) {
//			ary[i] = Character.getNumericValue(cary[i]);
//		}
//
//		int ans = 99999999;
//		for(int i = 2; i < S.length(); i++) {
//			int tmp = Math.abs(753 - (100 * ary[i-2] + 10 * ary[i-1]+ 1 * ary[i]));
//			if(ans > tmp) {
//				ans = tmp;
//			}
//		}
//
//
//		//************************************/
//		// ここから出力処理
//		//************************************/
//		PrintWriter out = new PrintWriter(System.out);
//
//
//		out.println(ans);
//
//		// 最後に必ずFlush
//		out.flush();
//	}
//}

///** ABC114 -A */
///** テンプレート */
//public class Main {
//	public static void main(String[] args) {
//		FastScanner sc = new FastScanner();
//		int N = sc.nextInt();
////		int[][] ary = new int[2][N];
////		int[] copy = new int[N];
////
////
////		int sum = 0;
////
////		for(int i = 0; i < N; i++) {
////			ary[0][i] = i;
////			ary[1][i] = sc.nextInt();
////			sum+= ary[1][i];
////		}
////
////		double ave = Math.round((double)sum / N);
////
////		Arrays.sort(ary, (a, b) -> Integer.compare(a[1], b[1]));
////
////		int ansIndex = 0;
////		double def = 99999999;
////		for(int i = 0; i < N; i++) {
////			if(def < Math.abs(ave - ary[1][i])) {
////
////			}
////		}
//
//
//		//************************************/
//		// ここから出力処理
//		//************************************/
//		PrintWriter out = new PrintWriter(System.out);
//
//		if(N == 3 || N == 5 || N== 7) {
//			out.println("YES");
//
//		}else {
//			out.println("NO");
//		}
//
//
//		// 最後に必ずFlush
//		out.flush();
//	}
//}

///** テンプレート */
//public class Main {
//	public static void main(String[] args) {
//		FastScanner sc = new FastScanner();
//		int N = sc.nextInt();
//		int M =  sc.nextInt();
//
//		int[] ary = new int[N];
//		for(int i = 0; i < N; i++) {
//			ary[i] = sc.nextInt();
//		}
//
//		//************************************/
//		// ここから出力処理
//		//************************************/
//		PrintWriter out = new PrintWriter(System.out);
//
//
//		out.println("hoge");
//
//		// 最後に必ずFlush
//		out.flush();
//	}
//}

/** スキャン用 */
class FastScanner {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;

	/** クラス内部用だよ */
	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		} else {
			ptr = 0;
			try {
				buflen = in.read(buffer);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (buflen <= 0) {
				return false;
			}
		}
		return true;
	}

	/** クラス内部用だよ */
	private int readByte() {
		if (hasNextByte()) {
			return buffer[ptr++];
		} else {
			return -1;
		}
	}

	/**
	 * クラス内部用だよ
	 * ASCII の文字の内、表示用の文字を返す関数
	 *
	 * @return 改行とか制御文字じゃない、表示用文字ならtrue
	 * */
	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}

	/**
	 * @return 改行文字とか空白以外を除いた、次の文字があればtrue
	 * */
	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
			ptr++;
		}
		return hasNextByte();
	}

	/**
	 *
	 * @return 次の文字列
	 */
	public String next() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}

		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	/**
	 *
	 * @return 次のLong
	 */
	public long nextLong() {
		if (!hasNext())
			throw new NoSuchElementException();
		long n = 0;
		boolean minus = false;
		int b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) {
			throw new NumberFormatException();
		}
		while (true) {
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			} else if (b == -1 || !isPrintableChar(b)) {
				return minus ? -n : n;
			} else {
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}

	/**
	 *
	 * @return 次のInt
	 */
	public int nextInt() {
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
			throw new NumberFormatException();
		return (int) nl;
	}

	/**
	 *
	 * @return 次のDouble
	 */
	public double nextDouble() {
		return Double.parseDouble(next());
	}
}

class Pair<K, V> extends AbstractMap.SimpleEntry<K, V> {
	/** serialVersionUID. */
	private static final long serialVersionUID = 6411527075103472113L;

	public Pair(final K key, final V value) {
		super(key, value);
	}
}
