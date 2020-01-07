public class Main {

  public static void main(String[] args) {
    System.out.println(pluralize("horse", 1));
    System.out.println(pluralize("ewok", 5));

  }

  public static String pluralize (String animal, int num) {
    if (num == 1) {
      return "I own " + num + " " + animal + ".";
    } else {
      return "I own " + num + " " + animal + "s.";
    }
  }

  public static String flipNHeads (int n) {

    return "heads or tails";
  }

  public static String clock () {

    return "the time";
  }

}
