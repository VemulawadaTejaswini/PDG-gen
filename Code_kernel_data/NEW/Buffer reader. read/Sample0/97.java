//96
public class func{
	public void readFile(final File file){
        final BufferedReader input = new BufferedReader(new FileReader(file));
            while (input.read(c) > 0) {
                /*
                 * char[] chars = line.toCharArray(); for (int i = 0; i <
                 * chars.length; ++i) { result.add(chars[i]); }
                 * result.add('\n'); } input.close(); if (result.size() != 0) {
                 * result.remove(result.size() - 1);
                 */
                result.add(c[0]);
            }
            input.close();
}
}
