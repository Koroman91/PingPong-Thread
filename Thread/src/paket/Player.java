package paket;

public class Player implements Runnable {
	PingPong Table;
	String Opponent;
	int Pause;
	
	public Player(String opponent, PingPong table, int pause)
	{
		Table = table;
		Opponent = opponent;
		Pause =  pause;
	}

	public void run() {
		
		while (Table.hit(Opponent))
		{
			try {
				Thread.sleep(Pause);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}

}
