/**
 * 
 */
package org.jbpt.pm.bpmn;


/**
 * Class for BPMN Start Event.
 * 
 * @author Cindy Fähnrich
 *
 */
public class StartEvent extends BpmnEvent implements IStartEvent{

	/**
	 * Constructor
	 */
	public StartEvent() {
		super();
		setType(EventType.RECEIVING);
	}

	/**
	 * Constructor setting the name/title of this event.
	 * @param name
	 */
	public StartEvent(String name) {
		super(name);
		setType(EventType.RECEIVING);
	}

}
