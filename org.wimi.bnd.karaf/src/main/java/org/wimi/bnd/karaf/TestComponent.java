package org.wimi.bnd.karaf;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

@Component(immediate = true)
public class TestComponent {

	@Activate
	public void activate() {
		System.out.println("--activate-");
	}

	@Deactivate
	public void deactivate() {
		System.out.println("----deactivate-");
	}
	
}
