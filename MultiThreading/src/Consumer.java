
public class Consumer extends Thread{
	Company c;
	public Consumer(Company c2) {
		this.c=c2;
		
	}
	//@Override
	public void run() {
		while(true) {
			try {
				this.c.consumeMethod();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
