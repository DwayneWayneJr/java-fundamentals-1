import java.time.LocalDateTime;

public class Main {

  public static void main(String[] args) {
    System.out.println(pluralize("horse", 1));
    System.out.println(pluralize("ewok", 5));

    flipNHeads(2);

    clock();

  }

  public static String pluralize (String animal, int num) {
    if (num == 1) {
      return "I own " + num + " " + animal + ".";
    } else {
      return "I own " + num + " " + animal + "s.";
    }
  }

  public static void flipNHeads (int n) {
    int headsCounter = 0;
    int flipCounter = 0;

    while (headsCounter < n) {
      int rand = (int) (Math.random() * 10) + 1;
      flipCounter++;

      if (rand >= 5) {
        System.out.println("heads");
        headsCounter++;
      } else {
        System.out.println("tails");
        headsCounter = 0;
      }

    }

    if (flipCounter == 1) {
      System.out.println("It took " + flipCounter + " flip to flip " + n + " head in a row");
    } else {
      System.out.println("It took " + flipCounter + " flips to flip " + n + " heads in a row");
    }
  }

  public static void clock () {
    LocalDateTime current = LocalDateTime.now();
    int startSecond = current.getSecond();
    
    while (true) {
      current = LocalDateTime.now();
      int second = current.getSecond();
      int hour = current.getHour();
      int minute = current.getMinute();

      if (startSecond != second) {
        startSecond = second;
        System.out.println(hour + ":" + minute + ":" + second);
      }
    }
  }
}
