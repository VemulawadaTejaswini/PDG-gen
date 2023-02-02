//140
public class func{
	public void buildDocument(){
      doc.add(new TextField("path", _file.getAbsolutePath(), Store.YES));
        freader = new FileReader(_file);
        BufferedReader br = new BufferedReader(freader);
        int len = br.read(cb, 0, cb.length);
        while (end < len) {
          if (cb[end] == '\n' || cb[end] == '\r') {
            sb.append(cb, start, end - start).append('\n');
            start = end;
            while (start < len && (cb[start] == '\n' || cb[start] == '\r')) {
              start++;
            }
            end = start;
          }
          end++;
        }
}
}
