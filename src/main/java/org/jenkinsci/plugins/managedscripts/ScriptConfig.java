/**
 * 
 */
package org.jenkinsci.plugins.managedscripts;

import java.util.ArrayList;
import java.util.List;

import org.jenkinsci.lib.configprovider.model.Config;
import org.kohsuke.stapler.DataBoundConstructor;

/**
 * @author domi
 * 
 */
public class ScriptConfig extends Config {

	public final List<Arg> args;

	@DataBoundConstructor
	public ScriptConfig(String id, String name, String comment, String content, List<Arg> args) {
		super(id, name, comment, content);

		if (args != null) {
			List<Arg> filteredArgs = new ArrayList<ScriptConfig.Arg>();
			for (Arg arg : args) {
				if (arg.name != null && arg.name.trim().length() > 0) {
					filteredArgs.add(arg);
				}
			}
			this.args = filteredArgs;
		} else {
			this.args = null;
		}
	}

	public static class Arg {
		public final String name;

		@DataBoundConstructor
		public Arg(final String name) {
			this.name = name;
		}
	}

}
