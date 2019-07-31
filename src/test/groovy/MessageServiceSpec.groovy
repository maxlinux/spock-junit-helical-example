import com.achelois.helical.annotations.CaseId
import spock.lang.Specification

class MessageServiceSpec extends Specification {

    @CaseId(22615457)
    def "Get message"() {

        throw new Exception("opps")

        expect: true
    }

}