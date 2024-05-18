package threads;

public class ConPro {
public static void main(String[] args) {
	ItemQueue iq = new ItemQueue();
	new Producer(iq);
	new Consumer(iq);
}
}
