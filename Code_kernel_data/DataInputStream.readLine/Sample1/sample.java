//0
public class func{
	public void handleStreams(DataOutputStream out,InputStream in,String[] parameters){
      String line = dis.readLine().trim();
      if (line.length() == 0)
        continue;
      if (line.equals("exit")) {
        break;
      }
      if (line.equals("help")) {
        consoleOut.println("Remote paths start with a colon (:).");
        consoleOut.println();
        consoleOut.println("Create directory: +localdir");
        consoleOut.println("                  +:remotedir");
        consoleOut.println("List directory: localdir");
        consoleOut.println("                :remotedir");
        consoleOut.println("Delete file/directory: -localfile");
        consoleOut.println("                       -:remotefile");
        consoleOut.println("Copy file: localfile -> localfile");
        consoleOut.println("           localfile -> :remotefile");
        consoleOut.println("           :remotefile -> localfile");
        consoleOut.println("           :remotefile -> :remotefile");
        continue;
      } else if (line.startsWith("+")) {
        mode = javapayload.stage.JCp.JCP_MKDIR;
        line = line.substring(1);
      } else if (line.startsWith("-")) {
        mode = javapayload.stage.JCp.JCP_RM;
        line = line.substring(1);
      } else if (line.indexOf(" -> ") != -1) {
        int pos = line.indexOf(" -> ");
        String source = line.substring(0, pos).trim();
        String dest = line.substring(pos + 4).trim();
        int sourcetarget = 0, desttarget = 0;
        if (source.startsWith(":")) {
          sourcetarget = 1;
          source = source.substring(1);
        }
        if (dest.startsWith(":")) {
          desttarget = 1;
          dest = dest.substring(1);
        }
        if (sourcetarget == desttarget) {
          stageOut[desttarget].writeByte(javapayload.stage.JCp.JCP_CP_LOCAL);
          stageOut[desttarget].writeUTF(source);
          stageOut[desttarget].writeUTF(dest);
          stageOut[desttarget].flush();
          consoleOut.println(stageIn[desttarget].readUTF());
        } else {
          stageOut[sourcetarget].writeByte(javapayload.stage.JCp.JCP_CP_SEND);
          stageOut[sourcetarget].writeUTF(source);
          stageOut[sourcetarget].flush();
          long length = stageIn[sourcetarget].readLong();
          stageOut[desttarget].writeByte(javapayload.stage.JCp.JCP_CP_RECV);
          stageOut[desttarget].writeUTF(dest);
          stageOut[desttarget].writeLong(length);
          javapayload.stage.JCp.forwardLimited(stageIn[sourcetarget], stageOut[desttarget], length);
          stageOut[desttarget].flush();
          consoleOut.println(stageIn[sourcetarget].readUTF());
          consoleOut.println(stageIn[desttarget].readUTF());
        }
        continue;
      } else {
        mode = javapayload.stage.JCp.JCP_LS;
      }
      if (line.startsWith(":")) {
        target = 1;
        line = line.substring(1);
      }
}
}
//1
public class func{
	public void execute(String param){
        do {
            try {
                line = socketIn.readLine();
            } catch (IOException e) {
                throw new CGIServerException("error reading from server");
            }
            if (line == null)
                throw new CGIServerException(
                    "unexpected EOF reading server response");

            if (line.toLowerCase().startsWith(key)) {
                if (contentLengthFound)
                    ; // what would we want to do in this case??
                responseContentLength =
                    Integer.parseInt(line.substring(key.length()).trim());
                contentLengthFound = true;
            }
        } while ((line.length() != 0) &&
                 (line.charAt(0) != '\r') && (line.charAt(0) != '\n'));
        if (!contentLengthFound || responseContentLength < 0)
            throw new CGIServerException(
                "missing or invalid content length in server response");
            socketIn.readFully(buffer);
}
}
//2
public class func{
	public void HttpInputStream(InputStream in){
        do {
            line = dis.readLine();

            if (RMIMasterSocketFactory.proxyLog.isLoggable(Log.VERBOSE)) {
                RMIMasterSocketFactory.proxyLog.log(Log.VERBOSE,
                    "received header line: \"" + line + "\"");
            }

            if (line == null)
                throw new EOFException();

            if (line.toLowerCase().startsWith(key)) {
                if (contentLengthFound)
                    ; // what would we want to do in this case??
                bytesLeft =
                    Integer.parseInt(line.substring(key.length()).trim());
                contentLengthFound = true;
            }

            // The idea here is to go past the first blank line.
            // Some DataInputStream.readLine() documentation specifies that
            // it does include the line-terminating character(s) in the
            // returned string, but it actually doesn't, so we'll cover
            // all cases here...
        } while ((line.length() != 0) &&
                 (line.charAt(0) != '\r') && (line.charAt(0) != '\n'));
        if (!contentLengthFound || bytesLeft < 0) {
            // This really shouldn't happen, but if it does, shoud we fail??
            // For now, just give up and let a whole lot of bytes through...
            bytesLeft = Integer.MAX_VALUE;
        }
}
}
//3
public class func{
	public void load(InputStream inStream){
        while (pos < line.length()
               && ! Character.isWhitespace(c = line.charAt(pos++))
               && c != '=' && c != ':')
          {
            if (needsEscape && c == '\\')
              {
                if (pos == line.length())
                  {
                    // The line continues on the next line.  If there
                    // is no next line, just treat it as a key with an
                    // empty value.
                    line = reader.readLine();
                    if (line == null)
                      line = "";
                    pos = 0;
                    while (pos < line.length()
                           && Character.isWhitespace(c = line.charAt(pos)))
                      pos++;
                  }
                else
                  {
                    c = line.charAt(pos++);
                    switch (c)
                      {
                      case 'n':
                        key.append('\n');
                        break;
                      case 't':
                        key.append('\t');
                        break;
                      case 'r':
                        key.append('\r');
                        break;
                      case 'u':
                        if (pos + 4 <= line.length())
                          {
                            char uni = (char) Integer.parseInt
                              (line.substring(pos, pos + 4), 16);
                            key.append(uni);
                            pos += 4;
                          }        // else throw exception?
                        break;
                      default:
                        key.append(c);
                        break;
                      }
                  }
              }
            else if (needsEscape)
              key.append(c);
          }
        if (needsEscape)
          keyString = key.toString();
        else if (isDelim || Character.isWhitespace(c))
          keyString = line.substring(start, pos - 1);
        else
          keyString = line.substring(start, pos);
        while (pos < line.length()
               && Character.isWhitespace(c = line.charAt(pos)))
          pos++;
        if (! isDelim && (c == ':' || c == '='))
          {
            pos++;
            while (pos < line.length()
                   && Character.isWhitespace(c = line.charAt(pos)))
              pos++;
          }
        if (!needsEscape)
          {
            put(keyString, line.substring(pos));
            continue;
          }
        StringBuilder element = new StringBuilder(line.length() - pos);
        while (pos < line.length())
          {
            c = line.charAt(pos++);
            if (c == '\\')
              {
                if (pos == line.length())
                  {
                    // The line continues on the next line.
                    line = reader.readLine();

                    // We might have seen a backslash at the end of
                    // the file.  The JDK ignores the backslash in
                    // this case, so we follow for compatibility.
                    if (line == null)
                      break;

                    pos = 0;
                    while (pos < line.length()
                           && Character.isWhitespace(c = line.charAt(pos)))
                      pos++;
                    element.ensureCapacity(line.length() - pos +
                                           element.length());
                  }
                else
                  {
                    c = line.charAt(pos++);
                    switch (c)
                      {
                      case 'n':
                        element.append('\n');
                        break;
                      case 't':
                        element.append('\t');
                        break;
                      case 'r':
                        element.append('\r');
                        break;
                      case 'u':
                        if (pos + 4 <= line.length())
                          {
                            char uni = (char) Integer.parseInt
                              (line.substring(pos, pos + 4), 16);
                            element.append(uni);
                            pos += 4;
                          }        // else throw exception?
                        break;
                      default:
                        element.append(c);
                        break;
                      }
                  }
              }
            else
              element.append(c);
          }
        put(keyString, element.toString());
}
}
//4
public class func{
	public void start(DataInputStream originalIn,OutputStream out,String[] parameters){
      String cmd = in.readLine();
      while (cmd.indexOf("\0$") != -1) {
        cmd = cmd.substring(0, cmd.indexOf("\0$")) + cmd.substring(cmd.indexOf("\0$") + 2);
      }
      if (cmd.length() == 0) {
        continue;
      }
      int pos = cmd.indexOf(' ');
      if (pos != -1) {
        params = cmd.substring(pos + 1);
        cmd = cmd.substring(0, pos);
      }
      cmd = cmd.toLowerCase().intern();
        if (cmd == "cd" || cmd == "cat" || cmd == "paste") {
          fp = new File(params);
          if (!fp.isAbsolute())
            fp = new File(pwd, params);
        }
        if (cmd == "info") {
          if (params.length() == 0) {
            final Enumeration e = System.getProperties().propertyNames();
            while (e.hasMoreElements()) {
              final String property = (String) e.nextElement();
              pout.println(property + "=" + System.getProperty(property));
            }
          } else {
            pout.println(params + "=" + System.getProperty(params));
          }
        } else if (cmd == "pwd") {
          pout.println(pwd.getPath());
        } else if (cmd == "cd") {
          if (fp.exists() && fp.isDirectory()) {
            pwd = fp.getCanonicalFile();
          } else {
            pout.println("Path not found.");
          }
          pout.println(pwd.getPath());
        } else if (cmd == "ls") {
          final File[] roots = File.listRoots();
          for (int i = 0; i < roots.length; i++) {
            pout.println(roots[i].getAbsolutePath() + "\t[ROOT]");
          }
          pout.println();
          final File[] dir = pwd.listFiles();
          for (int i = 0; i < dir.length; i++) {
            pout.println(dir[i].getName() + "\t" + (dir[i].isDirectory() ? "[DIR]" : "" + dir[i].length()) + "\t" + new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date(dir[i].lastModified())));
          }
        } else if (cmd == "exec") {
          Process proc;
          handleBackgroundJob(in, new Object[] { "exec " + params, proc = Runtime.getRuntime().exec(params), proc.getOutputStream(), new JShStreamForwarder(proc.getInputStream(), pout, ss), new JShStreamForwarder(proc.getErrorStream(), pout, ss) });
        } else if (cmd == "cat") {
          final FileInputStream fis = new FileInputStream(fp);
          forward(fis, pout);
        } else if (cmd == "wget") {
          pos = params.indexOf(' ');
          if (pos == -1) {
            pout.println("  Usage: wget <URL> <filename>");
          } else {
            File f = new File(params.substring(pos + 1));
            if (!f.isAbsolute())
              f = new File(pwd, params.substring(pos + 1));
            final FileOutputStream fos = new FileOutputStream(f);
            forward(new URL(params.substring(0, pos)).openStream(), fos);
            fos.close();
          }
        } else if (cmd == "telnet") {
          pos = params.indexOf(' ');
          if (pos == -1) {
            pout.println("  Usage: telnet <host> <port>");
          } else {
            Socket s;
            handleBackgroundJob(in, new Object[] { "telnet " + params, s = new Socket(params.substring(0, pos), Integer.parseInt(params.substring(pos + 1))), s.getOutputStream(), new JShStreamForwarder(s.getInputStream(), pout, ss) });
          }
        } else if (cmd == "paste") {
          FileOutputStream fos;
          handleBackgroundJob(in, new Object[] { "paste " + params, fos = new FileOutputStream(fp), fos });
        } else if (cmd == "jobs") {
          if (params.length() == 0) {
            for (int i = 0; i < jobs.size(); i++) {
              pout.println((i + 1) + "\t" + ((Object[]) jobs.get(i))[0]);
            }
          } else {
            handleBackgroundJob(in, (Object[]) jobs.remove(Integer.parseInt(params) - 1));
          }
        } else if (cmd == "exit") {
          break;
        } else if (cmd == "help") {
          params = params.toLowerCase().intern();
          if (params == "info") {
            pout.println("info: show system properties.");
            pout.println("  Usage: info [property]");
          } else if (params == "pwd") {
            pout.println("pwd: show current directory.");
            pout.println("  Usage: pwd");
          } else if (params == "cd") {
            pout.println("cd: change directory.");
            pout.println("  Usage: cd <path>");
          } else if (params == "ls") {
            pout.println("ls: list directory.");
            pout.println("  Usage: ls");
          } else if (params == "exec") {
            pout.println("exec: execute native command.");
            pout.println("  Usage: exec <command>");
          } else if (params == "cat") {
            pout.println("cat: show text file.");
            pout.println("  Usage: cat <filename>");
          } else if (params == "wget") {
            pout.println("wget: download file.");
            pout.println("  Usage: wget <URL> <filename>");
          } else if (params == "telnet") {
            pout.println("telnet: create TCP connection.");
            pout.println("  Usage: telnet <host> <port>");
          } else if (params == "paste") {
            pout.println("paste: create text file.");
            pout.println("  Usage: paste <filename>");
          } else if (params == "jobs") {
            pout.println("jobs: list or continue jobs.");
            pout.println("  Usage: jobs [index]");
          } else if (params == "exit") {
            pout.println("exit: Exit JSh.");
            pout.println("  Usage: exit");
          } else {
            pout.println("help: show information about commands.");
            pout.println("  Usage: help [command]");
            pout.println();
            pout.println("Supported commands:");
            pout.println("    help   - show this help");
            pout.println("    info   - list system properties");
            pout.println("    pwd    - show current directory");
            pout.println("    cd     - change directory");
            pout.println("    ls     - list directory");
            pout.println("    exec   - execute native command");
            pout.println("    cat    - show text file");
            pout.println("    wget   - download file");
            pout.println("    telnet - create TCP connection");
            pout.println("    paste  - create text file");
            pout.println("    jobs   - list or continue jobs");
            pout.println("    exit   - Exit JSh");
            pout.println();
            pout.println("When inside an interactive command, enter ~. on a new");
            pout.println("line to exit from that command. Enter ~& to background the command.");
            pout.println("Enter ~~ to start a line with a ~ character");
          }
        } else {
          pout.println("Unknown command: " + cmd);
          pout.println("Type help for more info.");
        }
        ex.printStackTrace(pout);
}
}
//5
public class func{
	public void start(DataInputStream in,OutputStream out,String[] parameters){
      String line = in.readLine();
      if (line.equals("exit")) break;
        if (line.startsWith("\"")) {
          values[++maxUsed] = line.substring(1);
        } else {
          if (line.indexOf(' ')== -1 && line.indexOf('[') == -1 && line.indexOf('/') == -1) 
            line += "/";
          int pos = line.indexOf('/');
          if (pos != -1) {
            Object obj = values[Integer.parseInt(line.substring(0, pos).trim())];
            if (obj instanceof Object[] && pos == line.length()-1) {
              Object[] arr = (Object[]) obj;
              for (int i = 0; i < arr.length; i++) {
                values[++maxUsed] = arr[i];
              }
            } else {
              Class clazz = obj instanceof Class ? (Class) obj: obj.getClass();
              Method[] mthds = clazz.getMethods();
              for (int i = 0; i < mthds.length; i++) {
                if(mthds[i].getName().startsWith(line.substring(pos+1))) {
                  values[++maxUsed] = mthds[i];
                }
              }
            }
          } else {
            StringTokenizer st = new StringTokenizer(line);
            Object obj = values[Integer.parseInt(st.nextToken())];
            String mthIdx = st.nextToken();
            Object[] args = new Object[st.countTokens()];
            for (int i = 0; i < args.length; i++) {
              args[i] = values[Integer.parseInt(st.nextToken())];
            }
            if (mthIdx.equals("[")) {
              Object[] result = (Object[]) Array.newInstance((Class)obj, args.length);
              System.arraycopy(args, 0, result, 0, args.length);
              values[++maxUsed] = result;
            } else {
              Method mth = (Method) values[Integer.parseInt(mthIdx)];
              values[++maxUsed] = mth.invoke(obj, args);
            }
          }
        }
}
}
//6
public class func{
	public void GenJCov(Environment env){
        File outFile = env.getcovFile();
        if( outFile.exists()) {
           DataInputStream JCovd = new DataInputStream(
                                                       new BufferedInputStream(
                                                                               new FileInputStream(outFile)));
           String CurrLine = null;
           boolean first = true;
           String Class;

           CurrLine = JCovd.readLine();
           if ((CurrLine != null) && CurrLine.startsWith(JcovMagicLine)) {
                // this is a good Jcov file

                   while((CurrLine = JCovd.readLine()) != null ) {
                      if ( CurrLine.startsWith(JcovClassLine) ) {
                             first = true;
                             for(Enumeration e = SourceClassList.elements(); e.hasMoreElements();) {
                                 String clsName = CurrLine.substring(JcovClassLine.length());
                                 int idx = clsName.indexOf(' ');

                                 if (idx != -1) {
                                     clsName = clsName.substring(0, idx);
                                 }
                                 Class = (String)e.nextElement();
                                 if ( Class.compareTo(clsName) == 0) {
                                     first = false;
                                     break;
                                 }
                             }
                      }
                      if (first)        // re-write old class
                          TmpCovTable.addElement(CurrLine);
                   }
           }
           JCovd.close();
        }
        PrintStream CovFile = new PrintStream(new DataOutputStream(new FileOutputStream(outFile)));
        CovFile.println(JcovMagicLine);
}
}
//7
public class func{
	public void decode(){
    if (raw != null) {
      try {
        DataInputStream br = new DataInputStream(new ByteArrayInputStream(raw));
        String n = br.readLine();
        if (n == null || !n.startsWith("tree ")) {
          throw new CorruptObjectException(commitId, "no tree");
        }
        while ((n = br.readLine()) != null && n.startsWith("parent ")) {
          // empty body
        }
        if (n == null || !n.startsWith("author ")) {
          throw new CorruptObjectException(commitId, "no author");
        }
        String rawAuthor = n.substring("author ".length());
        n = br.readLine();
        if (n == null || !n.startsWith("committer ")) {
          throw new CorruptObjectException(commitId, "no committer");
        }
        String rawCommitter = n.substring("committer ".length());
        n = br.readLine();
        if (n != null && n.startsWith(  "encoding"))
          encoding = Charset.forName(n.substring("encoding ".length()));
        else
          if (n == null || !n.equals("")) {
            throw new CorruptObjectException(commitId,
                "malformed header:"+n);
        }
        byte[] readBuf = new byte[br.available()]; // in-memory stream so this is all bytes left
        br.read(readBuf);
        int msgstart = readBuf.length != 0 ? ( readBuf[0] == '\n' ? 1 : 0 ) : 0;

        if (encoding != null) {
          // TODO: this isn't reliable so we need to guess the encoding from the actual content
          author = new PersonIdent(new String(rawAuthor.getBytes(),encoding.name()));
          committer = new PersonIdent(new String(rawCommitter.getBytes(),encoding.name()));
          message = new String(readBuf,msgstart, readBuf.length-msgstart, encoding.name());
        } else {
          // TODO: use config setting / platform / ascii / iso-latin
          author = new PersonIdent(new String(rawAuthor.getBytes()));
          committer = new PersonIdent(new String(rawCommitter.getBytes()));
          message = new String(readBuf, msgstart, readBuf.length-msgstart);
        }
      } catch (IOException e) {
        e.printStackTrace();
      } finally {
        raw = null;
      }
    }
}
}
//8
public class func{
	public void readHeader(DataInputStream in){
    String buf = in.readLine();
    if (buf == null) {
      throw new IOException("Unexpected EOF reading magic token");
    }
    if (buf.charAt(0) == '#' && buf.charAt(1) == '?') {
      valid |= VALID_PROGRAMTYPE;
      programType = buf.substring(2);
      buf = in.readLine();
      if (buf == null) {
        throw new IOException("Unexpected EOF reading line after magic token");
      }
    }
}
}
//9
public class func{
	public void decode(){
        String rawCommitter = n.substring("committer ".length());
        n = br.readLine();
        if (n != null && n.startsWith(  "encoding"))
          encoding = Charset.forName(n.substring("encoding ".length()));
        else
          if (n == null || !n.equals("")) {
            throw new CorruptObjectException(commitId,
                "malformed header:"+n);
        }
        byte[] readBuf = new byte[br.available()]; // in-memory stream so this is all bytes left
        br.read(readBuf);
        if (encoding != null) {
          // TODO: this isn't reliable so we need to guess the encoding from the actual content
          author = new PersonIdent(new String(rawAuthor.getBytes(),encoding.name()));
          committer = new PersonIdent(new String(rawCommitter.getBytes(),encoding.name()));
          message = new String(readBuf,msgstart, readBuf.length-msgstart, encoding.name());
        } else {
          // TODO: use config setting / platform / ascii / iso-latin
          author = new PersonIdent(new String(rawAuthor.getBytes()));
          committer = new PersonIdent(new String(rawCommitter.getBytes()));
          message = new String(readBuf, msgstart, readBuf.length-msgstart);
        }
}
}
//10
public class func{
	public void handleStreams(DataOutputStream out,InputStream in,String[] parameters){
      String line = dis.readLine().trim();
      if (line.length() == 0)
        continue;
      if (line.equals("exit")) {
        boolean mayExit = true;
        for (int i = 0; i < runningStages.size(); i++) {
          Stage stage = (Stage) runningStages.get(i);
          if (stage.isAlive()) {
            consoleOut.println("There are still running stages.");
            mayExit = false;
            break;
          }
        }
        if (mayExit)
          break;
        else
          continue;
      }
      if (line.equals("help")) {
        consoleOut.println("Type a number to switch to that stage.");
        consoleOut.println("Type a new stage with args to run it.");
        consoleOut.println("While connected, type ]> to get back to this prompt.");
        continue;
      }
        int number = Integer.parseInt(line);
}
}
//11
public class func{
	public void createWatermarkInTransaction(){
        File file = new File("/system/etc/setup.conf");
            in = new FileInputStream(file);
            ind = new DataInputStream(in);
            String line = ind.readLine();
            if (line != null) {
                String[] toks = line.split("%");
                if (toks != null && toks.length > 0) {
                    mWatermark = new Watermark(getDefaultDisplayContentLocked().getDisplay(),
                            mRealDisplayMetrics, mFxSession, toks);
                }
            }
}
}
//12
public class func{
	public void createWatermark(){
        File file = new File("/system/etc/setup.conf");
            in = new FileInputStream(file);
            DataInputStream ind = new DataInputStream(in);
            String line = ind.readLine();
            if (line != null) {
                String[] toks = line.split("%");
                if (toks != null && toks.length > 0) {
                    mWatermark = new Watermark(mRealDisplayMetrics, mFxSession, toks);
                }
            }
}
}
//13
public class func{
	public void main(String args[]){
        PushbackInputStream pis = new PushbackInputStream
            ((new StringBufferInputStream("\r")));
        DataInputStream dis = new DataInputStream(pis);
        String line = dis.readLine();
        if (line == null) {
            throw new Exception ("Got null, should return empty line");
        }
        int count = pis.available();
        if (count != 0) {
            throw new Exception ("Test failed: available() returns "
                                 + count + "when the file is empty");
        }
}
}
//14
public class func{
	public void isRoot(){
            String currUid = osRes.readLine();
            if (null == currUid)
            {
              retval = false;
              exitSu = false;
              Log.e("ROOT", "Can't get root access or denied by user");
            }
            else if (true == currUid.contains("uid=0"))
            {
              retval = true;
              exitSu = true;
            }
            else
            {
              retval = false;
              exitSu = true;
              Log.e("ROOT", "Root access rejected: " + currUid);
            }
}
}
//15
public class func{
	public void parseHeader(DataInputStream in){
    String line = in.readLine();
    if (line == null) {
      return null;
    }
    String[] strs = line.split(" ");
}
}
//16
public class func{
	public void initList(){
        String line = dis.readLine();
        if (line == null) break;
        String[] tokes = line.split(" ");
        tableList.add(new WMoTable(tokes[0], tokes[1], tokes[2]));
}
}
//17
public class func{
	public void execFg(String cmd){
          line = ds.readLine();
          if (line == null)
            break;
          rc.add(line);
        p.destroy();
}
}
//18
public class func{
	public void start(DataInputStream in,OutputStream out,String[] parameters){
      String value = in.readLine();
      if (value == null)
        return;
}
}
//19
public class func{
	public void readHeader(DataInputStream in){
        buf = in.readLine();
        if (buf == null) {
          throw new IOException("Unexpected EOF reading header");
        }
}
}
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
//21
public class func{
	public void main(String args[]){
                line=in.readLine();
                if(line.startsWith("quit") || line.startsWith("exit"))
                    System.exit(0);
                buf=line.getBytes();
                packet=new DatagramPacket(buf, buf.length, mcast_addr, port);
                send(packet, sockets); // send on all interfaces
}
}
//22
public class func{
	public void decode(){
        String rawAuthor = n.substring("author ".length());
        n = br.readLine();
        if (n == null || !n.startsWith("committer ")) {
          throw new CorruptObjectException(commitId, "no committer");
        }
}
}
//23
public class func{
	public void start(DataInputStream in,OutputStream out,String[] parameters){
          in = new DataInputStream(rebuildInputStream());
        String line = in.readLine();
        stage = parseLine(line, stages);
        if (stage != null)
          break;
}
}
//24
public class func{
	public void prompt(DataInputStream in,PrintStream out){
            final String commandline = in.readLine().trim();
            if (commandline.length() < 1) return;
}
}
//25
public class func{
	public void main(String args[]){
                              String input =  dinput.readLine();
                              if(null == input || input.trim().length() == 0)
                                break;
                              XPath parser = new XPath(new java.io.StringBufferInputStream(input));
}
}
//26
public class func{
	public void getSchema(String location,Job job){
        DataInputStream in = fs.open(new Path(location + "/_schema"));
        String line = in.readLine();
        in.close();
            new ResourceSchema(Utils.getSchemaFromString(line));
        if (s == null) {
            throw new IOException("Unable to parse schema found in file " +
                location + "/_schema");
        }
}
}
