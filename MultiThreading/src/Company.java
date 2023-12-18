
public class Company {
	int i;
	boolean f=false;
	//f:False : chance of producer
	//f: True : chance of consumer
	 synchronized void produceMethod(int i) throws Exception{
		 if(f) {
			 wait();
		 }
		this.i=i;
		System.out.println("Producer: "+ i);
		f=true;
		notify();
	}
	synchronized int  consumeMethod() throws Exception {
		if(!f)
		{
			wait();
		}
		System.out.println("Consumer: " + this.i);
		f=false;
		notify();
		return this.i;
	}
	

}
