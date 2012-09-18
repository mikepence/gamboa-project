package code.webapp.pages

import org.wicketstuff.scala.DSLWicket
import org.apache.wicket.markup.html.WebPage

import code.services.Service
import javax.inject.Inject

class Base extends WebPage with DSLWicket {

  @Inject var service: Service = _

}
