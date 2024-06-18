package Threading;

public class Twothreadrunata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable task = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};

		Thread t = new Thread(task, "thread-1");
		Thread t2 = new Thread(task, "thread-2");
		t.start();
		t2.start();
		System.out.println(t.getName() + t2.getName());
	}

}
