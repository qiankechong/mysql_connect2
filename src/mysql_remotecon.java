import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class mysql_remotecon {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		Socket socket = null;
	    BufferedReader in = null;
	    PrintWriter out = null;
	    
	    BufferedReader input = null;
	    System.out.println("客户端 tcp client" );
	    // 请求指定ip和端口号的服务器
	    socket = new Socket("127.0.0.1",3336);
	     
	    while(true){
	 
	      in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	       
	      out = new PrintWriter(socket.getOutputStream(), true);
	      // 接收控制台的输入
	      input = new BufferedReader(new InputStreamReader(System.in));
	      // out.println("this is client info!");
	      String info = input.readLine();
	      out.println(info);
	      String str = in.readLine();	       
	      System.out.println("客户端显示--》服务器的信息：" + str);
	    }
	    //in.close();
	    //out.close();
	  }
	}

