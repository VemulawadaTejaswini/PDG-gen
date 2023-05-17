public class func{
public void subsetObjectVector(File tabfile,int column,int varcount,int casecount,int columntype,boolean compatmode){
            bytesRead = fc.read(in);
            byte[] columnBytes = in.array();
            while (bytecount < bytesRead) {
                if (columnBytes[bytecount] == '\n') {
                    /*
                    String token = new String(columnBytes, byteoffset, bytecount-byteoffset, "UTF8");
                    if (leftover != null) {
                        String leftoverString = new String (leftover, "UTF8");
                        token = leftoverString + token;
                        leftover = null;
                    }
                    */
                    /* 
                     * Note that the way I was doing it at first - above - 
                     * was not quite the correct way - because I was creating UTF8
                     * strings from the leftover bytes, and the bytes in the 
                     * current buffer *separately*; which means, if a multi-byte
                     * UTF8 character got split in the middle between one buffer
                     * and the next, both chunks of it would become junk 
                     * characters, on each side!
                     * The correct way of doing it, of course, is to create a
                     * merged byte buffer, and then turn it into a UTF8 string. 
                     *      -- L.A. 4.0
                     */
                    String token = null; 
                    if (leftover == null) {
                        token = new String(columnBytes, byteoffset, bytecount-byteoffset, "UTF8");
                    } else {
                        byte[] merged = new byte[leftover.length + bytecount-byteoffset];
                        System.arraycopy(leftover, 0, merged, 0, leftover.length);
                        System.arraycopy(columnBytes, byteoffset, merged, leftover.length, bytecount-byteoffset);
                        token = new String (merged, "UTF8");
                        leftover = null;
                        merged = null; 
                    }
                    if (isString) {
                        if ("".equals(token)) {
                            retVector[caseindex] = null;
                        } else {
                            token = token.replaceFirst("^\\\"", "");
                            token = token.replaceFirst("\\\"$", "");
                            String[] splitTokens = token.split(Matcher.quoteReplacement("\\\\"), -2);
                            for (int i = 0; i < splitTokens.length; i++) {
                                splitTokens[i] = splitTokens[i].replaceAll(Matcher.quoteReplacement("\\\""), "\"");
                                splitTokens[i] = splitTokens[i].replaceAll(Matcher.quoteReplacement("\\t"), "\t");
                                splitTokens[i] = splitTokens[i].replaceAll(Matcher.quoteReplacement("\\n"), "\n");
                                splitTokens[i] = splitTokens[i].replaceAll(Matcher.quoteReplacement("\\r"), "\r");
                            }
                            token = StringUtils.join(splitTokens, '\\');
                            if (compatmode && !"".equals(token)) {
                                if (token.length() > 128) {
                                    if ("".equals(token.trim())) {
                                        token = token.substring(0, 129);
                                    } else {
                                        token = token.substring(0, 128);
                                        token = token.trim();
                                    }
                                } else {
                                    if ("".equals(token.trim())) {
                                        token = "null";
                                    } else {
                                        token = token.trim();
                                    }
                                }
                            }
                            retVector[caseindex] = token;
                        }
                    } else if (isDouble) {
                        try {
                            if ("inf".equalsIgnoreCase(token) || "+inf".equalsIgnoreCase(token)) {
                                retVector[caseindex] = java.lang.Double.POSITIVE_INFINITY;
                            } else if ("-inf".equalsIgnoreCase(token)) {
                                retVector[caseindex] = java.lang.Double.NEGATIVE_INFINITY;
                            } else if (token == null || token.equals("")) {
                                retVector[caseindex] = null;
                            } else {
                                retVector[caseindex] = new Double(token);
                            }
                        } catch (NumberFormatException ex) {
                            dbgLog.warning("NumberFormatException thrown for "+token+" as Double");
                            retVector[caseindex] = null;
                        }
                    } else if (isLong) {
                        try {
                            retVector[caseindex] = new Long(token);
                        } catch (NumberFormatException ex) {
                            retVector[caseindex] = null;
                        }
                    } else if (isFloat) {
                        try {
                            if ("inf".equalsIgnoreCase(token) || "+inf".equalsIgnoreCase(token)) {
                                retVector[caseindex] = java.lang.Float.POSITIVE_INFINITY;
                            } else if ("-inf".equalsIgnoreCase(token)) {
                                retVector[caseindex] = java.lang.Float.NEGATIVE_INFINITY;
                            } else if (token == null || token.equals("")) {
                                retVector[caseindex] = null;
                            } else {
                                retVector[caseindex] = new Float(token);
                            }
                        } catch (NumberFormatException ex) {
                            dbgLog.warning("NumberFormatException thrown for "+token+" as Float");
                            retVector[caseindex] = null;
                        }
                    }
                    caseindex++;
                    if (bytecount == bytesRead - 1) {
                        byteoffset = 0;
                    } else {
                        byteoffset = bytecount + 1;
                    }
                } else {
                    if (bytecount == bytesRead - 1) {
                        if (leftover == null) {
                            leftover = new byte[(int)bytesRead - byteoffset];
                            System.arraycopy(columnBytes, byteoffset, leftover, 0, (int)bytesRead - byteoffset);
                        } else {
                            if (byteoffset != 0) {
                                throw new IOException("Reached the end of the byte buffer, with some leftover left from the last read; yet the offset is not zero!");
                            }
                            byte[] merged = new byte[leftover.length + (int)bytesRead];
                            System.arraycopy(leftover, 0, merged, 0, leftover.length);
                            System.arraycopy(columnBytes, byteoffset, merged, leftover.length, (int)bytesRead);
                            leftover = merged;
                            merged = null;   
                        }
                        byteoffset = 0;
                    }
                }
                bytecount++;
            }
            in.clear();
            if (columnLength - bytesReadTotal < MAX_COLUMN_BUFFER) {
                in.limit((int)(columnLength - bytesReadTotal));
            }
        fc.close();
}
}
