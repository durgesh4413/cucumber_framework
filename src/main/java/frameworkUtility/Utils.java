package frameworkUtility;

import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Utils {

	
	/**
	 * This method is use to parse data into JSON object from JSON file
	 * @param path
	 * @return
	 * @throws ParseException
	 */
	public JSONObject fetchJSONData(String path) throws ParseException {
			JSONObject data = null;
			try {
		        JSONParser parser = new JSONParser();
		        //Use JSONObject for simple JSON and JSONArray for array of JSON.
		         data = (JSONObject) parser.parse(
		              new FileReader(path));//path to the JSON file.
		        
		    } catch (IOException | ParseException e) {
		        e.printStackTrace();
		    }
			return data;
		}	
	
	
	
}
