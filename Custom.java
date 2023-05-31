
//Program for Custom Exception

class Student {

    String name;
    float grade;

    public Student(String name, float grade) throws InvalidGradeException {
        if (grade > 4.0 || grade < 0.0) {
            throw new InvalidGradeException("Invalid please re-enter again");
        } else {
            this.name = name;
            this.grade = grade;

        }
    }

    // Handling for grade Exception
    class InvalidGradeException extends Exception {
        public InvalidGradeException(String msg) {
            super(msg);
        }
    }

    class Custom {
        public static void main(String[] args) {

            try {

                new Student("Ishan", 3);
            } catch (InvalidGradeException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}