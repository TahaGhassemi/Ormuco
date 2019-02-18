public class LocalMachine {
	public LocalMachine(){
		cache=new Cache();
	}
	public LocalMachine(int cacheSize){
		cache=new Cache(cacheSize);
	}
	public void save(File file) {
		Database.getInstance().write(file.getName(), file.read());
	}
	public Cache getCache(){
		return cache;
	}
	private Cache cache;
}
