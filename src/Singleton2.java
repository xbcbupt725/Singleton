
public class Singleton2 {
	private Singleton2(){}
	public static Singleton2 getInstance(){
		return InnerClass.s;
	}
    private static class InnerClass{
		private static Singleton2 s = new Singleton2();
	}
}
