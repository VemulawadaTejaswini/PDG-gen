public class func{
public void onItemClick(AdapterView<?> adapterView,View view,int pos,long id){
        new Thread(new SetIconRunnable(rom, m_adapter.getItem(pos))).start();
}
}
