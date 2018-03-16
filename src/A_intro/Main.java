package A_intro;



public class Main {

	public static void main(String args[]){
		UnprotectedQueue queue;
		
		queue=new UnprotectedQueue();
		
		new Writer(queue);
		new Reader(queue);
                new Reader(queue);
	

		
		//cola=new ColaSynchronized();
		//cola=new ColaBusyWait();
		//cola=new ColaConSe�ales();
		//queue=new ColaConSe�alesVariosConsumidores();
		//cola=new ColaActivaVariosConsumidores();
		
		//new Consumidor(cola);
		
		
		
	}
}
