package com.qualitics.demodzi;

import com.qualitics.demodzi.services.DziService;
import gov.nist.isg.archiver.DirectoryArchiver;
import gov.nist.isg.archiver.FilesArchiver;
import gov.nist.isg.pyramidio.BufferedImageReader;
import gov.nist.isg.pyramidio.DeepZoomImageReader;
import gov.nist.isg.pyramidio.PartialImageReader;
import gov.nist.isg.pyramidio.ScalablePyramidBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

@SpringBootApplication
public class DemodziApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(DemodziApplication.class, args);
//		File outputFolder = new File("/home/ababacar/Bureau/demodzi/src/main/resources/image_dzi");
//		File f = new File("/home/ababacar/Bureau/demodzi/src/main/resources/images/default.png");
//		File f1 = new File("/home/ababacar/Bureau/demodzi/src/main/resources/images/php_code.PNG");
//		File f2 = new File("/home/ababacar/Bureau/demodzi/src/main/resources/images/spring11.png");
//		File f3 = new File("/home/ababacar/Bureau/demodzi/src/main/resources/images/symfony.png");
		File f4 = new File("/home/ababacar/Bureau/demodzi/src/main/resources/images/DJI_0744.JPG");
		File f5 = new File("/home/ababacar/Bureau/demodzi/src/main/resources/images/DJI_0746.JPG");
		DziService dzi = new DziService();
//		dzi.createFileDzi(f);
//		dzi.createFileDzi(f1);
//		dzi.createFileDzi(f2);
//		dzi.createFileDzi(f3);
		dzi.createFileDzi(f4);
		dzi.createFileDzi(f5);

		/*System.out.println("DEBUT EXECUTION FILE");
		ScalablePyramidBuilder spb = new ScalablePyramidBuilder();
		FilesArchiver archiver = new DirectoryArchiver(outputFolder);
		PartialImageReader pir = new BufferedImageReader(f);
		String fileName = f.getName().substring(0,f.getName().lastIndexOf("."));
		System.out.println("Name Fichier : "+fileName);
		spb.buildPyramid(pir, fileName, archiver, 1);
		System.out.println("FIN EXECUTION FILE");*/
//		System.out.println("---------------");
//		read_dzi("/home/ababacar/Bureau/demodzi/src/main/resources/image_dzi/default.dzi");
//		System.out.println("-----------------");


	}

	public static void read_dzi(String pathname_dzi) throws IOException {
		File dziFile = new File(pathname_dzi);
		DeepZoomImageReader reader = new DeepZoomImageReader(dziFile);
		BufferedImage wholeImageZoom0_01 = reader.getWholeImage(0.01);
		BufferedImage regionAtZoom0_1 = reader.getSubImage(
				new Rectangle(15, 15, 200, 200), 0.1);
	}

}
