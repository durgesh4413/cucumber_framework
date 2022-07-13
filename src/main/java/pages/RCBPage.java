package pages;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import frameworkUtility.*;

public class RCBPage {

	Utils utils;
	JSONObject data = null;
	public RCBPage() {
		utils=new Utils();
	}
	
	
	/**
	 * This method is use to get Json data into JsonObject
	 * @param path
	 *      File path
	 * @throws ParseException
	 */
	public void fetchRCBData(String path) throws ParseException {
		data=utils.fetchJSONData(path);
	}
	
	
	/**
	 * This method is use to fetch count of foreign players
	 * @return
	 * 		It returns count of foreign players
	 */
	public int getCountOfForeignPlayers() {
		int count=0;
		
		JSONArray jsonArray = (JSONArray) data.get("player");
		for(int i=0;i<jsonArray.size();i++) {
			JSONObject player =(JSONObject)jsonArray.get(i);
			if(!player.get("country").equals("India")) {
				count++;
			}
		}
		return count;
	}
	
	/**
	 * This method is use to fetch count of wicket keeper
	 * @return
	 * 		It returns count of wicket keeper
	 */
	public int getCountOfWicketKeeper() {
		int count=0;
		
		JSONArray jsonArray = (JSONArray) data.get("player");
		for(int i=0;i<jsonArray.size();i++) {
			JSONObject player =(JSONObject)jsonArray.get(i);
			if(player.get("role").equals("Wicket-keeper")) {
				count++;
			}
		}
		return count;
	}
	
	
	
	
	
}
