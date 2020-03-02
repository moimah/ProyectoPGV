package controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import utils.B64Util;
import utils.Cliente;
import utils.Magic;

public class ClienteController implements Initializable {

	@FXML
	private VBox root;

	@FXML
	private TextField txtSumA;

	@FXML
	private TextField txtSumB;

	@FXML
	private TextField txtSumResult;

	@FXML
	private TextField txtRestA;

	@FXML
	private TextField tztRestB;

	@FXML
	private TextField txrRestResult;

	@FXML
	private TextField txtMultA;

	@FXML
	private TextField txtMultB;

	@FXML
	private TextField txtMultResult;

	@FXML
	private TextField txtDivA;

	@FXML
	private TextField txtDivB;

	@FXML
	private TextField txtDivResult;

	@FXML
	private TextField txtRaizA;

	@FXML
	private TextField txtRaizB;

	@FXML
	private TextField txtRaizResult;

	@FXML
	private TextField txtPotA;

	@FXML
	private TextField txtPotB;

	@FXML
	private TextField txtPotResult;

	@FXML
	private TextField txtLogA;

	@FXML
	private TextField txtLogB;

	@FXML
	private TextField txtLogResult;

	@FXML
	private TextField txtSINA;

	@FXML
	private TextField txtSINResult;

	@FXML
	private TextField txtCOSA;

	@FXML
	private TextField txtCOSResult;

	@FXML
	private TextField txtTAGA;

	@FXML
	private TextField txtTAGResult;

	@FXML
	private Button btnCalcMult;

	@FXML
	private Button btnCalcResta;

	@FXML
	private Button btnCalcSuma;

	@FXML
	private Button btnCalcDiv;

	@FXML
	private Button btnCalcRaiz;

	@FXML
	private Button btnCalcPot;

	@FXML
	private Button btnCalcLog;

	@FXML
	private Button btnCalcSIN;

	@FXML
	private Button bcnCalcCOS;

	@FXML
	private Button btnCalcTAG;

	@FXML
	private Button btnEquipo;

	@FXML
	private Button btnFecha;

	@FXML
	private Button btnHora;

	@FXML
	private Button btnSO;

	@FXML
	private Button btnUser;

	@FXML
	private Button btnJava;

	@FXML
	private Button btnProc;

	@FXML
	private Button btnRamTotal;

	@FXML
	private Button btnDiscoTotal;

	@FXML
	private TextField txtHora;

	@FXML
	private TextField txtFecha;

	@FXML
	private TextField txtEquipo;

	@FXML
	private TextField txtSO;

	@FXML
	private TextField txtUsuario;

	@FXML
	private TextField txtJava;

	@FXML
	private TextField txtProcesador;

	@FXML
	private TextField txtRam;

	@FXML
	private TextField txtDiscoTotal;

	@FXML
	private TextField txtDiscoLibre;

	@FXML
	private Button btnDiscoLibre;
	
	@FXML
	private Button btnFoto;
	
	@FXML
	private Button btnCaptura;
	
	@FXML
	private Button btnPDF;
	
	@FXML
	private Button btnPlay;
	
	@FXML
	private Button btnStop;
	
	@FXML
	private ImageView image;
	
	 @FXML
	 private AnchorPane anchorAvanzado;
	

	private Cliente cliente;
	
	//Task	
	private Task<Void> tarea;
	private File file;
	private boolean exit = false; 

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		btnCalcSuma.setOnAction(e -> onClickButtonAction(1));
		btnCalcResta.setOnAction(e -> onClickButtonAction(2));
		btnCalcMult.setOnAction(e -> onClickButtonAction(3));
		btnCalcDiv.setOnAction(e -> onClickButtonAction(4));
		btnCalcRaiz.setOnAction(e -> onClickButtonAction(5));
		btnCalcPot.setOnAction(e -> onClickButtonAction(6));
		btnCalcLog.setOnAction(e -> onClickButtonAction(7));
		btnCalcSIN.setOnAction(e -> onClickButtonAction(8));
		bcnCalcCOS.setOnAction(e -> onClickButtonAction(9));
		btnCalcTAG.setOnAction(e -> onClickButtonAction(10));
		
		btnHora.setOnAction(e -> onClickButtonAction(11));
		btnFecha.setOnAction(e -> onClickButtonAction(12));
		btnEquipo.setOnAction(e -> onClickButtonAction(13));
		btnSO.setOnAction(e -> onClickButtonAction(14));
		btnUser.setOnAction(e -> onClickButtonAction(15));
		btnJava.setOnAction(e -> onClickButtonAction(16));
		btnProc.setOnAction(e -> onClickButtonAction(17));
		btnRamTotal.setOnAction(e -> onClickButtonAction(18));
		btnDiscoTotal.setOnAction(e -> onClickButtonAction(19));
		btnDiscoLibre.setOnAction(e -> onClickButtonAction(20));
		btnFoto.setOnAction(e -> onClickButtonAction(21));
		btnCaptura.setOnAction(e -> onClickButtonAction(22));
		btnPDF.setOnAction(e -> onClickButtonAction(23));	
		btnPlay.setOnAction(e -> onClickButtonAction(24));			
		btnStop.setOnAction(e -> onClickButtonAction(25));	
		

	}

	private void onClickButtonAction(int i) {

		switch (i) {

		case 1:

			try {

				Double a = Double.parseDouble(txtSumA.getText());
				Double b = Double.parseDouble(txtSumB.getText());

				txtSumResult.setText(Cliente.sumar(a, b));

			} catch (Exception e) {

			}

			break;
		case 2:

			try {

				Double a = Double.parseDouble(txtRestA.getText());
				Double b = Double.parseDouble(tztRestB.getText());

				txrRestResult.setText(Cliente.restar(a, b));

			} catch (Exception e) {

			}

			break;
		case 3:

			try {

				Double a = Double.parseDouble(txtMultA.getText());
				Double b = Double.parseDouble(txtMultB.getText());

				txtMultResult.setText(Cliente.multiplicar(a, b));

			} catch (Exception e) {

			}

			break;
		case 4:

			try {

				Double a = Double.parseDouble(txtDivA.getText());
				Double b = Double.parseDouble(txtDivB.getText());

				txtDivResult.setText(Cliente.dividir(a, b));

			} catch (Exception e) {

			}

			break;

		case 5:

			try {

				Double a = Double.parseDouble(txtRaizA.getText());
				Double b = Double.parseDouble(txtRaizB.getText());

				txtRaizResult.setText(Cliente.raiz(a, b));

			} catch (Exception e) {

			}

			break;

		case 6:

			try {

				Double a = Double.parseDouble(txtPotA.getText());
				Double b = Double.parseDouble(txtPotB.getText());

				txtPotResult.setText(Cliente.potencia(a, b));

			} catch (Exception e) {

			}

			break;

		case 7:

			try {

				Double a = Double.parseDouble(txtLogA.getText());
				Double b = Double.parseDouble(txtLogB.getText());

				txtLogResult.setText(Cliente.logaritmo(a, b));

			} catch (Exception e) {

			}

			
			break;

		case 8:

			System.out.println("PULSANDO");
			
			try {

				Double a = Double.parseDouble(txtSINA.getText());
				
				txtSINResult.setText(Cliente.SIN(a));

			} catch (Exception e) {

			}
			
			break;
						
		case 9:
			
			try {

				Double a = Double.parseDouble(txtCOSA.getText());
				
				txtCOSResult.setText(Cliente.COS(a));

			} catch (Exception e) {

			}
			

			break;
			
		case 10:
			
			try {

				Double a = Double.parseDouble(txtTAGA.getText());
				
				txtTAGResult.setText(Cliente.TAG(a));

			} catch (Exception e) {

			}

			break;
			
		case 11:
			
			try {
				txtHora.setText(Cliente.hora());
				
			} catch (Exception e) {
				
			}

			break;
			
		case 12:
			
			try {
				txtFecha.setText(Cliente.fecha());				
			} catch (Exception e) {
				
			}

			break;
		case 13:
			
			try {
				txtEquipo.setText(Cliente.computerName());				
			} catch (Exception e) {
				
			}

			break;
		case 14:

			try {				
				txtSO.setText(Cliente.OSname());				
			} catch (Exception e) {
				
			}
			
			break;
		case 15:	
			
			try {
				txtUsuario.setText(Cliente.user());				
			} catch (Exception e) {
				
			}

			break;
			
		case 16:
			
			try {
				txtJava.setText(Cliente.javaVersion());				
			} catch (Exception e) {
				
			}

			break;
			
		case 17:
			
			try {
				txtProcesador.setText(Cliente.getCPU());				
			} catch (Exception e) {
				
			}

			break;
			
		case 18:
			
			try {
				txtRam.setText(Cliente.ramTotal());				
			} catch (Exception e) {
				
			}

			break;
			
		case 19:
			
			try {
				txtDiscoTotal.setText(Cliente.getTotalSpace());				
			} catch (Exception e) {
				
			}

			break;
			
		case 20:
			
			try {
				txtDiscoLibre.setText(Cliente.freeSpace());				
			} catch (Exception e) {
				
			}
			
			break;
			
			case 21:
			
			try {
				
				String path = Cliente.getPhoto();
				File file = new File(path);				
			    Image img = new Image(file.toURI().toString());			    
			    image.setImage(img);
			    image.fitWidthProperty().bind(anchorAvanzado.widthProperty());
			    image.fitHeightProperty().bind(anchorAvanzado.heightProperty());
			  
			    image.setPreserveRatio(true);
			} catch (Exception e) {
				
			}
			
			break;
			
		case 22:
			
			try {
				
				String path = Cliente.getScreenShot();
				File file = new File(path);				
			    Image img = new Image(file.toURI().toString());			    
			    image.setImage(img);
			    image.fitWidthProperty().bind(anchorAvanzado.widthProperty());
			    image.fitHeightProperty().bind(anchorAvanzado.heightProperty());
			  
			    image.setPreserveRatio(true);
			} catch (Exception e) {
				
			}
			
			break;
			
		case 23:
			try {
				
				String b64 = Cliente.getPhoto();
								
				
				if(b64 != null) {
            		
            		File file = null; 
            		
            		
            		FileChooser fileChooser = new FileChooser();
            		fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("PDF files", "*.pdf"));
            		fileChooser.setInitialFileName("miCV.pdf");

            		file = fileChooser.showSaveDialog(null);

            		if (file != null) {		
            			
            			if(!file.getName().contains(".pdf")) { //Nos aseguramos que contenga extension
            				  file = new File(file.getAbsolutePath() + ".pdf"); //Se le asigna extension xml
            			}

            				try {                					
            					B64Util.decoder(b64, file.getAbsolutePath());
            				} catch (Exception e) {
            					e.printStackTrace();
            				}
            			
            		}
            		           		
				}
				
				
			}catch (Exception e) {
				
			}
			
			break;
			
		case 24:
			
			try {
				
				System.out.println("En el 24");
				
				exit = false;				
				startTask();
				
						

			} catch (Exception e) {
				
			}
			
		break;
		
		case 25:
			
			try {
				
				System.out.println("En el 25");
				exit = true;				

			} catch (Exception e) {
				
			}
			
		break;
		
		
		default:
			break;
		}
		
		
		

	}

	public ClienteController() throws IOException {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/ClienteView.fxml"));
		loader.setController(this);
		loader.load();

		try {
			cliente = new Cliente();
		} catch (Exception e) {		
			e.printStackTrace();
		}

	}
	
	
	
	

	
	/**
	 * Metodo que ejecuta una tarea. 
	 * @return
	 */	
	@SuppressWarnings("unchecked")
	public Task<Void> executeTask() {
		 
	        Task task =  new Task() {
	            @Override
	            protected Object call() throws Exception {
	       						
						String path = Cliente.getPhoto();
						file = new File(path);						
										
						Thread.sleep(300);
										
					
					
				return true;
			}
		};
		
		task.setOnSucceeded(e -> { 		
			
			
			Image img = new Image(file.toURI().toString());
			image.setImage(img);
			image.fitWidthProperty().bind(anchorAvanzado.widthProperty());
			image.fitHeightProperty().bind(anchorAvanzado.heightProperty());
			image.setPreserveRatio(true);
			
				
	
		if(!exit)
		startTask();
		
			
		
			

		});
		
		task.setOnFailed(e -> {
			//TODO mensaje de error
		});
	       
	        
	        return task; 
	    }
	
	
	public void startTask() {
		 
		   tarea = executeTask();
		    new Thread(tarea).start();        
		   
	}
	
	
	

	public VBox getRoot() {
		return root;
	}

}
