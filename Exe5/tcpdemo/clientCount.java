  
package tcpdemo;

import java.io.IOException;
import java.util.Scanner;
import java.net.Socket;
import java.net.UnknownHostException;
import java.io.PrintStream;


public class clientCount{

	public static void main(String args[]) throws UnknownHostException, IOException	{
		
		int c;
		String input;
		Scanner sc= new Scanner(System.in);
		Socket s = new Socket("127.0.0.1",8571);
		Scanner sc1= new Scanner(s.getInputStream());
		System.out.println("Please enter any word: ");
		input=sc.nextLine();
		PrintStream p= new PrintStream(s.getOutputStream());
		p.println(input);
		
		c=sc1.nextInt();
		System.out.println(c);  
	}
}
