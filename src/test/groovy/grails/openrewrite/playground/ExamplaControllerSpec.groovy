package grails.openrewrite.playground

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class ExamplaControllerSpec extends Specification implements ControllerUnitTest<ExampleController> {

     void "test index action"() {
        when:
        controller.index()

        then:
        status == 200

     }
}
