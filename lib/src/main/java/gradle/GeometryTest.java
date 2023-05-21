package gradle;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GeometryTest {
  
  private static final double EPSILON = 0.1;
  
  		@Test
  		public void testAreaRect() {
	       // Test case 1
  			Assert.assertEquals(Geometry.areaRect(5.0, 10.0), 50, EPSILON);
	        // Test case 2
	        Assert.assertEquals(Geometry.areaRect(2.5, 7.0), 17.5, EPSILON);
	        // Test case 3
	        Assert.assertEquals(Geometry.areaRect(3.0, 4.5), 13.5, EPSILON);
	        // Test case 4
	        Assert.assertEquals(Geometry.areaRect(8.0, 12.0), 96.0, EPSILON);
	      }
	      
	      @Test
	      public void testPerimeterRect() {
	        // Test case 1
	        Assert.assertEquals(Geometry.perimeterRect(5.0, 10.0), 30.0, EPSILON);
	        // Test case 2
	        Assert.assertEquals(Geometry.perimeterRect(2.5, 7.0), 19.0, EPSILON);
	        // Test case 3
	        Assert.assertEquals(Geometry.perimeterRect(3.0, 4.5), 15.0, EPSILON);
	        // Test case 4
	        Assert.assertEquals(Geometry.perimeterRect(8.0, 12.0), 40.0, EPSILON);
	      }
	      
	      @Test
	      public void testVolumeSphere() {
	        // Test case 1
	        Assert.assertEquals(Geometry.volumeSphere(2.0), 33.51, EPSILON);
	        // Test case 2
	        Assert.assertEquals(Geometry.volumeSphere(3.5), 179.59, EPSILON);
	        // Test case 3
	        Assert.assertEquals(Geometry.volumeSphere(5.0), 523.60, EPSILON);
	        // Test case 4
	        Assert.assertEquals(Geometry.volumeSphere(7.0), 1436.76, EPSILON);
	      }
	      
	      @Test
	      public void testSurfaceAreaSphere() {
	        // Test case 1
	        Assert.assertEquals(Geometry.surfaceAreaSphere(2.0), 50.27, EPSILON);
	        // Test case 2
	        Assert.assertEquals(Geometry.surfaceAreaSphere(3.5), 153.94, EPSILON);
	        // Test case 3
	        Assert.assertEquals(Geometry.surfaceAreaSphere(5.0), 314.16, EPSILON);
	        // Test case 4
	        Assert.assertEquals(Geometry.surfaceAreaSphere(7.0), 615.75, EPSILON);
	      }
	      
	    }

