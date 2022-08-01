//25
public class func{
	public void readMaze(String inputFileName){
            while((line = new DataInputStream(in).readLine()) != null) {
                
                String code;
                int[] xy = new int[6];  // equivalent to x1,y1,z1,x2,y2,z2
                int numToken = 0;
                
                StringTokenizer tok = new StringTokenizer(line);

                if((numToken = tok.countTokens()) < 1 ) {
                    continue;
                }

                code = tok.nextToken();

                if(code.equals("#")) {
                    /* comment line */
                    continue;
                }
                for(int i=0;i<numToken-1;i++) {
                    xy[i] = Integer.parseInt(tok.nextToken());
                }

                if(code.equals("d")) {
                      /* dimensions (format: d x y z) */
                     if(numToken != 4) {
                        isParseError = true;
                     }
                     else {
                        width = xy[0];
                        height = xy[1];
                        depth = xy[2];
                        if(width < 1 || height < 1 || depth <1)
                            isParseError = true;
                     }
                 }else if(code.equals("p")) { /* paths (format: p x1 y1 z1 x2 y2 z2) */
                    if(numToken != 7) {
                        isParseError = true;
                    }
                    else {
                        Coordinate srcPtr = Coordinate.alloc(xy[0],xy[1],xy[2]);
                        Coordinate dstPtr = Coordinate.alloc(xy[3],xy[4],xy[5]);

                        if(Coordinate.isEqual(srcPtr,dstPtr)) {
                            isParseError = true;
                        }
                        else { 
                            Pair coordinatePairPtr = Pair.alloc(srcPtr,dstPtr);
                            boolean status = workListPtr.insert(coordinatePairPtr);
                            srcVectorPtr.vector_pushBack(srcPtr);
                            dstVectorPtr.vector_pushBack(dstPtr);
                            
                        }
                    }
                }else if(code.equals("w")) {
                         /* walls (format: w x y z) */
                        if(numToken != 4) {
                            isParseError = true;
                        } else {
                            Coordinate wallPtr = Coordinate.alloc(xy[0],xy[1],xy[2]);
                            wallVectorPtr.vector_pushBack(wallPtr);
                        }
                }else { /* error */
                       isParseError = true;
                }
                
                if(isParseError)  {/* Error */
                    System.out.println("Error: line " + lineNumber + " of " + inputFileName + "invalid");
                    System.exit(1);
                }
            }
            in.close();
}
}
