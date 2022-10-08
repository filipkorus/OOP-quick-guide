class multithreading {
	private static void countToFive(int threadId) { // this function prints numbers from 1 to 5 and waits 1s after every number printed
		for (int i = 1; i <= 5; ++i) {
			System.out.printf("thread id = %d: %d\n", threadId, i);

			try {
				Thread.sleep(1000); // wait for a second (1000ms)
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("This is the first line in this function");

		Thread myThread = new Thread(() -> {
			// code inside this block will be executed in separate thread
			countToFive(1);
		});

		Thread myThread2 = new Thread(() -> {
			// code inside this block will be executed in separate thread
			countToFive(2);
		});

		// code in those two above threads will run at the same time!

		// start threads
		myThread.start();
		myThread2.start();

		// without using Threads countToFive() function would be executed one after another,
		// so it will firstly count from 1 to 5 and secondly function will count 1 to 5
		// instead of counting at the same time

		System.out.println("Hello from the very last line of this program!!");
	}
}
