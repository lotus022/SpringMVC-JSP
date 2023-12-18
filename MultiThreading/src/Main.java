
public class Main {
	public static void main(String[] args) {
		Company c=new Company();
		Producer p=new Producer(c);
		Consumer ch=new Consumer(c);
		p.start();
		ch.start();
	}

}
