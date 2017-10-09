package selmantosun;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.highgui.Highgui;
import org.opencv.highgui.VideoCapture;

public class ipcam {
	public static void main(String[] args) {
		
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		
		VideoCapture videocapt = new VideoCapture();
		
		videocapt.set(Highgui.CV_CAP_PROP_FRAME_WIDTH, 600);
		videocapt.set(Highgui.CV_CAP_PROP_FRAME_HEIGHT, 360);
		
		videocapt.open("C:/Users/Asus/Documents/23nisan.mp4");
		
		Mat kameraFoto = new Mat();
		
		if (videocapt.isOpened()) {
		
			System.out.println("Kamera baðlntsý yapýld.");
			videocapt.read(kameraFoto);
			Highgui.imwrite("C:/Users/Asus/Documents/ipcam.png", kameraFoto);
			
			videocapt.release();
			
		
		}
		System.out.println("foto kaydedildi.");

	}
}