package selmantosun;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Size;
import org.opencv.highgui.Highgui;
import org.opencv.imgproc.Imgproc;

public class filtre {
	public static void main(String[] args) {
		try {
			
			System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
			/*
			Mat kaynakRsm = Highgui.imread("C:/Users/Asus/Documents/se.png");
			Mat yenirsm = new Mat();
			*/
			
			Mat A = Highgui.imread("C:/Users/Asus/Documents/se.png");
			Mat C = A.clone();
			System.out.println("Kanal:"+C.channels());
			
			Imgproc.cvtColor(A, C, Imgproc.COLOR_BGR2GRAY);
			System.out.println("Yükseklik:"+C.height());
			System.out.println("Geniþlik:"+C.width());
			
			System.out.println("Kolon"+C.cols());
			System.out.println("Satýr:"+C.rows());
			
			System.out.println("Kanal:"+C.channels());
			//Mat kernel = Imgproc.getStructuringElement(Imgproc.MORPH_RECT, new Size(150,30));
			
			
				//aþýndýrma
			//Imgproc.erode(kaynakRsm, yenirsm, kernel);
			
				//genisletme
			//Imgproc.dilate(kaynakRsm, yenirsm, kernel);
			
				//etrafýný karartma ,karakalem
			//Imgproc.Canny(kaynakRsm, yenirsm, 300, 600);
				//bulanýk
			//Imgproc.blur(kaynakRsm, yenirsm, new Size(50,50));
			
			//Imgproc.threshold(kaynakRsm, yenirsm, 127, 255, Imgproc.THRESH_BINARY);
			
			//Core.flip(kaynakRsm, yenirsm, 0);
			
			
			Highgui.imwrite("C:/Users/Asus/Documents/rgb.png", C);
			System.out.println("foto kaydedildi.");
			
		}catch (Exception e) {
			System.out.println("hata oldu.");
		}
		

	}
}