import java.util.LinkedList;
import java.util.ListIterator;
public class Cache {
	public Cache(int aMaxSize){
		cachedFiles = new LinkedList<File>();
		database=Database.getInstance();
		maxSize=aMaxSize;
	}
	public Cache(){
		this(Integer.MAX_VALUE);
	}
	public void setMaxSize(int aMaxSize){
		maxSize=aMaxSize;
	}
	public File get(String fileName){
		ListIterator<File> iterator = cachedFiles.listIterator();
		while(iterator.hasNext()){
			File current=iterator.next();
			if(current.getName().equals(fileName)){
				iterator.remove();
				if(current.getModificationTime()==database.getModificationTime(fileName))
					return current;
				break;
			}
		}
		File file=database.get(fileName);
		cachedFiles.add(file);
		if(cachedFiles.size()>maxSize)
			cachedFiles.removeFirst();
		return file;
	}
	private Database database;
	private LinkedList<File> cachedFiles;
	private int maxSize;
}
