public class Line {
  private String lineEquation;
  public line (double slope, double yIntercept){
    lineEquation = "y=" + slope + "x+" yIntercept;
  }
  // The constructor was made to include the variables and what they were equal to since everything could be consicely done there. 

  public void getLineEquation() {
    system.out.println(lineEquation);
  }
  // The method needed only the print controls and since it didn't return anything, it was set to void. 
}
