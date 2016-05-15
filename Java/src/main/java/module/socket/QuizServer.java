package module.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class QuizServer {
	public static void main(String a[]) throws IOException{
		
		ServerSocket serverSocket = null;
		
		try{
			serverSocket = new ServerSocket(5555);
			
		}catch(IOException e){
			System.err.println("Can not connect to 5555");
			System.exit(1);
		}
		
		Socket clientSocket = null;
		
		try{
			clientSocket = serverSocket.accept();
		}catch(IOException e){
			System.err.println("fail to accept()");
			System.exit(1);
		}
		
		PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
		BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		
		
		String inputLine, outputLine;
		QuizProtocol qp = new QuizProtocol();
		
		outputLine = qp.process(null);
		out.println(outputLine);
		
		while((inputLine = in.readLine())!= null){
			outputLine = qp.process(inputLine);
			out.println(outputLine);
			if(outputLine.equals("quit"))
				break;
		}
		
		out.close();
		in.close();
		clientSocket.close();
		serverSocket.close();
	}
}
