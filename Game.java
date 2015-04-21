import java.io.*;

public class Game {

	public Game() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		  Characters c1;
		
		  System.out.println("Reading Strings from console");
	      try
	      {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      String userInput;
	      System.out.println("Enter a Characters name...");
	      System.out.println("Enter 'quit' to quit.");
	      do {
	          userInput = (String) br.readLine();
	          System.out.println("You entered : " + userInput);
	          switch(userInput){
		          case "king" : c1 = new King(); break;
		          case "queen" : c1 = new Queen(); break;
		          default : c1 = new Troll();break;
	          }
	          if (c1!=null) c1.fight();
	        } while(!userInput.equals("quit"));
	      }
	      catch(Exception e)
	      {
	      }
	}

}
