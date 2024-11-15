import java.util.ArrayList;

class DishStack {
    private ArrayList<Dish> stack;
    private int maxSize;

    public DishStack(int maxSize) {
        this.stack = new ArrayList<>();
        this.maxSize = maxSize;
    }

    public void push(Dish dish) {
        if (stack.size() < maxSize) {
            stack.add(dish);
        } else {
            System.out.println("The stack is full. Cannot push the dish.");
        }
    }

    public Dish pop() {
        if (stack.isEmpty()) {
            System.out.println("The stack is empty. Cannot pop a dish.");
            return null;
        } else {
            return stack.remove(stack.size() - 1);
        }
    }

    public Dish peek() {
        if (stack.isEmpty()) {
            System.out.println("The stack is empty. Cannot peek.");
            return null;
        } else {
            return stack.get(stack.size() - 1);
        }
    }

    public int size() {
        return stack.size();
    }
}
