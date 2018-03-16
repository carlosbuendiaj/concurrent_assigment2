package A_intro;

/*
 * Queue interface. You will need to implement different
 * ways to protect acces to the queue, in assignment parts
 *  A1 and A2.
 * */
public interface Queue {
	 int n=0;
	
	 public void read();
         public void read( int id);
	 
	 public void write(int x);
}
