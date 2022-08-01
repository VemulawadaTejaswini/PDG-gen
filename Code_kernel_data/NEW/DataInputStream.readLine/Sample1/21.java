//20
public class func{
	public void getNumbers(){
                String line = in.readLine().trim();
                if (line.startsWith(prefix)) {
                    String[] numbers = line.substring(prefix.length()).split(" +");
                    for (int i = 1; i < 17; ++i) {
                        if (!numbers[i].equals("0")) {
                            return numbers;
                        }
                    }
                    break;
                }
}
}
