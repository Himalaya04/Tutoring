package JavaSchool;

import java.util.Map;
import java.util.Set;

public class MarkSheet {
    private Map<String,Double> marksheet;

    public MarkSheet(Map<String, Double> marksheet) {
        this.marksheet = marksheet;
    }
    public double getGPa(){
        Set<String> keyset = marksheet.keySet();
        double total=0;
        for(String key:keyset){
            total+= marksheet.get(key);
        }
        double gpa= total/marksheet.size();
        return gpa;

    }

}
