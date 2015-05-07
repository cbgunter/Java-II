package teamblc;

import javax.swing.JTable;
import java.util.*;
import java.io.*;
import java.nio.file.*;
/**
 *
 * @author Chris Maxey
 * @author Jamie Banas
 * @author Corey Gunter
 */
public class MainLogic {
    
    public ArrayList getFileData(JTable jTabel) throws IOException{
        ArrayList<String> fileList = new ArrayList();
        int rowCount = jTabel.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            fileList.add(i, jTabel.getValueAt(i, 0).toString());
        }
        
        ArrayList<List> fileDataList = new ArrayList();
        for (int i = 0; i < rowCount; i++) {
            Path path = Paths.get(fileList.get(i));
            List<String> fileData = Files.readAllLines(path);
            //ArrayList<String> fileData = new String(bytes, "UTF-8");  
            
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
            List<String> fileData = (List<String>)fileDataList.get(i);
            int fileDataCnt = fileData.size();
            switch (searchType) {
                case "Any":     
                    for (int ia = 0; ia < fileDataCnt; ia++) {
                        for (int ib = 0; ib < searchTermsCnt; ib++) {
                            String[] line = fileData.get(ia).split(" ");
                            for (String line1 : line) {
                                if (line1.toLowerCase().equals(searchTerms.get(ib).toString().toLowerCase())) {
                                    String stringWL = "The search term " + searchTerms.get(ib).toString() + " found in file #" + i + " On line #" + ia + "\n" ;
                                    searchResult.add(stringWL);
                                }
                            }
                        }
                    }
                case "All":
                    for (int ia = 0; ia < fileDataCnt; ia++) {
                        String[] line = fileData.get(ia).toLowerCase().split(" ");
                        List<String> linelist = Arrays.asList(line);
                        ArrayList<String> searchTerms2 = searchTerms;
                        for(int ib=0; ib < searchTerms2.size(); ib++) {
                            searchTerms2.set(ib, searchTerms2.get(ib).toLowerCase());
                        }
                        
                        if (linelist.containsAll(searchTerms)){
                            String stringWL = "The search terms were found in file #" + i + " On line #" + ia + "\n" ;
                            searchResult.add(stringWL);
                        }
                    }
                case "Exact":
                    for (int ia = 0; ia < fileDataCnt; ia++) {
                        String[] line = fileData.get(ia).split(" ");
                        List<String> linelist = Arrays.asList(line);
                        if (linelist.containsAll(searchTerms)){
                            String stringWL = "The search terms were found in file #" + i + " On line #" + ia + "\n" ;
                            searchResult.add(stringWL);
                        }
                    }
            }
        }
        
        return searchResult;
    }
    
}
    

