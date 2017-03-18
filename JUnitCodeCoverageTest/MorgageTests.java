import static org.junit.Assert.*;
import org.junit.Test;


public class MorgageTests {
	
    @Test
    public void Test1() {
            assertEquals((int) (7* 1000), Mortgage.calculateMortgage(25, 1000, Mortgage.Gender.FEMALE));
    }
    
    @Test
    public void Test2() {
            assertEquals((int) (5* 1000), Mortgage.calculateMortgage(39, 1000, Mortgage.Gender.FEMALE));
    }
    
    @Test
    public void Test3() {
            assertEquals((int) (3* 1000), Mortgage.calculateMortgage(48, 1000, Mortgage.Gender.FEMALE));
    }
    
    @Test
    public void Test4() {
            assertEquals(0, Mortgage.calculateMortgage(59, 1000, Mortgage.Gender.FEMALE));
    }
    @Test
    public void Test5() {
            assertEquals(0, Mortgage.calculateMortgage(17, 1000, Mortgage.Gender.FEMALE));
    }
    @Test
    public void Test6() {
            assertEquals((int) (7.5* 1000), Mortgage.calculateMortgage(25, 1000, Mortgage.Gender.MALE));
    }
    
    @Test
    public void Test7() {
            assertEquals((int) (5.5* 1000), Mortgage.calculateMortgage(39, 1000, Mortgage.Gender.MALE));
    }
    
    @Test
    public void Test8() {
            assertEquals((int) (3.5* 1000), Mortgage.calculateMortgage(48, 1000, Mortgage.Gender.MALE));
    }
    
    @Test
    public void Test9() {
            assertEquals(0, Mortgage.calculateMortgage(59, 1000, Mortgage.Gender.MALE));
    }
    @Test
    public void Test10() {
            assertEquals(0, Mortgage.calculateMortgage(17, 1000, Mortgage.Gender.MALE));
    }  
    @Test
    public void Test11() {
            assertEquals(0, Mortgage.calculateMortgage(17, 1000, null));
    }  
    
    
    

  

}
