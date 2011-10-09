/*******************************
 * Author:
 *    - Lukas Diener - 11-123-213
 *    - Michael Kohler - 11-108-289
 *******************************/

package uni.ei.serie1;

import java.util.ArrayList;

public class Serie1 {

  public static final int _inhabitants = 100000;
  private static final int _generations = 66;
  public static ArrayList _genList = new ArrayList(_generations);

  public static void main(String[] args) {
    createLists();
  }

  private static void createLists() {
    // generate generations
    for (int i = 0; i < _generations; i++) {
      // generate personlists (one per generation)
      ArrayList currentPersList = new ArrayList(_inhabitants);
      for (int j = 0; j < _inhabitants; j++) {
        if (i == 0)
          currentPersList.add(new Person(false));
        else
          currentPersList.add(new Person(true));

      }
      _genList.add(currentPersList);
    }
    System.out.println(_genList.size());
  }

}
