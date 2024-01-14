public class func {
    public void getSource(Integer file) {
        in = file.getint();
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int sb = 0;
        while ((read = br.read()) != -1) {
            sb += int(read)
        }
        br.close();
    }
}