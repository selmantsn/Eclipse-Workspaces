package selmantosun;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.Scalar;
import org.opencv.highgui.Highgui;
import org.opencv.highgui.VideoCapture;

public class ResimIsleme {
	
	public static void main(String[] args) {
		
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

		
		/*
		
		Mat image = new Mat();
		image = Highgui.imread("C:/Users/Asus/Documents/logo_transparent.png");
		//bu fotorafý hafýzaya aldý.
		
		Core.rectangle(image, new Point(50,100), new Point(100,300), new Scalar(200,200,200));
		//resimin üstüne dikdörtgen tanýmlanan boyutlarda eklendi.
		 
		Highgui.imwrite("C:/Users/Asus/Documents/new.png", image);
		//olusan imageyi konuma kaydetti.
		
		*/
		
	
		
		
		VideoCapture videocapt = new VideoCapture();
		videocapt.open(0); //0 = leptopun webcamý  1 ise 2. dahili usb webcam
		//camerayý açtý.
		Mat kameraFoto = new Mat();
		//yeni bir matris olusturdu.
		
		if (videocapt.isOpened()) {
		//eger kamera açýlýrsa alttaki komutlarý yap.
			
			videocapt.read(kameraFoto);
			//kamera okundu.
			
			Highgui.imwrite("C:/Users/Asus/Documents/se.png", kameraFoto);
			//cekilen fotoyu kaydet.
			
			videocapt.release();
			//kamerayý serbest býrak.
			
			
		}
		System.out.println("foto kaydedildi.");
		
	}

}
