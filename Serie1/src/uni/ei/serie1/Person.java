/*******************************
 * Author:
 *    - Lukas Diener - 11-123-213
 *    - Michael Kohler - 11-108-289
 *******************************/

package uni.ei.serie1;

import java.util.ArrayList;
import java.util.Random;

public class Person {

  public ArrayList _parentList = new ArrayList(2);

  public Person(boolean aNotFirstGeneration) {
    if (aNotFirstGeneration)
      setParents();
  }

  private void setParents() {
    int random1 = getRandomNumber(); // first parent
    int random2 = getRandomNumber(); // second parent

    this._parentList.add(random1);
    this._parentList.add(random2);
  }

  private int getRandomNumber() {
    int random = (int) (Math.random() * (Serie1._inhabitants - 1) + 1);
    return random;
  }

}
