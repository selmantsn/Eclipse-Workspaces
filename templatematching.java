package selmantosun;

import javax.naming.spi.DirStateFactory.Result;

import org.opencv.core.Core;
import org.opencv.core.Core.MinMaxLocResult;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.Scalar;
import org.opencv.highgui.Highgui;
import org.opencv.imgproc.Imgproc;

public class templatematching {
	public static void main(String[] args) {
		
			System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

			
			
			Mat source = null;
			Mat template = null;
			
			String filePath = "C:/Users/Asus/Downloads";
			source = Highgui.imread(filePath+"ab17.jpg");
			template = Highgui.imread(filePath+"doruk.jpg");
			
			Mat outputimg = new Mat();
			int macthmethod = Imgproc.TM_CCOEFF_NORMED;
			
			Imgproc.matchTemplate(source, template, outputimg, macthmethod);
			
			MinMaxLocResult mnr = Core.minMaxLoc(outputimg);
			Point matchloc = mnr.maxLoc;
			
			
			
			Core.rectangle(source, matchloc, new Point(matchloc.x + template.cols(),matchloc.y +template.rows()), new Scalar(255,255,255));
			
			Highgui.imwrite(filePath+"sonuc.jpg", source);
			System.out.println("iþlem tamamlandý.");
			
	}
}
	
