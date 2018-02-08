package paket;

public class Game {
	
	public static void main(String [] args)
	{
		PingPong pp = new PingPong();
		Thread Player1 = new Thread(new Player("Player1", pp, 500));
		Thread Player2 = new Thread(new Player("Player2", pp, 2000));
		
		Player1.setName("Player1");
		Player2.setName("Player2");
		
		Player1.start();
		Player2.start();

		try {
			Thread.sleep(3000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		pp.hit("END");
		System.out.println("The End!");
	}

}
