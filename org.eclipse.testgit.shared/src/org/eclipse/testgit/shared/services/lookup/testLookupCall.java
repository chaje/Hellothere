/**
 * 
 */
package org.eclipse.testgit.shared.services.lookup;

import org.eclipse.scout.rt.shared.services.lookup.ILookupService;
import org.eclipse.scout.rt.shared.services.lookup.LookupCall;

/**
 * @author Lenovo
 */
public class testLookupCall extends LookupCall<Boolean> {

  private static final long serialVersionUID = 1L;

  @Override
  protected Class<? extends ILookupService<Boolean>> getConfiguredService() {
    return ItestLookupService.class;
  }
}