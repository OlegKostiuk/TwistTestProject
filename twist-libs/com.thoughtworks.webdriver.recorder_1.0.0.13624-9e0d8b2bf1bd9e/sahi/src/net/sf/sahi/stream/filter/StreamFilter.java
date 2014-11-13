package net.sf.sahi.stream.filter;

import java.io.IOException;

import net.sf.sahi.response.HttpResponse;

/**
 * Sahi - Web Automation and Test Tool
 * 
 * Copyright  2006  V Narayan Raman
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


public abstract class StreamFilter {
	public StreamFilter() {
	}

	public abstract void modifyHeaders(HttpResponse response) throws IOException;

	public abstract byte[] modify(byte[] data) throws IOException;

	public byte[] getRemaining(){return null;}
}
