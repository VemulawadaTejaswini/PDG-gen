public class func{
public void doInBackground(Void... arg0){
          File file = new File(path.toString());
          if(!file.canRead()){
            /*
             * READS THE FILE UNDER PROTECTED DIRECTORY...SYSTEM FILES WITH NO READ PERMISSION
             */
            BufferedReader re = LinuxShell.execute("cat "+file.getPath());
            while((read = re.read(buffer,0,1000))!=-1)
              rea.append(buffer,0,read);
            re.close();
            openFile(path, rea);
            return null;
          }
          FileReader reader = new FileReader(new File(path.toString()));
}
}
