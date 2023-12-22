public class Main {

	static final int N = 1000000;
	static final int SIZE = N * 10;
	static byte[] buf = new byte[SIZE];
	static int count = 0;

	static int readInt(){

		while((buf[count] < '0' || '9' < buf[count]) && (buf[count] != '-')){
			count++;
		}

		int r = 0;
		boolean minusFlg = false;
		while(buf[count] == '-'){
			minusFlg = true;
			count++;
		}
		while('0' <= buf[count] && buf[count] <= '9'){
			r = r * 10 + buf[count++] - '0';
		}
		if(minusFlg){
			r = -1 * r;
		}

		if((char)buf[count] == '\r' && (char)buf[count + 1] == '\n'){
			count += 2;
		}else if((char)buf[count] == '\n' || (char)buf[count] == '\r'){
			count++;
		}

		return r;

	}

	static long readLong(){

		while((buf[count] < '0' || '9' < buf[count]) && (buf[count] != '-')){
			count++;
		}

		long r = 0;
		boolean minusFlg = false;
		while(buf[count] == '-'){
			minusFlg = true;
			count++;
		}
		while('0' <= buf[count] && buf[count] <= '9'){
			r = r * 10 + buf[count++] - '0';
		}
		if(minusFlg){
			r = -1 * r;
		}

		if((char)buf[count] == '\r' && (char)buf[count + 1] == '\n'){
			count += 2;
		}else if((char)buf[count] == '\n' || (char)buf[count] == '\r'){
			count++;
		}

		return r;

	}

	static String readStr(){

		String r = "";

		while(buf[count] < '!' || '~' < buf[count]){
			count++;
		}

		while('!' <= buf[count] && buf[count] <= '~'){
			r = r + (char)buf[count++];
		}

		if((char)buf[count] == '\r' && (char)buf[count + 1] == '\n'){
			count += 2;
		}else if((char)buf[count] == '\n' || (char)buf[count] == '\r'){
			count++;
		}

		return r;

	}

	static String readStrContainBlank(){

		String r = "";

		while(buf[count] < ' ' || '~' < buf[count]){
			count++;
		}

		while(' ' <= buf[count] && buf[count] <= '~'){
			r = r + (char)buf[count++];
		}

		if((char)buf[count] == '\r' && (char)buf[count + 1] == '\n'){
			count += 2;
		}else if((char)buf[count] == '\n' || (char)buf[count] == '\r'){
			count++;
		}

		return r;

	}

	static char readChar(){

		char r;

		while(buf[count] < '!' || '~' < buf[count]){
			count++;
		}

		r = (char)buf[count++];

		if((char)buf[count] == '\r' && (char)buf[count + 1] == '\n'){
			count += 2;
		}else if((char)buf[count] == '\n' || (char)buf[count] == '\r'){
			count++;
		}

		return r;

	}

	static char readCharOneContainBlank(){

		char r;

		while(buf[count] < ' ' || '~' < buf[count]){
			count++;
		}

		r = (char)buf[count++];

		if((char)buf[count] == '\r' && (char)buf[count + 1] == '\n'){
			count += 2;
		}else if((char)buf[count] == '\n' || (char)buf[count] == '\r'){
			count++;
		}

		return r;

	}

	static String readLine(){

		String r = "";

		while('\n' != (char)buf[count] && '\r' != (char)buf[count]){
			r = r + (char)buf[count++];
		}

		if((char)buf[count] == '\r' && (char)buf[count + 1] == '\n'){
			count += 2;
		}else if((char)buf[count] == '\n' || (char)buf[count] == '\r'){
			count++;
		}

		return r;

	}

	public static void main (String[] args) throws Exception {

		System.in.read(buf,0,SIZE);

		int M = readInt();
		int D = readInt();

		if(M < 4 || D < 22) {
			System.out.println(0);
			return;
		}

		int productDateCount = 0;
		for(int d = 22; d <= D; d++) {
			String dStr = String.valueOf(d);
			int d1 = Integer.valueOf(dStr.substring(1, 2));
			int d10 = Integer.valueOf(dStr.substring(0, 1));
			if(d1 >= 2 && d1 * d10 <= M) {
				productDateCount++;
			}
		}
		System.out.println(productDateCount);
	}
}
