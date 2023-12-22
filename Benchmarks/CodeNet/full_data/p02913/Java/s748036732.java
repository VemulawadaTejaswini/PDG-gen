import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static class SuffixArray {
		static class Suff implements Comparable<Suff> {
			public char c;// 后缀内容
			private String src;
			public int index;// 后缀的起始下标

			public Suff(char c, int index, String src) {
				this.c = c;
				this.index = index;
				this.src = src;
			}

			@Override
			public int compareTo(Suff o2) {
				return this.c - o2.c;
			}

			@Override
			public String toString() {
				return "Suff{" + "char='" + src.substring(index) + '\'' + ", index=" + index + '}';
			}
		}	
		void match(){
	        String s = "ABABABABB";
	        String p = "BABB";
//	        SuffixArray.Suff[] sa = SuffixArray.getSa(s); // 后缀数组
	        Suff[] sa = getSa2(s); // 后缀数组
	        int l = 0;
	        int r = s.length()-1;
	        // 二分查找 ，nlog(m)
	        while(r>=l){
	            int mid = l + ((r-l)>>1);
	            // 居中的后缀
	            Suff midSuff = sa[mid];
//	            String suffStr = midSuff.str;
	            String suffStr = s.substring(midSuff.index);
	            int compareRes;
	            // 将后缀和模式串比较，O(n);
	            if (suffStr.length()>=p.length()) {
	                compareRes = suffStr.substring(0, p.length()).compareTo(p);
	            }else {
	                compareRes = suffStr.compareTo(p);
	            }
	            // 相等了 输出后缀的起始位置
	            if(compareRes == 0){
	                System.out.println(midSuff.index);
	                break;
	            }else if (compareRes<0) {
	                l = mid + 1;
	            }else {
	                r = mid - 1;
	            
	        }
	    }
	        }

		static int[] getHeight(String src, Suff[] sa) {
			// Suff[] sa = getSa2(src);
			int strLength = src.length();
			int[] rk = new int[strLength];
			// 因为原来的sa数组是按照字符串相同排名相同，现在调整排名为不重复的排名，重新排名后得到数组rk。
			// 将rank表示为不重复的排名即0~n-1
			for (int i = 0; i < strLength; i++) {
				rk[sa[i].index] = i;
			}
			int[] height = new int[strLength];
			// （存在的规律是上一个下标i假如有k个公共前缀，并且k>0，
			// 那么下一个下标至少有一个k-1个公共前缀，那么前k个字符是不用比较的）
			// 利用这一点就可以O(n)求出高度数组
			int k = 0;
			for (int i = 0; i < strLength; i++) {
				int rk_i = rk[i]; // i后缀的排名
				if (rk_i == 0) {
					height[0] = 0;
					continue;
				}
				int rk_i_1 = rk_i - 1;
				int j = sa[rk_i_1].index;// j是i串字典序靠前的串的下标
				if (k > 0)
					k--;

				for (; j + k < strLength && i + k < strLength; k++) {
					if (src.charAt(j + k) != src.charAt(i + k))
						break;
				}
				height[rk_i] = k;

			}
			return height;
		}

		/**
		 * nlg²n 构建后缀数组
		 * 
		 * @param src
		 * @return
		 */
		static Suff[] getSa2(String src) {
			int n = src.length();
			Suff[] sa = new Suff[n];
			for (int i = 0; i < n; i++) {
				sa[i] = new Suff(src.charAt(i), i, src);// 存单个字符,接下来排序
			}
			Arrays.sort(sa);

			/** rk是下标到排名的映射 */
			int[] rk = new int[n];// suffix array
			rk[sa[0].index] = 1;
			for (int i = 1; i < n; i++) {
				rk[sa[i].index] = rk[sa[i - 1].index];
				if (sa[i].c != sa[i - 1].c)
					rk[sa[i].index]++;
			}
			// 倍增法
			for (int k = 2; rk[sa[n - 1].index] < n; k *= 2) {

				final int kk = k;
				Arrays.sort(sa, (o1, o2) -> {
					// 不是基于字符串比较,而是利用之前的rank
					int i = o1.index;
					int j = o2.index;
					if (rk[i] == rk[j]) {// 如果第一关键字相同
						if (i + kk / 2 >= n || j + kk / 2 >= n)
							return -(i - j);// 如果某个后缀不具有第二关键字,那肯定较小,索引靠后的更小
						return rk[i + kk / 2] - rk[j + kk / 2];

					} else {
						return rk[i] - rk[j];
					}
				});
				/*---排序 end---*/
				// 更新rank
				rk[sa[0].index] = 1;
				for (int i = 1; i < n; i++) {
					int i1 = sa[i].index;
					int i2 = sa[i - 1].index;
					rk[i1] = rk[i2];
					try {
						if (!src.substring(i1, i1 + kk).equals(src.substring(i2, i2 + kk)))
							rk[i1]++;
					} catch (Exception e) {
						rk[i1]++;
					}
				}
			}

			return sa;
		}	
	}
	public static void main(String[] args) {
    	
	    Scanner in=new Scanner(System.in);int len=in.nextInt();
	    String s=in.next();
        int res = maxRepeatSubString2(s);
        System.out.println(res);
	    }
	/**
	 * 不允许交叉
	 * 
	 * @param src
	 * @return
	 */
	
	private static int  maxRepeatSubString2(String src) {
		SuffixArray.Suff[] sa = SuffixArray.getSa2(src);
		int[] height = SuffixArray.getHeight(src, sa);
		int l = 0;
		int r = height.length;
		int ans = 0;
		while (l <= r) {
			int mid = l + ((r - l) >> 1);// check的重叠长度
			if (check(height, sa, mid)) {
				if (mid == height.length / 2) {
					return mid;
				}
				l = mid + 1;
				ans = mid;
				// return mid;
			} else {
				r = mid - 1;
			}
		}
		return ans;
	}
	private static boolean check(int[] height, SuffixArray.Suff[] sa, int len) {
		int minIndex = sa[0].index;
		int maxIndex = sa[0].index;
		for (int i = 1; i < height.length; i++) {
			int index = sa[i].index;
			if (height[i] >= len) { // lcp 大于 len
				minIndex = Math.min(minIndex, index);
				maxIndex = Math.max(maxIndex, index);
			} else {
				if (maxIndex - minIndex >= len) {
					return true;
				}
				maxIndex = index;
				minIndex = index;
			}
		}
		return (maxIndex - minIndex) >= len;
	}
	/**
	 * 用len将height分组,小于组和大于等于组交替 在大于组中更新最大最小原始小标,大转小的时候检查上一个大于组是否满足不重叠
	 * 在小于组中,只需持续地将原始下标付给max和min,这样小转大的时候,可以保留小于组最后一个元素的下标
	 */
}
