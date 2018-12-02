package main;

import applicationAdministrator.Application;

/**
 * <table>
 *  <tr>
 *  	<th align='left'>Version</th>
 *  	<th align='left'>Author</th>
 *  	<th align='left'>Date</th>
 *  	<th align='left'>Description</th>
 *  </tr>
 *  <tr>
 *  	<td>0.1</td>
 *  	<td>Nicolas Fernandez</td>
 *  	<td>12/11/2018</td>
 *  	<td>Main Class.</td>
 *  </tr>
 * </table>
 * @author NFERNANDEZ
 *
 */
public class Main {

	public static void main(String[] args) {
		
		Application app = new Application();
		app.init();
	}
}