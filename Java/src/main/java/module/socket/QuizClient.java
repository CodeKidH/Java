package module.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class QuizClient {
	public static void main(String a[]) throws IOException{
		
		Socket quizSocket = null;
		PrintWriter out = null;
		BufferedReader in = null;
		
		try{
			quizSocket = new Socket("localhost",5555);
			out = new PrintWriter(quizSocket.getOutputStream(),true);
			in = new BufferedReader(new InputStreamReader(quizSocket.getInputStream()));
		}catch(UnknownHostException e){
			System.err.println("Can not access localhost");
			System.exit(1);
		}catch(IOException e){
			System.err.println("IOerror");
			System.exit(1);
		}
		
		BufferedReader user = new BufferedReader(new InputStreamReader(System.in));
		
		String fromServer;
		String fromUser;
		
		while((fromServer = in.readLine())!= null){
			System.out.println("server:"+fromServer);
			if(fromServer.equals("quit"))
					break;
			
			fromUser = user.readLine();
			if(fromUser != null){
				System.out.println("client:"+fromUser);
				out.println(fromUser);
			}
		}
		
		out.close();
		in.close();
		quizSocket.close();
	}
}
