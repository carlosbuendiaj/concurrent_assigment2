package A3;

import A_intro.Reader;
import A_intro.Writer;



public class Main {

	public static void main(String args[]){
		Signalled_2Readers_Queue queue;
		
		queue=new Signalled_2Readers_Queue();
		
		new Writer(queue);
		new Readerid(queue, 0);
		new Readerid(queue, 1);
	

		
		
		
		
	}
}
