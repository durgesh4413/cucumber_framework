package StepDefinations;

import pages.Pages;

import static org.junit.Assert.assertEquals;

import org.json.simple.parser.ParseException;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RCB {

	Pages pages;

	public RCB(){
		pages = new Pages();
	}
	
	@When("^fetch data from JSON file$")
	public synchronized void fetch_data_from_JSON_file() throws ParseException {
			pages.rcbPage().fetchRCBData("src/test/resources/TeamRCB.json");	
	}
	
	@Then("^Verify that RCB team has four foreign team players$")
	public synchronized void Verify_that_RCB_team_has_four_foreign_team_players() throws ParseException {
		assertEquals(4,pages.rcbPage().getCountOfForeignPlayers());	
	}
	
	@Then("^Verify that RCB team has atleast one wicket keeper$")
	public synchronized void Verify_that_RCB_team_has_atleast_one_wicket_keeper() throws ParseException {
		assertEquals(1,pages.rcbPage().getCountOfWicketKeeper());	
	}
}
