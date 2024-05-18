package threads;

public class ItemQueue {
	int item;
	boolean valueset = false;
	synchronized int getItem(int i) {
		while(!valueset) {
			try {
				wait();
				
			}catch (InterruptedException e) {
					System.out.println("InterruptedExceptoin caught");
			}
		}
			System.out.println("Consumed:"+item);
			valueset = false;
			
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				System.out.println("InterruptedExceptoin caught");
		}
			notify();
			return item;
		
	}
		synchronized void putItem(int i) {
			while(valueset) {
				try {
					wait();
					
				}catch (InterruptedException e) {
						System.out.println("InterruptedExceptoin caught");
				}
			}
				this.item = i;
				valueset = true;
				System.out.println("Produced:"+item);
				try {
					Thread.sleep(1000);
				}catch (InterruptedException e) {
					System.out.println("InterruptedExceptoin caught");
			}
				notify();
		}

}
