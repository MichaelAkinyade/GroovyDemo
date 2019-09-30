package com.test.groovy
import groovy.lang.*

import groovy.util.*

class GroovyTest {

	static void main(args) {

		
		def thirdP ="C:\\Users\\michael.akinyade\\OneDrive - GlobalCapital Malta\\michael.akinyade\\Desktop\\THIRD_PARTIES_ACTIVE_ADDRESS-24302-2019-03-17.xml"
		
		def entries = new XmlParser().parse(thirdP)
		
		entries.ThirdParty.each{ tp ->
		//println "${tp.ExternalId}"
			nodes = tp.Addressee
			if (nodes.size() > 1) {
					println "${tp.ExternalId}"
			}
		}
		
	}
	
	
}
