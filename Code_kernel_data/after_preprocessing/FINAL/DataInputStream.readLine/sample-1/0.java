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
