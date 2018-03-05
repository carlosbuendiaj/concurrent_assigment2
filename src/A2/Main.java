package A2;

import A_intro.Reader;
import A_intro.Writer;



public class Main {

	public static void main(String args[]){
		Signalled_Queue queue;
		
		queue=new Signalled_Queue();
		
		new Writer(queue);
		new Reader(queue);
	

		
		//cola=new ColaSynchronized();
		//cola=new ColaBusyWait();
		//cola=new ColaConSe�ales();
		//queue=new ColaConSe�alesVariosConsumidores();
		//cola=new ColaActivaVariosConsumidores();
		
		//new Consumidor(cola);
		
		
		
	}
}
