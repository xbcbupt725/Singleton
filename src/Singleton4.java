
public class Singleton4 {
	private static Singleton4 s = null;
	private Singleton4(){}
	public static synchronized Singleton4 getInstance(){
		if(s == null){
			s = new Singleton4();
		}
		return s;
	}
}
