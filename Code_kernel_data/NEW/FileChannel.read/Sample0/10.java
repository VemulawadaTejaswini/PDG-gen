//9
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
                            // An empty string is a string missing value!
                            // An empty string in quotes is an empty string!
                            retVector[caseindex] = null;
                        } else {
                            // Strip the outer quotes:
                            token = token.replaceFirst("^\\\"", "");
                            token = token.replaceFirst("\\\"$", "");
                            
                            // We need to restore the special characters that 
                            // are stored in tab files escaped - quotes, new lines 
                            // and tabs. Before we do that however, we need to 
                            // take care of any escaped backslashes stored in 
                            // the tab file. I.e., "foo\t" should be transformed 
                            // to "foo<TAB>"; but "foo\\t" should be transformed 
                            // to "foo\t". This way new lines and tabs that were
                            // already escaped in the original data are not 
                            // going to be transformed to unescaped tab and 
                            // new line characters!
                            
                            String[] splitTokens = token.split(Matcher.quoteReplacement("\\\\"), -2);
                            
                            // (note that it's important to use the 2-argument version 
                            // of String.split(), and set the limit argument to a
                            // negative value; otherwise any trailing backslashes 
                            // are lost.)
                            
                            for (int i = 0; i < splitTokens.length; i++) {
                                splitTokens[i] = splitTokens[i].replaceAll(Matcher.quoteReplacement("\\\""), "\"");
                                splitTokens[i] = splitTokens[i].replaceAll(Matcher.quoteReplacement("\\t"), "\t");
                                splitTokens[i] = splitTokens[i].replaceAll(Matcher.quoteReplacement("\\n"), "\n");
                                splitTokens[i] = splitTokens[i].replaceAll(Matcher.quoteReplacement("\\r"), "\r");
                            }
                            // TODO: 
                            // Make (some of?) the above optional; for ex., we 
                            // do need to restore the newlines when calculating UNFs;
                            // But if we are subsetting these vectors in order to 
                            // create a new tab-delimited file, they will 
                            // actually break things! -- L.A. Jul. 28 2014
                            
                            token = StringUtils.join(splitTokens, '\\');
                            
                            // "compatibility mode" - a hack, to be able to produce
                            // unfs identical to those produced by the "early" 
                            // unf5 jar; will be removed in production 4.0. 
                            // -- L.A. (TODO: ...)
                            if (compatmode && !"".equals(token)) {
                                if (token.length() > 128) {
                                    if ("".equals(token.trim())) {
                                        // don't ask... 
                                        token = token.substring(0, 129);
                                    } else {
                                        token = token.substring(0, 128);
                                        //token = String.format(loc, "%.128s", token);
                                        token = token.trim();
                                        //dbgLog.info("formatted and trimmed: "+token);
                                    }
                                } else {
                                    if ("".equals(token.trim())) {
                                        // again, don't ask; 
                                        // - this replicates some bugginness 
                                        // that happens inside unf5;
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
                            // TODO: verify that NaN and +-Inf are 
                            // handled correctly here! -- L.A.
                            // Verified: new Double("nan") works correctly, 
                            // resulting in Double.NaN;
                            // Double("[+-]Inf") doesn't work however; 
                            // (the constructor appears to be expecting it
                            // to be spelled as "Infinity", "-Infinity", etc. 
                            if ("inf".equalsIgnoreCase(token) || "+inf".equalsIgnoreCase(token)) {
                                retVector[caseindex] = java.lang.Double.POSITIVE_INFINITY;
                            } else if ("-inf".equalsIgnoreCase(token)) {
                                retVector[caseindex] = java.lang.Double.NEGATIVE_INFINITY;
                            } else if (token == null || token.equals("")) {
                                // missing value:
                                retVector[caseindex] = null;
                            } else {
                                retVector[caseindex] = new Double(token);
                            }
                        } catch (NumberFormatException ex) {
                            dbgLog.warning("NumberFormatException thrown for "+token+" as Double");

                            retVector[caseindex] = null; // missing value
                            // TODO: ?
                        }
                    } else if (isLong) {
                        try {
                            retVector[caseindex] = new Long(token);
                        } catch (NumberFormatException ex) {
                            retVector[caseindex] = null; // assume missing value
                        }
                    } else if (isFloat) {
                        try {
                            if ("inf".equalsIgnoreCase(token) || "+inf".equalsIgnoreCase(token)) {
                                retVector[caseindex] = java.lang.Float.POSITIVE_INFINITY;
                            } else if ("-inf".equalsIgnoreCase(token)) {
                                retVector[caseindex] = java.lang.Float.NEGATIVE_INFINITY;
                            } else if (token == null || token.equals("")) {
                                // missing value:
                                retVector[caseindex] = null;
                            } else {
                                retVector[caseindex] = new Float(token);
                            }
                        } catch (NumberFormatException ex) {
                            dbgLog.warning("NumberFormatException thrown for "+token+" as Float");
                            retVector[caseindex] = null; // assume missing value (TODO: ?)
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
                        // We've reached the end of the buffer; 
                        // This means we'll save whatever unused bytes left in 
                        // it - i.e., the bytes between the last new line 
                        // encountered and the end - in the leftover buffer. 
                        
                        // *EXCEPT*, there may be a case of a very long String
                        // that is actually longer than MAX_COLUMN_BUFFER, in 
                        // which case it is possible that we've read through
                        // an entire buffer of bytes without finding any 
                        // new lines... in this case we may need to add this
                        // entire byte buffer to an already existing leftover 
                        // buffer!
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
                            //leftover = null;
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
