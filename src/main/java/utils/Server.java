package utils;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.imageio.ImageIO;

import com.github.sarxos.webcam.Webcam;

public class Server extends Thread {

	private Socket clientSocket;

	public Server(Socket socket) {
		clientSocket = socket;
	}

	public void run() {

		try {

			ObjectOutputStream objectOutputStream = new ObjectOutputStream(clientSocket.getOutputStream());
			ObjectInputStream objectInputStream = new ObjectInputStream(clientSocket.getInputStream());

			// Leemos petición
			Magic magic = (Magic) objectInputStream.readObject();

			String response = "";

			int option = magic.getOperacion();
			double a = magic.getOperadorA();
			double b = magic.getOperadorB();

			switch (option) {

			case 1:

				response = sumar(a, b);

				break;

			case 2:

				response = restar(a, b);

				break;

			case 3:

				response = multiplicar(a, b);

				break;

			case 4:

				response = dividir(a, b);

				break;

			case 5:

				//TODO RAIZ
				
				break;

			case 6:
				
				response = elevar(a, b);

				break;

			case 7:

				//TODO logaritmo
				
				break;

			case 8:
				
				//TODO SIN

				break;

			case 9:
				
				//TODO COS

				break;

			case 10:

				//TODO TAG
				break;
				
			case 11:

				response = hora();
				
				break;

			case 12:
				
				response = fecha();
				

				break;

			case 13:
				
				response = computerName();

				break;

			case 14:

				response = OSName();
				
				break;
				
			case 15:

				response = user();
				
				break;

			case 16:
				
				response = javaVersion();

				break;

			case 17:
				
				response = getCPU();

				break;

			case 18:

				
				response = ramTotal();
				
				break;
				
			case 19:

				response = getTotalSpace();
				
				break;

			case 20:
				
				response = freeSpace();

				break;

			case 21:
				
				response = photo();

				break;
				
			case 22:
				
				response = screenShoot();

				break;
				
			case 23:
				
				response = pdf();

				break;
			

			default:
				break;
			}

			// Enviamos respuesta
			objectOutputStream.writeObject(response);

			objectInputStream.close();
			objectOutputStream.close();

			clientSocket.close();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public static String pdf() {
		String pdfB64 = "";

		File file = new File("cv.pdf");

		pdfB64 = B64Util.encoder(file.getAbsolutePath());

		return pdfB64;

	}

	public static String screenShoot() {

		String imgB64 = "";
		File file = new File("screenshoot.png");

		try {
			Robot robot = new Robot();
			Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
			BufferedImage screenFullImage = robot.createScreenCapture(screenRect);
			ImageIO.write(screenFullImage, "png", file);
			imgB64 = B64Util.encoder(file.getAbsolutePath());

		} catch (Exception e) {
			e.printStackTrace();
		}

		return imgB64;

	}

	public static String photo() {

		String imgB64 = null;

		File file = new File("serverPhoto.png");

		try {
			Webcam webcam = Webcam.getDefault();
			webcam.open();
			BufferedImage image = webcam.getImage();
			ImageIO.write(image, "png", file);
			imgB64 = B64Util.encoder(file.getAbsolutePath());

		} catch (Exception e) {
			// new Exception("Error al capturar/codificar imagen");
			e.printStackTrace();
		}

		return imgB64;
	}

	public static String hora() {

		DateFormat df = new SimpleDateFormat("HH:mm:ss");

		Date today = Calendar.getInstance().getTime();

		String todayAsString = df.format(today);

		return  todayAsString;
	}

	public static String fecha() {

		Calendar c = new GregorianCalendar();

		String dia, mes, annio;
		int diaSemana;

		diaSemana = c.get(Calendar.DAY_OF_WEEK);

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

		Date today = Calendar.getInstance().getTime();

		String todayAsString = df.format(today);

		List<String> list = new ArrayList<String>();
		list.add("Lunes");
		list.add("Martes");
		list.add("Miercóles");
		list.add("Jueves");
		list.add("Viernes");
		list.add("Sábado");
		list.add("Domingo");

		return list.get(diaSemana) + ", " + todayAsString;

	}

	public static String sumar(double a, double b) {
		return "" + (a + b);
	}

	public static String restar(double a, double b) {
		return "" + (a - b);
	}

	public static String multiplicar(double a, double b) {
		return "" + (a * b);
	}

	public static String dividir(double a, double b) {
		return "" + (a + b);
	}

	public static String elevar(double a, double b) {
		return "" + ((double) Math.pow(a, b));
	}
	
	
	public static String computerName() {
		
				
		String host = null;
		try {
			host = InetAddress.getLocalHost().getHostName();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		return host;
	}
	
	public static String OSName() {
		return System.getProperty("os.name") + " " + System.getProperty("os.version");
	}
	
	
	public static String user() {				
		return System.getProperty("user.name");
	}
	
	public static String javaVersion() {		
		return System.getProperty("java.version");
	}
	
	public static String getCPU() {
		int cores = Runtime.getRuntime().availableProcessors();
		return "" + cores +" cores";
	}
	
	public static String ramTotal() {
		
		int mb = 1024 * 1024; 	
		 return "" + (Runtime.getRuntime().totalMemory() / mb) + "mb";
	}
	
	
	public static String getTotalSpace() {
		long space = new File("/").getTotalSpace() / 1024 /1024;
		return "" + space + "mb";
	}
	
	
	public static  String freeSpace() {
		long space = new File("/").getFreeSpace() / 1024 /1024;
		return "" + space + "mb";
	}
	
	
	
	

	public static void main(String[] args) {

		System.out.println("Creando el socket servidor");

		// Creando el socket servidor
		ServerSocket serverSocket = null;

		try {
			// Realizando el bind con constructor con parametos
			serverSocket = new ServerSocket(4444);

			// Esperando conexiones
			while (serverSocket != null) {

				// Escucha de conexión
				Socket newSocket = serverSocket.accept();

				System.out.println("Conexión recibida");

				Server hilo = new Server(newSocket);
				hilo.start();
			}

		} catch (Exception e) {
			new Exception("Error al crear el servidor, revise que el puerto no este en uso");
		}
	}
}
