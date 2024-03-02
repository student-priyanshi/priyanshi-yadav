import java.util.Scanner;



class StudentGradeCal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("############ STUDENT GRADE CALCULATOR ############");

         System.out.println("Enter a marks obtained (out of 100) in each subject");
         System.out.println("Subject1:");
         int Subject1=sc.nextInt();
         System.out.println("Subject2:");
         int Subject2 = sc.nextInt();
         System.out.println("Subject3:");
         int Subject3=sc.nextInt();

          int total=Subject1 + Subject2 +Subject3;

         double percentage=total/3.0;

         char GRADE;
            if (percentage>=90){
                GRADE='A';
            }
            else if (percentage>=80){
                GRADE='B';
            }
            else if (percentage>=70){
                GRADE='C';
            }
            else if (percentage>=60){
                GRADE='D';
            }
            else {
                GRADE='F';
            }

            System.out.println("*******************************");
            System.out.println("Total:"+ total);
            System.out.println("Percentage:"+ percentage);
            System.out.println("Grade:"+GRADE);


         sc.close();

    }
}