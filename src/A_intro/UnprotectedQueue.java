package A_intro;

/**This is an unmanaged queue. 
 * Writers and write and Readers can read at any time! */
 
public abstract class UnprotectedQueue implements Queue{

	int n;

   public void read() {
		System.out.println(n);
	}

	public void write(int x) {

		n = x;
	}
}


