import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Test {
	public static void main(String[] args){
		ExecutorService e = Executors.newCachedThreadPool();
		for(int i = 0; i < 20; i++){
			e.execute(new Task());
		}
	}
	
}

class Task implements Runnable{
	public void run(){
		System.out.println(Singleton4.getInstance());
	}
}