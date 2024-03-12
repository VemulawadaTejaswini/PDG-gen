Line_2 $$ private void sendAndReadMessage(String command) throws IOException --> Line_3 $$ sendMessage(new NhcMessageCmd(command)) [CD]
Line_2 $$ private void sendAndReadMessage(String command) throws IOException --> Line_4 $$ readMessage(this.nhcIn.readLine()) [CD]
