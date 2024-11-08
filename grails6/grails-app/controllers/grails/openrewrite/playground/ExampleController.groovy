package grails.openrewrite.playground

class ExampleController {

    ExampleService exampleService

    def index() {
        String message = exampleService.doSomething()

        render(text: "<xml>${message}</xml>", contentType: "text/xml", encoding: "UTF-8")
    }

}