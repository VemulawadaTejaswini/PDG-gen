//54
public class func{
	public void pressKeyToContinue(){
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int ch = stdin.read();
        if (ch == 'y' ||
            ch == 'Y') {
            return true;
        }
}
}
