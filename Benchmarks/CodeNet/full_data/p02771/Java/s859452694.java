public class tes {
  
	public static void main(String[] arg) {
		pool(3, 3, 3);
	}

	public static void pool(int A, int B, int C) {
		String result;
		if (A == B && A != C || A == C && A != B || B == C && A != B) {
			result = "かわいそう";
		} else {
			result = "";
		}
		if (result == "かわいそう") {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}