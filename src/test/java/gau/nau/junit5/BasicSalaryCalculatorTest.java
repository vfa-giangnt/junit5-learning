package gau.nau.junit5;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

public class BasicSalaryCalculatorTest {
    
    private BasicSalaryCalculator basicSalaryCalculator;
    
    @BeforeEach
    public void init() {
        basicSalaryCalculator = new BasicSalaryCalculator();
    }
    
    @DisplayName("Test BasicSalaryCalculator with valid salary")
    @Test
    public void testBasicSalaryWithValidSalary() {
        double basicSalary = 4000;
        
        basicSalaryCalculator.setBasicSalary(basicSalary);
        
        double expectedSocialInsurance = basicSalary * 0.25;
        Assertions.assertEquals(expectedSocialInsurance, basicSalaryCalculator.getSocialInsurance());
        
        double expectedAdditionalBonus = basicSalary * 0.1;
        Assertions.assertEquals(expectedAdditionalBonus, basicSalaryCalculator.getAdditionalBonus());
        
        double expectedGross = basicSalary + expectedAdditionalBonus + expectedSocialInsurance;
        Assertions.assertEquals(expectedGross, basicSalaryCalculator.getGrossSalary());
    }
    
    @DisplayName("Test BasicSalaryCalculator with invalid salary")
    @Test
    public void testBasicSalaryWithInvalidSalary() {
        double basicSalary = -100;
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            basicSalaryCalculator.setBasicSalary(basicSalary);
        });
    }
    
    @AfterEach
    public void tearDown() {
        basicSalaryCalculator = null;
    }
}
