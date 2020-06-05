public class HelloWorld {

	private int x;
	public HelloWorld(int i) {
		x = i;
		System.out.println("int:" + x);
	}

	public HelloWorld() {
		System.out.println("HelloWorld.");
	}

	public static void main(String[] args) {
		new HelloWorld();
		System.out.println("Test");
	}

}



