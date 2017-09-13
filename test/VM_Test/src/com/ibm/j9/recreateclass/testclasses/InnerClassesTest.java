/*******************************************************************************
 * Copyright (c) 2001, 2012 IBM Corp. and others
 *
 * This program and the accompanying materials are made available under
 * the terms of the Eclipse Public License 2.0 which accompanies this
 * distribution and is available at https://www.eclipse.org/legal/epl-2.0/
 * or the Apache License, Version 2.0 which accompanies this distribution and
 * is available at https://www.apache.org/licenses/LICENSE-2.0.
 *
 * This Source Code may also be made available under the following
 * Secondary Licenses when the conditions for such availability set
 * forth in the Eclipse Public License, v. 2.0 are satisfied: GNU
 * General Public License, version 2 with the GNU Classpath
 * Exception [1] and GNU General Public License, version 2 with the
 * OpenJDK Assembly Exception [2].
 *
 * [1] https://www.gnu.org/software/classpath/license.html
 * [2] http://openjdk.java.net/legal/assembly-exception.html
 *
 * SPDX-License-Identifier: EPL-2.0 OR Apache-2.0
 *******************************************************************************/

package com.ibm.j9.recreateclass.testclasses;

/**
 * A test class which has InnerClasses attribute.
 * A local class which has Enclosing attribute.
 * 
 * @author ashutosh
 */
public class InnerClassesTest {
	public static class InnerClass {
	}
	
	static SampleInterface2 obj1 = new SampleInterface2() {
	};
	
	public static Class<?> getLocalClass() {
		class LocalClass {      /* Local class has EnclosingMethod attribute. */
		}
		return LocalClass.class;
	}

	public static Class<?> getAnonymousInnerClass() {
		return obj1.getClass();
	}
	
	public static Class<?> getAnonymousLocalClass() {
		SampleInterface1 obj2 = new SampleInterface1() {
		};
		return obj2.getClass();
	}
}