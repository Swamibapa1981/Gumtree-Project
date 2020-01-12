package Com.Gumtree.stepsdefination;

import Com.Gumtree.pages.Pagecars;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertTrue;

public class Stepdepth {
    Pagecars page=new Pagecars();

    @Given("^User is on Google page\\.$")
    public void user_is_on_Google_page() throws Throwable {

      String actual=page.currentURL();
      assertTrue(actual.endsWith("google.com/"));
    }

    @When("^User search for Cars in London,then click on search bar\\.$")
    public void user_search_for_Cars_in_London_then_click_on_search_bar() throws Throwable {

     page.carsinLondon("Cars in London\n");

    }

    @When("^User make sure print out all search results links\\.$")
    public void user_make_sure_print_out_all_search_results_links() throws Throwable {

     page.printsearchlinks();

    }

    @When("^User validate how many Gumtree links are,then Navigate each of them,and confirm the Title is displayed and Make sure the Gumtree links results are greater then \"([^\"]*)\"$")
    public void user_validate_how_many_Gumtree_links_are_then_Navigate_each_of_them_and_confirm_the_Title_is_displayed_and_Make_sure_the_Gumtree_number_of_links_results_are_greater_then(String arg1) throws Throwable {

     page.gumTreeLinks();
    }

    @Then("^User can see respective result\\.$")
    public void user_can_see_respective_result() throws Throwable {

    }

}
