public class Swan {

  static int count = 8;

  public Swan() {
    count = 12;
  }

  private void Swan() {
     count = 3;
  }

  public static void main(String args[]) {
      
      System.out.println("Count 8: "+count);
      Swan swan = new Swan();
      System.out.println("Count 12: "+swan.count);
      swan.Swan();
      System.out.println("Count 3: "+swan.count);
      
  }
}
