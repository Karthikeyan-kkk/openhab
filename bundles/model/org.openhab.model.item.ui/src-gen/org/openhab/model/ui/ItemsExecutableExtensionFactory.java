/*
 * generated by Xtext
 */
package org.openhab.model.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ItemsExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return org.openhab.model.ui.internal.ItemsActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return org.openhab.model.ui.internal.ItemsActivator.getInstance().getInjector("org.openhab.model.Items");
	}
	
}