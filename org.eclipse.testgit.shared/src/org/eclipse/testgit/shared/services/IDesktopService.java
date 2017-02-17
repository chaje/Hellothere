/**
 * 
 */
package org.eclipse.testgit.shared.services;

import org.eclipse.scout.commons.exception.ProcessingException;
import org.eclipse.scout.rt.shared.validate.IValidationStrategy;
import org.eclipse.scout.rt.shared.validate.InputValidation;
import org.eclipse.scout.service.IService;

/**
 * @author Lenovo
 */
@InputValidation(IValidationStrategy.PROCESS.class)
public interface IDesktopService extends IService {

  /**
   * @param formData
   * @return
   * @throws org.eclipse.scout.commons.exception.ProcessingException
   */
  DesktopFormData load(DesktopFormData formData) throws ProcessingException;
}