
package decoratorpatternstarbuzz;

/** 
 *1) We need to be interchangeable with a Beverage, So we are going to extend the Beverage class. 
 * 2) We are going to require that the Condiment decorators all re implement the getDescription() methods.
 * @author deepshikha
 */
public abstract class CondimentDecorator extends Beverage{
    public abstract String getDescription();
}
