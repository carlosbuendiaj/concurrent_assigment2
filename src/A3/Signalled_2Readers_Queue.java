package A3;

import A_intro.Queue;

/**
 * Use the synchronized keyword and signals.
 * 
 * You cannot decide whose's turn it is based on 
 * a 2 states variables, so know use a variable which
 * allows for more values (you need 3 states, that is, 3 turns).
 *
 */
 
class Signalled_2Readers_Queue implements Queue{
	int n=0;
        int turn=0;
        
	
        
         public void read( int id){
         while(id == this.turn){
             try { 
                 wait();
             } catch (InterruptedException ex) {
                 Logger.getLogger(Signalled_2Readers_Queue.class.getName()).log(Level.SEVERE, null, ex);
             }
            
         }
         
         System.out.println("R"+ id + ": " + n);    
         turn=id+1;
         notifyAll();
         
         }
        
	@Override
	public void read() {
		while(this.turn != 0 ){
                    try {
                        wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Signalled_2Readers_Queue.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                System.out.println("R: I´m reading");
                turn++;
		
	}

	@Override
	public void write(int x) {
            
		 while((this.turn != 1)&&(this.turn != 2) ){
                     System.out.println("Cant write");
                     try {
                         wait();
                     } catch (InterruptedException ex) {
                         Logger.getLogger(Signalled_2Readers_Queue.class.getName()).log(Level.SEVERE, null, ex);
                     }
                 }
                      n = x;
            System.out.println("W: "+n);
                     
            turn++;
                     if (turn>2) {
                         turn=0;
                         
                     }
                  notifyAll();
                
            
		
	}
	
	
}


