import java.util.ArrayList;  
class Arraylist {  
    public static void main(String[] args) {  
        ArrayList<Integer> numbers = new ArrayList<>();  
        numbers.add(10);  
        numbers.add(20);  
        numbers.add(30);  
        numbers.add(40);  
        numbers.add(50);  
        numbers.remove(2);  
        numbers.set(1, 25);   
        System.out.println("Updated ArrayList:");  
        for (int num : numbers) {  
            System.out.println(num);  
        }  
    }  
}
