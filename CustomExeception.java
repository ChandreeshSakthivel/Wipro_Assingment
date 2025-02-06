class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

class CustomException {
    public static void validateNumber(int number) throws InvalidInputException {
        if (number < 0) {
            throw new InvalidInputException("Number must be non-negative");
        } else {
            System.out.println("Valid Number: " + number);
        }
    }
    public static void main(String[] args) {
        try {
            validateNumber(-5);
        } catch (InvalidInputException e) {
            System.out.println("Caught Custom Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed after Custom Exception");
        }
    }
}