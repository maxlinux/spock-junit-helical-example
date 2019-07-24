import com.achelois.helical.annotations.CaseId
import com.achelois.helical.annotations.RunId
import spock.lang.Specification

@RunId(11)
class MessageServiceSpec extends Specification {

    @CaseId(6)
    def 'Get message'() {
        expect: 'Should return the correct message'
    }

}