package tcpdemo;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class serverCount {
	private static final String String = null;

	public static void main(String args[]) throws IOException
	{
		String input;
		int c=0;
		ServerSocket s1=new ServerSocket(8571);
		Socket ex3=s1.accept();
		Scanner sc=new Scanner(ex3.getInputStream());
		
		input=sc.nextLine();
		
		c=countWord(input); 
		 
		 PrintStream p=new PrintStream(ex3.getOutputStream());
		 p.println(c);		 
		 }	


public static int countWord(String input){

    if(input.isBlank()) {
        return 0;
    }
    int c = 0;
    for(int index = 0;index<input.length() -1 ;index++) {
        if(input.charAt(index) == ' ' && input.charAt(index +1) != ' ') {
            c += 1;
        }
   	}
    
    	return c + 1;
	}
}
