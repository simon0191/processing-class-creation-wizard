/**
 * you can put a one sentence description of your tool here.
 *
 * ##copyright##
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General
 * Public License along with this library; if not, write to the
 * Free Software Foundation, Inc., 59 Temple Place, Suite 330,
 * Boston, MA  02111-1307  USA
 * 
 * @author		Simon Soriano
 * @modified	22/09/2013
 * @version		0.0.1
 */

 package processing.app.tools;
 
 import javax.swing.JFrame;

import processing.app.*;
import processing.app.tools.*;
 
 
 
 @SuppressWarnings("serial")
public class ClassCreationWizard extends JFrame implements Tool {
  
	public String getMenuTitle() {
		return "Class Creation Wizard";
	}
 
	public void init(Editor theEditor) {
	}
 
	public void run() {
		System.out.println("Class Creation Wizard Tool 0.0.1 by Simon Soriano");
		
	}
 
 }



