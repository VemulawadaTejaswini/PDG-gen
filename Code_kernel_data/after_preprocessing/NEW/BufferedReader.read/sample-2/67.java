//67
public class func{
public void getLines(File file,boolean keepDuplicates){
        int current = InputReader.read();
        if (current == -1 || current == '\n') {
          if (keepDuplicates || !list.contains(line))
            list.add(line);
          line = "";
          if (current == -1)
            break; // EOF
        } else
          line += (char) current;
}
}
