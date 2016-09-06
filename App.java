import java.io.Console;

public class App {
  public static void main(String[] args) {

    Integer userHeight = askForDimensions("height");
    Integer userWidth = askForDimensions("width");
    Integer userDepth = askForDimensions("depth");
    Integer userWeight = askForDimensions("weight");

    Parcel yourParcel = new Parcel(userHeight, userWidth, userDepth, userWeight);
    System.out.println("The price to ship your package based on volume and weight is: $" + yourParcel.costToShip());
  }

  public static Integer askForDimensions(String dimension) {
    Console console = System.console();
    System.out.println("What is the " + dimension + " of your package?");
    return Integer.parseInt(console.readLine());
  }
}
