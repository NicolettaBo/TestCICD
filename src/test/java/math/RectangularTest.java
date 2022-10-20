package math;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RectangularTest {
	Rectangular r;
	
	@BeforeClass
	public void setup() {
	r = new Rectangular(2,3);
	}

  @Test
  public void getAreaTest() {
	assertEquals(r.getArea(),6);
    
  }


@Test
  public void getPerimeterTest() {
	assertEquals(r.getPerimeter(),10);
  }
}
