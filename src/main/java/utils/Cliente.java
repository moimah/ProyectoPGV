package utils;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Cliente {

	static ObjectOutputStream objectOutputStream;
	static ObjectInputStream objectInputStream;
	
	private static Socket socket; 
	
	public static void open() throws Exception {
		
		System.out.println("Creando socket cliente");

		String kevin = "10.1.2.129";
		InetAddress ip = InetAddress.getLocalHost();
		int port = 4444;
		
		//Abir conexión
		 socket = new Socket(ip, port);

		objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
		objectInputStream = new ObjectInputStream(socket.getInputStream());
	}
	

	

	
	public static String sumar(double a, double b) throws Exception {

		open();
		
		Magic magic = new Magic(1, a, b);
		objectOutputStream.writeObject(magic);

		String dato = (String) objectInputStream.readObject();

		objectInputStream.close();
		objectOutputStream.close();

		System.out.println(dato);
		
		socket.close();

		return dato;

	}
	
	
	public static String restar(double a, double b) throws Exception {
		
		open();

		Magic magic = new Magic(2, a, b);
		objectOutputStream.writeObject(magic);

		String dato = (String) objectInputStream.readObject();

		objectInputStream.close();
		objectOutputStream.close();

		System.out.println(dato);
		
		socket.close();

		return dato;

	}
	
	
	public static String multiplicar(double a, double b) throws Exception {

		open();
		
		Magic magic = new Magic(3, a, b);
		objectOutputStream.writeObject(magic);

		String dato = (String) objectInputStream.readObject();

		objectInputStream.close();
		objectOutputStream.close();

		System.out.println(dato);
		
		socket.close();

		return dato;

	}
	
	
	public static String dividir(double a, double b) throws Exception {
		
		open();

		Magic magic = new Magic(4, a, b);
		objectOutputStream.writeObject(magic);

		String dato = (String) objectInputStream.readObject();

		objectInputStream.close();
		objectOutputStream.close();

		System.out.println(dato);
		
		socket.close();

		return dato;

	}
	
	
	public static String raiz(double a, double b) throws Exception {
		
		open();

		Magic magic = new Magic(5, a, b);
		objectOutputStream.writeObject(magic);

		String dato = (String) objectInputStream.readObject();

		objectInputStream.close();
		objectOutputStream.close();

		System.out.println(dato);

		socket.close();
		
		return dato;

	}
	
	
	public static String potencia(double a, double b) throws Exception {

		open();
		
		Magic magic = new Magic(6, a, b);
		objectOutputStream.writeObject(magic);

		String dato = (String) objectInputStream.readObject();

		objectInputStream.close();
		objectOutputStream.close();

		System.out.println(dato);
		
		socket.close();

		return dato;

	}
	
	
	public static String logaritmo(double a, double b) throws Exception {
		
		open();

		Magic magic = new Magic(7, a, b);
		objectOutputStream.writeObject(magic);

		String dato = (String) objectInputStream.readObject();

		objectInputStream.close();
		objectOutputStream.close();

		System.out.println(dato);

		socket.close();
		
		return dato;

	}
	
	public static String SIN(double a) throws Exception {

		open();
		
		Magic magic = new Magic(8, a, 0);
		objectOutputStream.writeObject(magic);

		String dato = (String) objectInputStream.readObject();

		objectInputStream.close();
		objectOutputStream.close();

		System.out.println(dato);
		
		socket.close();

		return dato;

	}
	
	
	public static String COS(double a) throws Exception {
		
		open();

		Magic magic = new Magic(9, a, 0);
		objectOutputStream.writeObject(magic);

		String dato = (String) objectInputStream.readObject();

		objectInputStream.close();
		objectOutputStream.close();

		System.out.println(dato);
		
		socket.close();

		return dato;

	}
	
	
	public static String TAG(double a) throws Exception {
		
		open();

		Magic magic = new Magic(10, a, 0);
		objectOutputStream.writeObject(magic);

		String dato = (String) objectInputStream.readObject();

		objectInputStream.close();
		objectOutputStream.close();

		System.out.println(dato);
		
		socket.close();

		return dato;

	}
	

	
	public static String hora() throws Exception {

		open();
		
		Magic magic = new Magic(11, 1, 1);
		objectOutputStream.writeObject(magic);

		String dato = (String) objectInputStream.readObject();

		objectInputStream.close();
		objectOutputStream.close();

		System.out.println(dato);
		
		socket.close();

		return dato;

	}

	public static String fecha() throws Exception {

		open();
		
		Magic magic = new Magic(12, 1, 1);
		objectOutputStream.writeObject(magic);

		String dato = (String) objectInputStream.readObject();

		objectInputStream.close();
		objectOutputStream.close();

		System.out.println(dato);
		
		socket.close();

		return dato;

	}
	
	
	public static String computerName() throws Exception {

		open();
		
		Magic magic = new Magic(13, 1, 1);
		objectOutputStream.writeObject(magic);

		String dato = (String) objectInputStream.readObject();

		objectInputStream.close();
		objectOutputStream.close();

		System.out.println(dato);
		
		socket.close();

		return dato;

	}
	
	public static String OSname() throws Exception {

		open();
		
		Magic magic = new Magic(14, 1, 1);
		objectOutputStream.writeObject(magic);

		String dato = (String) objectInputStream.readObject();

		objectInputStream.close();
		objectOutputStream.close();

		System.out.println(dato);
		
		socket.close();

		return dato;

	}
	
	public static String user() throws Exception {

		open();
		
		Magic magic = new Magic(15, 1, 1);
		objectOutputStream.writeObject(magic);

		String dato = (String) objectInputStream.readObject();

		objectInputStream.close();
		objectOutputStream.close();

		System.out.println(dato);
		
		socket.close();

		return dato;

	}
	
	public static String javaVersion() throws Exception {

		open();
		
		Magic magic = new Magic(16, 1, 1);
		objectOutputStream.writeObject(magic);

		String dato = (String) objectInputStream.readObject();

		objectInputStream.close();
		objectOutputStream.close();

		System.out.println(dato);
		
		socket.close();

		return dato;

	}
	
	public static String getCPU() throws Exception {

		open();
		
		Magic magic = new Magic(17, 1, 1);
		objectOutputStream.writeObject(magic);

		String dato = (String) objectInputStream.readObject();

		objectInputStream.close();
		objectOutputStream.close();

		System.out.println(dato);
		
		socket.close();

		return dato;

	}
	
	
	public static String ramTotal() throws Exception {

		open();
		
		Magic magic = new Magic(18, 1, 1);
		objectOutputStream.writeObject(magic);

		String dato = (String) objectInputStream.readObject();

		objectInputStream.close();
		objectOutputStream.close();

		System.out.println(dato);
		
		socket.close();

		return dato;

	}
	
	
	public static String getTotalSpace() throws Exception {

		open();
		
		Magic magic = new Magic(19, 1, 1);
		objectOutputStream.writeObject(magic);

		String dato = (String) objectInputStream.readObject();

		objectInputStream.close();
		objectOutputStream.close();

		System.out.println(dato);
		
		socket.close();

		return dato;

	}
	
	
	public static String freeSpace() throws Exception {

		open();
		
		Magic magic = new Magic(20, 1, 1);
		objectOutputStream.writeObject(magic);

		String dato = (String) objectInputStream.readObject();

		objectInputStream.close();
		objectOutputStream.close();

		System.out.println(dato);
		
		socket.close();

		return dato;

	}
	
	
public static String getPDF() throws Exception {
		
		open();

		Magic magic = new Magic(23, 1, 1);
		objectOutputStream.writeObject(magic);

		String dato = (String) objectInputStream.readObject();

		objectInputStream.close();
		objectOutputStream.close();

		//savePDF(dato, "midocumento.pdf");
		
		socket.close();
		
		return dato;
		
		
		

	}

	public static void savePDF(String b64, String path) {

		B64Util.decoder(b64, path);

	}

	public static String getScreenShot() throws Exception {
		
		open();

		Magic magic = new Magic(22, 1, 1);
		objectOutputStream.writeObject(magic);

		String dato = (String) objectInputStream.readObject();

		objectInputStream.close();
		objectOutputStream.close();

		String path = saveShoot(dato, "screenshoot.png");

		socket.close();
		
		return path;
		
	}

	public static String getPhoto() throws Exception {
		
		open();	
		

		Magic magic = new Magic(21, 1, 1);
		objectOutputStream.writeObject(magic);

		String dato = (String) objectInputStream.readObject();

		objectInputStream.close();
		objectOutputStream.close();

		String path = saveShoot(dato, "myPhoto.png");
		
		socket.close();
		
		return path;

	}

	public static String saveShoot(String b64, String path) {
		B64Util.decoder(b64, path);
		return path;
	}
	
	
	
	
	

	
	

	
}
