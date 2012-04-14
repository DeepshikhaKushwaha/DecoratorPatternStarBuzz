package decoratorpatternstarbuzz;

/**
 * Coding Condiment Milk( Milk is a Decorator extends Condiment Decorator)
 *
 * @author deepshikha
 */
public class Milk extends CondimentDecorator {

    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + " Milk";
    }

    public double cost() {
        return beverage.cost() + .10;
    }
}
