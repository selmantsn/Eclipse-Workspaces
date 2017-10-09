package selmantosun;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;

import org.opencv.highgui.Highgui;


public class putveget {
	public static void main(String[] args) {
		
			
			System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		
			Mat array = Highgui.imread("C:/Users/Asus/Documents/se.png",CvType.CV_8UC1);
			Mat newarray = new Mat();
			
			newarray.create(array.rows(), array.cols(),CvType.CV_8UC1);
			
			for (int i=0;i<array.rows();i++) {
				
				for (int j=0;j<array.cols();j++) {
					
					newarray.put(i, j, array.get(i, j));
				}

			}
		
			Highgui.imwrite("C:/Users/Asus/Documents/se2.png", newarray);
		}
}
			