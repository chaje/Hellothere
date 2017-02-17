/**
 * 
 */
package org.eclipse.testgit.server.services.lookup;

import org.eclipse.scout.rt.server.services.lookup.AbstractSqlLookupService;
import org.eclipse.testgit.shared.services.lookup.ItestLookupService;

/**
 * @author Lenovo
 */
public class testLookupService extends AbstractSqlLookupService<Boolean> implements ItestLookupService {

  @Override
  protected String getConfiguredSqlSelect() {
    return ""; // TODO [Lenovo] write select statement here.

  }
}