
import java.io.*;

public class Hanoi {
	
	public static void main(String [] args)
	{
		Hanoi h = new Hanoi();
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String str ="";
		int numberDisc;
		
		do {
			System.out.println("Unesite broj kolutova od 1 do 5");
			try {
				str = br.readLine();
				numberDisc = Integer.parseInt(str);
			}
			catch (Exception ex)
			{
				System.out.println("Exception " +ex);
				numberDisc = -1;
			}
		}while ((numberDisc<1)||(numberDisc>5));
			h.change(numberDisc,1,3,2);
		
		
	}
      private void change(int n, int from, int on, int helper)
      {
    	  if (n>0)
    	  {
    		  change(n-1,from,helper,on);
    		  System.out.println(from+"----->"+on);
    		  change(n-1,helper,on,from);
    	  }
      }
}
