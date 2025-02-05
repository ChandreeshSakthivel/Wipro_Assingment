import java.util.HashMap;  
class HashMapExample {  
    public static void main(String[] args) {  
        HashMap<Integer, String> students = new HashMap<>();  
        students.put(1, "Ravi");  
        students.put(2, "Vijay");  
        students.put(3, "Ajith");  
        students.put(4, "Sam");  
        students.put(5, "Ram");  
        int find = 3;  
        if (students.containsKey(find)) {  
            System.out.println("Student with roll number " + find + ": " + students.get(find));  
        } else {  
            System.out.println("Roll number " + find + " not found.");  
        }  
        int remove = 4;  
        students.remove(remove);  
        System.out.println("Removed student " + remove);  
        System.out.println("Updated student records:");  
        for (Integer n : students.keySet()) {  
            System.out.println("Roll Number: " + n + ", Name: " + students.get(n));  
        }  
    }  
}
