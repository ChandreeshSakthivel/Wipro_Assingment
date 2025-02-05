import java.util.HashSet;  
class Hashset {  
    public static void main(String[] args) {  
        HashSet<String> cities = new HashSet<>();  
        cities.add("Chennai");  
        cities.add("Bangalore");  
        cities.add("Hyderabad");  
        cities.add("Mumbai");  
        cities.add("Chennai"); 
        System.out.println("Cities in HashSet: " + cities);  
        String check = "Mumbai";  
        if (cities.contains(check)) {  
            System.out.println(check + " is in the set.");  
        } else {  
            System.out.println(check + " is not in the set.");  
        }  
        cities.remove("Hyderabad");  
        System.out.println("Updated HashSet : " + cities);  
    }  
}
