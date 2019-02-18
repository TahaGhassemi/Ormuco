import java.util.Date;
public class File {
	public File(String aName){
		name=aName;
		modificationTime=System.currentTimeMillis();
	}
	public String getName(){
		return name;
	}
	public String read(){
		return content;
	}
	public long getModificationTime(){
		return modificationTime;
	}
	public void write(String newContent){
		content=newContent;
		modificationTime=System.currentTimeMillis();
	}
	public void append(String newContent){
		content+=newContent;
		modificationTime=System.currentTimeMillis();
	}
	private final String name;
	private String content;
	private long modificationTime;
}
