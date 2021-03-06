/*
 The MIT License

 Copyright (c) 2011, Dominik Bartholdi

 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:

 The above copyright notice and this permission notice shall be included in
 all copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 THE SOFTWARE.
 */
package org.jenkinsci.plugins.managedscripts;

import hudson.Extension;

import org.jenkinsci.lib.configprovider.AbstractConfigProvider;
import org.jenkinsci.lib.configprovider.model.ConfigDescription;
import org.jenkinsci.lib.configprovider.model.ContentType;
import org.jenkinsci.lib.configprovider.model.Config;

@Extension
public class ScriptBuildStepConfigProvider extends AbstractConfigProvider {

	@Override
	public ConfigDescription getConfigDescription() {
		return new ConfigDescription(Messages.buildstep_provider_name(), Messages.buildstep_provider_description());
	}

	@Override
	public Config newConfig() {
		String id = getProviderId() + System.currentTimeMillis();
		return new ScriptConfig(id, "Build Step", "", "echo \"hello world\"", null);
	}

	@Override
	protected String getXmlFileName() {
		return "buildstep-config-files.xml";
	}

	@Override
	public ContentType getContentType() {
		return ContentType.DefinedType.HTML;
	}

}
