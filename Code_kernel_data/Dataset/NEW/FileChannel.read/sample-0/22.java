//22
public class func{
public void run(){
                            int read = channel.read(buff.getByteBuffer(), offset);
                            if (read < 0) {
                                if (buff.position() > position) {
                                    buff.limit(buff.position());
                                    buff.position(position);
                                    buff.mark();
                                    list.add(buff);
                                } else {
                                    if (Debug.ENABLED)
                                        buff.lock(0);

                                    buff.recycle();
                                }

                                break;
                            } else if (buff.remaining() == 0) {
                                buff.position(position);
                                buff.mark();
                                list.add(buff);
                                buff = JVMBuff.getWithPosition(Buff.getLargestUnsplitable());
                                position = buff.position();
                            }
                        buffs = new JVMBuff[list.size()];
                        list.copyToFixed(buffs);
}
}
