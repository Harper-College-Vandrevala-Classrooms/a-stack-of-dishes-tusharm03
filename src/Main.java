public class Main {
    public static void main(String[] args) {
        DishStack stack = new DishStack(3);

        Dish oneDish = new Dish("A dish with one fish pattern on it");
        Dish twoDish = new Dish("A dish with two fish patterns on it");
        Dish redDish = new Dish("A dish with a red fish pattern on it");
        Dish blueDish = new Dish("A dish with a blue fish pattern on it");

        System.out.println("Initial size: " + stack.size()); 

        stack.push(oneDish);
        stack.push(twoDish);
        stack.push(redDish);

        stack.push(blueDish); 

        System.out.println("Size after pushes: " + stack.size()); 

        Dish peekedDish = stack.peek();
        System.out.println("Peeked dish: " + peekedDish.description); 

        Dish poppedDish = stack.pop();
        System.out.println("Popped dish: " + poppedDish.description); 

        Dish anotherPoppedDish = stack.pop();
        System.out.println("Another popped dish: " + anotherPoppedDish.description); 

        System.out.println("Final size: " + stack.size()); 
    }
}
