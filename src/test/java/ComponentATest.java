import com.achelois.helical.annotations.CaseId;
import com.achelois.helical.annotations.RunId;
import org.junit.Test;

@RunId(23972)
public class ComponentATest {
    @Test @CaseId(22615457)
    public void testMethod1(){
        System.out.println("testing method1");
    }
}
