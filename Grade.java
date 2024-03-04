
    import java.util.Scanner;
    public class Grade {
        public static void main(String[] args) {
            int no_sub;

            Scanner student=new Scanner(System.in);
            System.out.println("Enter your name:");
            String name=student.next();
            System.out.println("Enter your reg number:");
            double reg_no=student.nextDouble();

            System.out.println("Enter no.of subjects:");
            no_sub=student.nextInt();
            int Tamil,English,Maths,Science,Social;
            System.out.println("Enter the marks in Tamil:");
            Tamil=student.nextInt();
            System.out.println("Enter the marks in English:");
            English=student.nextInt();
            System.out.println("Enter the marks in Maths:");
            Maths=student.nextInt();
            System.out.println("Enter the marks in Science:");
            Science=student.nextInt();
            System.out.println("Enter the marks in Social:");
            Social=student.nextInt();
            float total=Tamil+English+Maths+Science+Social;
            System.out.println("Your total mark:"+total);
            float avg=total/no_sub;
            System.out.println("Average of your marks:"+avg);
            if(avg>=90) {
                System.out.println("Your grade is A");
            }
            else if(avg>=80) {
                System.out.println("Your grade is B");
            }
            else if(avg>=70) {
                System.out.println("Your grade is C");
            }
            else if(avg>=60) {
                System.out.println("Your grade is D");
            }
            else if(avg>=50) {
                System.out.println("Your grade is E");

            }
            else if(avg>=40) {
                System.out.println("Your grade is F");
                System.out.println("You were just pass");
            }
            else {
                System.out.println("Your were failed,study well");
            }
        }
    }




