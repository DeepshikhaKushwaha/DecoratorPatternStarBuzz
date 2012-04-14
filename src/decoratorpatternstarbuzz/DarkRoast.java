package decoratorpatternstarbuzz;

/**
 * Coding beverage darkRoast Class.
 * @author deepshikha
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast";
    }

    public double cost() {
        return .99;
    }
}
