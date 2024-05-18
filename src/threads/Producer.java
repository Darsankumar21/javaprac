package threads;

public class Producer implements Runnable{

	ItemQueue itemQueue;
	
	Producer(ItemQueue itemQueue){
		this.itemQueue = itemQueue;
		new Thread(this,"Producer").start();
	}
	public void run() {
		int i =0;
		while(true) {
			itemQueue.putItem(i++);
		}
	}

}
