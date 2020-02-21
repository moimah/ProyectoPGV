package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;


public class B64Util {
	

	public static String encoder(String filePath) {

		String base64File = "";
		File file = new File(filePath);

		try (FileInputStream pdfInFile = new FileInputStream(file)) {
			
			byte encoder[] = new byte[(int) file.length()];
			pdfInFile.read(encoder);
			base64File = Base64.getEncoder().encodeToString(encoder);

		} catch (Exception e) {
			System.out.println("File not found" + e);

		} 

		return base64File;
	}
	
	
	

	public static void decoder(String pdfBase64, String path) {

		File file = new File(path);
		
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}

		try (FileOutputStream fos = new FileOutputStream(file);) {

			byte[] decoder = Base64.getDecoder().decode(pdfBase64);
			fos.write(decoder);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

}
