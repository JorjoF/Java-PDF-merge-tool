import org.apache.pdfbox.multipdf.PDFMergerUtility;

import java.io.File;
import java.io.IOException;

class Main{
    public static void main(String[] args) throws IOException {
        File dir = new File("Code Reviews");
        PDFMergerUtility obj = new PDFMergerUtility();
        obj.setDestinationFileName("Code_Review_M.pdf"); 

       for(File f : dir.listFiles()){
        obj.addSource(f);
       }

       obj.mergeDocuments(null);
        
        
    }
}