package teamblc;

import javax.swing.JTable;
import java.util.ArrayList;
import java.io.*;
import java.nio.file.*;
/**
 *
 * @author cmaxey
 */
public class MainLogic {
    
    public ArrayList getFileData(JTable jTabel) throws IOException{
        ArrayList<String> fileList = new ArrayList();
        int rowCount = jTabel.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            fileList.add(i, jTabel.getValueAt(i, 0).toString());
        }
        
        ArrayList<byte[]> fileData = new ArrayList();
        for (int i = 0; i < rowCount; i++) {
            Path path = Paths.get(fileList.get(i));
            byte[] byteArray = Files.readAllBytes(path);
            fileData.add(i, byteArray);
        }
        
        return fileData;
    }
    
}
