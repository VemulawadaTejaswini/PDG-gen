//27
public class func{
	public void createStatistics(BufferedReader br,ArrayList<Integer> file){
            if (tmp == (char) 0 || tmp >= 256) {
                out.close();
                throw new InvalidCharacterException();
            }
            tmp = br.read();
            if (tmp == -1) {
                charStats[0]++;
                file.add(0);
            } else
                file.add(tmp);
}
}
