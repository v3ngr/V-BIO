public class Main {
  public static void main(String[] args) {
    System.out.println("*blinks*");
    Bio myBio = new Bio();
    System.out.println(myBio.toString());
  }

  public static class Bio {
    private final String type = "Furry";
    private final String region = "Southern French City..";
    private final String[] pronouns = {"he", "him"};
    private final int age = 19;
    private final String degree = "Electrical Engineering";
    private final String[] languages = {"Spanish", "English", "French"};
    private final double energyLevel = 0.01; 
    private boolean hasWill = false;

    public Bio() {
      System.out.println("I made this instead of crying on nodal analysis homework~");
    }

    public String getStatus() {
      return energyLevel < 0.5 ? "Running on low energy mode" : "Energetic, or too many monsters..";
    }

    public boolean checkWill() {
      return hasWill; 
    }

    public String[] getSpokenLanguages() {
      return languages;
    }

    @Override
    public String toString() {
      return String.format(
          "🐾 %s from the %s\n" +
          "Pronouns: %s/%s\n" +
          "Age: %d\n" +
          "Degree: %s\n" +
          "Languages: %s, %s, %s\n" +
          "Status: %s @_@\n" +
          "Has will: %s",
          type, region,
          pronouns[0], pronouns[1],
          age,
          degree,
          languages[0], languages[1], languages[2],
          getStatus(),
          hasWill ? "Yes" : "No"
      );
    }

  }
}
