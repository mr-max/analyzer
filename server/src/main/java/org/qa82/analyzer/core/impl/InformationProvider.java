/*******************************************************************************
* Copyright (c) 2014 Michael Gebhart (michael.gebhart@qa82.org).
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
* Michael Gebhart - initial idea and concept
* 
*******************************************************************************/

package org.qa82.analyzer.core.impl;

public abstract class InformationProvider {
	protected Analyzer analyzer;
	
	public InformationProvider(Analyzer analyzer) {
		this.analyzer = analyzer;
	}
	
	public abstract Boolean supports(InformationNeed informationNeed, Parameters parameters);
	
	public abstract Object resolve(InformationNeed informationNeed, Parameters parameters);
}