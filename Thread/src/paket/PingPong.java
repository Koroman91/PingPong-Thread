package paket;

public class PingPong {
	
	private String nextPlayer = "";
	
	public synchronized boolean hit(String opponent)
	{
		if (opponent.compareTo("END") == 0)
		{
			nextPlayer = opponent;
			notify();
			return false;
		}
		
		if (nextPlayer.compareTo("END") == 0)
		{
			//nextPlayer = opponent;
			notify();
			return false;
		}
		if (nextPlayer == "")
		{
			nextPlayer = opponent;
			
			return true;
		}
		
		String currentPlayer =Thread.currentThread().getName();
		if (currentPlayer.compareTo(nextPlayer) == 0)
		{
			System.out.println("PING! ("+ currentPlayer +")");
			nextPlayer = opponent;
			notify();
		}
		else {
			try {
				System.out.println("TIMEOUT! "+ currentPlayer + " waiting for " + nextPlayer + " to play.");
			wait();
			}
		catch (InterruptedException e)
		{
			System.out.println(e.getMessage());
			
		}
			
	}
          return true;
    }
}