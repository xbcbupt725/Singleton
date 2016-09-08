
public class Singleton3 {
	private static Singleton3 s = null;
	private Singleton3(){}
	public static Singleton3 getInstance(){
		if(s == null){
			synchronized(Singleton3.class){
				if(s == null){
					s = new Singleton3();
				}
			}
		}
		return s;
	}
}
