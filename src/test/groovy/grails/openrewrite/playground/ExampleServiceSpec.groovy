package grails.openrewrite.playground

import grails.testing.services.ServiceUnitTest
import spock.lang.Specification

class ExampleServiceSpec extends Specification implements ServiceUnitTest<ExampleService> {

     void "test something"() {
        expect:
        service.doSomething()
     }
}
