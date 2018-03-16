package A3;

import A_intro.*;

public class Readerid implements Runnable{
	Queue q;
        int id;
	
	public Readerid (Queue queue, int id){
		this.q=q;
                this.id=id;
		new Thread(this,"Reader").start();
	}
	
	public void run(){
		for(int i=0;i<10;i++){
			try {
				Thread.sleep((long) (Math.random()*500));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			q.read(id);
		}	
	}
}

