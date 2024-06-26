import java.util.ArrayList;

public class WebStack {
  private ArrayList<Webpage> internalList;

  public WebStack() {
    internalList = new ArrayList<Webpage>();
  }

  //isEmpty() returns true if nothing is on the top of the stack.
  //Otherwise, returns false.
  public boolean isEmpty() {
    return internalList.isEmpty();
  }

  //push() adds an element to the top of the stack.
  public void push(Webpage item)  {
      internalList.add(0,item);
  }

  //pop() removes and returns the top element of the stack. 
  //If pop() is called when the stack is empty, returns null instead. 
  public Webpage pop() {
      if(isEmpty()){
        return null;
      }
      Webpage item = internalList.get(0);
      internalList.remove(item);
      return item;
  }

  //peek() returns the top element of the stack but does not remove it.
  //If pop() is called when the stack is empty, returns null instead.
  public Webpage peek() {
      if(isEmpty()){
          return null;
      }
        return internalList.get(0);
  }

  //size() returns the number of elements in the stack.
  public int size() {
      return internalList.size();
  }

  //clear() removes all elements from the stack.
  public void clear() {
      internalList.clear();
  }

  //toString() should return a String containing the name of each Webpage in the stack.
  //Each Webpage name should be on a new line and arranged such that
  //The top of the stack is the first line and the bottom of the stack is the last line.
  @Override
  public String toString() {
      StringBuilder elements = new StringBuilder();
      for(int i = 0; i < internalList.size(); i++){
        elements.append(internalList.get(i).getName() + " ");
      }
      return elements.toString();
  }
}