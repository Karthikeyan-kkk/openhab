package org.openhab.model.script.jvmmodel;

import java.util.Arrays;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.xbase.featurecalls.IdentifiableSimpleNameProvider;

@SuppressWarnings("all")
public class ScriptIdentifiableSimpleNameProvider extends IdentifiableSimpleNameProvider {
  protected String _getSimpleName(final JvmType element) {
    return "this";
  }
  
  protected String _getSimpleName(final JvmIdentifiableElement element) {
    String _simpleName = super.getSimpleName(element);
    return _simpleName;
  }
  
  public String getSimpleName(final JvmIdentifiableElement element) {
    if (element instanceof JvmType) {
      return _getSimpleName((JvmType)element);
    } else if (element != null) {
      return _getSimpleName(element);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(element).toString());
    }
  }
}