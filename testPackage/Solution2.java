package testPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Solution2 {

    public static void main(String args[]) throws FileNotFoundException {

        Scanner myScanner = new Scanner(new File("C:/Users/Krish/Desktop/test.txt"));

        Map<String,Integer> map = new LinkedHashMap<>();

        while(myScanner.hasNext()) {

            String in = myScanner.nextLine();
            String key = "";
            Integer value=0;
            
            if (in.length() >0){
            	
           String[] inArray = in.split(",");
           
                     
            if(inArray != null || inArray.length !=0){
            	
            	
           if(inArray[0] != null)
        	  key = inArray[0];
            
            
          /*  if(inArray[1] != null) 
             value =0;
            
            else */
           
           if(inArray[1].matches("-?\\d+(\\.\\d+)?"))
           
            value= Integer.parseInt(inArray[1]);

            Set<String> keys= map.keySet();

            if(keys.contains(key))
            {
            value+= map.get(key);
            map.put(key,value);
            }

            else            
                map.put(key,value);
            }
            }
        }		
            

        for(Map.Entry<String, Integer> mapEntry: map.entrySet()){
          
           System.out.println(mapEntry.getKey()+","+mapEntry.getValue());
         }  
        

}
}