package com.qualitics.demodzi.services;

import gov.nist.isg.archiver.DirectoryArchiver;
import gov.nist.isg.archiver.FilesArchiver;
import gov.nist.isg.pyramidio.BufferedImageReader;
import gov.nist.isg.pyramidio.PartialImageReader;
import gov.nist.isg.pyramidio.ScalablePyramidBuilder;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DziService {

    public DziService(){

    }

    public Map<String,String> createFileDzi(File fImage) throws IOException {
        Map<String,String> map = new HashMap<>();
        File outputFolder = new File("/home/ababacar/Bureau/demodzi/src/main/resources/image_dzi");
//        File f = new File("/home/ababacar/Bureau/demodzi/src/main/resources/images/default.png");
        ScalablePyramidBuilder spb = new ScalablePyramidBuilder(254, 1, "jpg", "dzi");
        FilesArchiver archiver = new DirectoryArchiver(outputFolder);
        PartialImageReader pir = new BufferedImageReader(fImage);
        String fileName = fImage.getName().substring(0,fImage.getName().lastIndexOf("."));
        System.out.println("Name Fichier : "+fileName);
        spb.buildPyramid(pir, fileName, archiver, 1);
        map.put("Url_Image", "/home/ababacar/Bureau/demodzi/src/main/resources/image_dzi/"+fileName+"_files");
        return map;
    }

}
