package teamblc;

import javax.swing.JTable;
import java.util.*;
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
        
        ArrayList<List> fileData = new ArrayList();
        for (int i = 0; i < rowCount; i++) {
            Path path = Paths.get(fileList.get(i));
            List<String> list = Files.readAllLines(path);
            fileData.add(i, list);
        }
        
        return fileData;
    }
    
    public void searchFileData(ArrayList fileData, String searchType, String searchTerms ) {
        int cnt = fileData.size();
        for (int i = 0; i < cnt; i++) {
            List<String> list = (List)fileData.get(i);
            int cnt2 = list.size();
            switch (searchType) {
                case "Any":    
                    for (int ia = 0; ia < cnt2; ia++) {
                    
                    }
                case "All":
                    //do something
                case "Exact":
                    //do something
            }
        }
    }
    
}
    

