/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package org.training.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.training.fulfilmentprocess.constants.MystoreFulfilmentProcessConstants;

public class MystoreFulfilmentProcessManager extends GeneratedMystoreFulfilmentProcessManager
{
	public static final MystoreFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (MystoreFulfilmentProcessManager) em.getExtension(MystoreFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
