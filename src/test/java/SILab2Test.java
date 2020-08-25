import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {
   @Test
    public void everyBranchTestPrimeNumber(){
       RuntimeException ex;
       ex = assertThrows(RuntimeException.class, () -> SILab2.checkPrime(-1));
       assertTrue(ex.getMessage().contains("Number should not be negative"));
       assertFalse(()-> SILab2.checkPrime(0));
       assertFalse(()-> SILab2.checkPrime(5));
       assertTrue(()-> SILab2.checkPrime(8));
   }
}
