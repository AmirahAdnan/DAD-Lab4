package server;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import googletranslate.Translation;

public class ServerTranslationApplication {

	public static void main (String[] args) throws IOException {
		
		ServerFrame test = new ServerFrame();
		test.setVisible(true);
		
		ServerSocket s = new ServerSocket(9999);
		Socket ss = s.accept();
		
		DataInputStream dataInput = new DataInputStream(ss.getInputStream());
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		DataOutputStream dataOutput = new DataOutputStream(ss.getOutputStream());
		Translation t = new Translation();
		test.setConnectionStatus(true);
		while(true) {
			String yoo = dataInput.readUTF();
			System.out.println("yoo");
			String input = t.Translate(yoo);
			System.out.println(input);
			
			dataOutput.writeUTF(input);
		}
	
	}
		
	}