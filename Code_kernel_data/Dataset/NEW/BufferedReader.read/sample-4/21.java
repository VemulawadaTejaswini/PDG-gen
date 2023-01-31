//21
public class func{
public void generateGraph(String dotFile){
            while((c = br.read()) != -1) {
                if(c == '\n') {
                    if(pc == '\\') {
                        // Remove the last \ if it was part of the DOT wrapping character
                        line.deleteCharAt(line.length()-1);
                    } else {
                        GElement element = parseLine(line.toString());
                        if(element != null) {
                            if(graph == null)
                                graph = element;
                            else
                                graph.addElement(element);
                        }
                        line.delete(0, line.length());
                    }
                } else if(c != '\r') {
                    line.append((char)c);
                } else if(c == '\r') {
                    continue;
                }
                pc = c;
            }
            br.close();
}
}
