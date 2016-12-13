/*
 * Copyright 2010 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.xmlmatchers.transform;

import java.io.StringWriter;

import javax.xml.transform.stream.StreamResult;

/**
 * A convenience subclass of {@link StreamResult} that allows you to directly
 * retrieve the resulting string using the {@link #toString()} method.
 * 
 * @author David Ehringer
 * @see StreamResult
 */
public class StringResult extends StreamResult {

	public StringResult() {
		super(new StringWriter());
	}

	/**
	 * Returns the XML as a String.
	 */
	public String toString() {
		return getWriter().toString();
	}
}
