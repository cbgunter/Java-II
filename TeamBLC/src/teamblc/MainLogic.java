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
        
        ArrayList<String> fileDataList = new ArrayList();
        for (int i = 0; i < rowCount; i++) {
            Path path = Paths.get(fileList.get(i));
            byte[] bytes = Files.readAllBytes(path);
            String fileData = new String(bytes, "UTF-8");  
            
            fileDataList.add(i, fileData);
        }
        //returns an arraylist of strings,
        //each element in the subarraylist is the document in a 
        //multiline string.
        
        //fileDataList structure
        //arraylist - fileDataList
        //|_subList - fileData
        //  |_String Data
        
        return fileDataList;
    }
    
    public List searchFileData(ArrayList fileDataList, String searchType, ArrayList searchTerms ) {
        int cnt = fileDataList.size();
        int searchTermsCnt = searchTerms.size();
        List<String> searchResult = new ArrayList<>();
        
        for (int i = 0; i < cnt; i++) {
            String fileData = (String)fileDataList.get(i);
            List<String> wordList = new ArrayList<>(Arrays.asList(fileData.split(" ")));
            int wordListCnt = wordList.size();
            
            switch (searchType) {
                case "Any":    
                    for (int ia = 0; ia < wordListCnt; ia++) {
                        for (int ib = 0; ib < searchTermsCnt; ib++) {
                            int lastMatch = 0;
                            if(wordList.get(ia).equalsIgnoreCase(searchTerms.get(ib).toString())){
                                lastMatch = ia;
                                if (ia+5 > lastMatch){
                                    Object[] blah = wordList.subList(ia, ia+5).toArray();
                                    String stringWL = Arrays.toString(blah);
                                    searchResult.add(stringWL);
                                }
                                //gets the matched word plus the next 5
                                
                                
                            }
                        }
                    }
                case "All":
                    //do something
                case "Exact":
                    //do something
            }
        }
        
        return searchResult;
    }
    
}
    

