package Com.Gumtree;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
    Driverfactory driverfactory=new Driverfactory();

    @Before
    public void setup(){
        driverfactory.openbrowser();
    }

    @After
    public void teardown(){

        driverfactory.closebrowser();
    }
}
