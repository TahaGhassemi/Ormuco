import java.util.HashMap;
public class Database {
	private static Database instance;
	public static Database getInstance(){
		return instance;
	}
	private HashMap<String, File> files = new HashMap<String, File>();
	public File get(String fileName){
		return files.get(fileName);
	}
	public long getModificationTime(String fileName){
		return files.get(fileName).getModificationTime();
	}
	public void create(File file){
		files.put(file.getName(),file);
	}
	public void write(String fileName, String content){
		files.get(fileName).write(content);
	}
	public void append(String fileName, String content){
		files.get(fileName).append(content);
	}
}
