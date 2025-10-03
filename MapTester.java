
import java.util.HashMap;
public class MapTester
{
    // instance variables - replace the example below with your own
    
    private HashMap<String, String> hashMap;

    /**
     * Constructor for objects of class MapTester
     */
    public MapTester()
    {
        hashMap = new HashMap<>();
         
        hashMap.put("Joe", "111-111-1111");
        hashMap.put("Jon", "222-222-2222");
        hashMap.put("Bob", "333-333-3333");
    }
    
    public void enterNumber(String name, String number)
    {
         hashMap.put(name, number);
    }

    
    public String lookupNumber(String name)
    {
        return hashMap.get(name); 
    }
}
