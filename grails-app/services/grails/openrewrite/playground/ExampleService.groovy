package grails.openrewrite.playground

import groovy.transform.CompileStatic
import groovy.util.slurpersupport.GPathResult

@CompileStatic
class ExampleService {

    String doSomething() {
        XmlSlurper slurper = new XmlSlurper()
        GPathResult path = slurper.parseText('<data><message>Hello world!</message></data>')

        return path.getProperty('message')
    }

}