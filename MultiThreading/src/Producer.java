
public class Producer extends Thread {
	Company c;
	public Producer(Company c) {
		this.c=c;
	}
	public void run() {
		int i=1;
		while(true) {
			try {
				this.c.produceMethod(i);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
		}
	}
}
