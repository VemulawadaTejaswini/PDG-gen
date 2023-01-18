//10
public class func{
	public void telnet(Channel channel,String message){
                if (file != null && file.exists()) {
                    try{
                        FileInputStream fis = new FileInputStream(file);
                        try {
                          FileChannel filechannel = fis.getChannel();
                          try {
                            size = filechannel.size();
                            ByteBuffer bb;
                            if (size <= SHOW_LOG_LENGTH) {
                                bb = ByteBuffer.allocate((int) size);
                                filechannel.read(bb, 0);
                            } else {
                                int pos = (int) (size - SHOW_LOG_LENGTH);
                                bb = ByteBuffer.allocate(SHOW_LOG_LENGTH);
                                filechannel.read(bb, pos);
                            }
                            bb.flip();
                            String content = new String(bb.array()).replace("<", "&lt;")
                            .replace(">", "&gt;").replace("\n", "<br/><br/>");
                            buf.append("\r\ncontent:"+content);
                            
                            buf.append("\r\nmodified:"+(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
                            .format(new Date(file.lastModified()))));
                            buf.append("\r\nsize:"+size +"\r\n");
                          } finally {
                            filechannel.close();
                          }
                        } finally {
                          fis.close();
                        }
                    }catch (Exception e) {
                        buf.append(e.getMessage());
                    }
                }else {
                    size = 0;
                    buf.append("\r\nMESSAGE: log file not exists or log appender is console .");
                }
}
}
