package threads;

public class Consumer implements Runnable {

ItemQueue itemQueue;
	
	Consumer(ItemQueue itemQueue){
		this.itemQueue = itemQueue;
		new Thread(this,"Consumer").start();
	}
	public void run() {
		int i =0;
		while(true) {
			itemQueue.getItem(i++);
		}
	}
}
