package A_intro;

import java.util.logging.Level;
import java.util.logging.Logger;

/**This is an unmanaged queue. 
 * Writers and write and Readers can read at any time! */
 
class UnprotectedQueue implements Queue{

	int n;
        int turn;

   public void read() {
       while(turn!=0){
           try {
               wait(1000);
           } catch (InterruptedException ex) {
               Logger.getLogger(UnprotectedQueue.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       
		System.out.println(n);
                System.out.println("R: I´m reading");
                turn++;
	}

	public void write(int x) {
            while((turn!= 1)&&(turn!=2) ){
                try {
                    wait(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(UnprotectedQueue.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

		n = x;
                System.out.println("W: I´m writing: " + n);
                turn++;
                if(turn>2){
                    turn=0;
                }
	}
}


