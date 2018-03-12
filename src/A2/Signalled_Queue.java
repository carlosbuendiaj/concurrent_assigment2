package A2;

import A_intro.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Use the synchronized keyword and signals so that
 * you do not need to busy wait.
 * But of course you still need your variable to know
 * whose's turn it is.
 *
 */
 
class Signalled_Queue implements Queue{
	int n=0;
        
	boolean canWrite=false;
	@Override
	public synchronized void read() {
            if(canWrite){
            try {
                this.wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Signalled_Queue.class.getName()).log(Level.SEVERE, null, ex);
            }
            } 
            System.out.println("R: "+n);
                canWrite=!canWrite;
                this.notify();
                
	}

	@Override
	public synchronized void write(int x) {
           
            if(!canWrite){
                System.out.println("(Can't write)");
                try {
                    wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Signalled_Queue.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            n = x;
            System.out.println("W: "+n);
                     
            canWrite=!canWrite;
                  notifyAll();
	}
	
	
}


