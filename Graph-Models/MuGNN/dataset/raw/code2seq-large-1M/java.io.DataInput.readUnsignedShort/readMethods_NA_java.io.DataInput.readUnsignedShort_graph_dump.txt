Line_2 $$ private void readMethods() throws IOException, ClassFormatException --> Line_3 $$ final int methods_count = dataInputStream.readUnsignedShort() [CD]
Line_2 $$ private void readMethods() throws IOException, ClassFormatException --> Line_4 $$ for (int i = 0; i < methods_count; i++) [CD]
Line_3 $$ final int methods_count = dataInputStream.readUnsignedShort() --> Line_4 $$ for (int i = 0; i < methods_count; i++) [FD]
Line_4 $$ for (int i = 0; i < methods_count; i++) --> Line_5 $$ Utility.swallowFieldOrMethod(dataInputStream) [CD]
