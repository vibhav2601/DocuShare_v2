import java.io.File;
import java.util.Scanner; 
import java.io.FileOutputStream;
import java.nio.file.Paths;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

public class GenerateQRCode {
 
    public static void main(String[] args) throws Exception {
    	
    	Scanner sc = new Scanner(System.in);
    	String qrName = sc.nextLine();
    	qrName += ".jpg";
         
        String content = "https://simplifyingtech371899608.wordpress.com/";
        String pathToStore = "D:\\" + qrName;
         
        BitMatrix bitMatrix = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, 500, 500);
        MatrixToImageWriter.writeToPath(bitMatrix, "jpg", Paths.get(pathToStore));
        //MatrixToImageWriter.writeToStream(bitMatrix, "jpg", new FileOutputStream(new File("qrcode_97802017507991.jpg"))); 
        
        System.out.println("QR Code Generated Successfully");
 
    }
 
}