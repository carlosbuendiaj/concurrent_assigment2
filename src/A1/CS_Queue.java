package A1;

import A_intro.Queue;

/**Use condition synchronization by means of busy wait.
 * 
 * What kind of variable do you need to implement busy
 * wait synchronization?
 * 
 * Set a meaningful name for such variable.
 * */
 
class CS_Queue implements Queue{
	int n=0;
	volatile boolean writerTurn;
	@Override
	public  void read() {
            
            while(writerTurn);
              
            System.out.println("R: " + n);
                          
            writerTurn=true;
	}

	@Override
	public void write(int x) {
            while(!writerTurn);
            n=x;
            System.out.println("W: " + n);
            writerTurn=false;
	}
	
	
}


