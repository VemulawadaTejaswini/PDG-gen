//78
public class func{
	public void createStatistics(BufferedReader br,ArrayList<Integer> file){
        tmp = br.read();
        if (tmp == -1) {
            charStats[0]++;
            file.add(0);
        } else
            file.add(tmp);
        while (tmp != -1) {
            if (tmp == (char) 0 || tmp >= 256) {
                out.close();
                throw new InvalidCharacterException();
            }
            charStats[tmp]++;
            tmp = br.read();

            if (tmp == -1) {
                charStats[0]++;
                file.add(0);
            } else
                file.add(tmp);
        }
}
}
