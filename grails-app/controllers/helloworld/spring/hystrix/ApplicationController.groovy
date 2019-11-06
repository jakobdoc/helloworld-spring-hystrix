package helloworld.spring.hystrix

import grails.core.GrailsApplication
import grails.plugins.*

class ApplicationController implements PluginManagerAware {

    GrailsApplication grailsApplication
    GrailsPluginManager pluginManager

    def index() {
    	log.info "Hello hytrix"
        [grailsApplication: grailsApplication, pluginManager: pluginManager]
    }
}
