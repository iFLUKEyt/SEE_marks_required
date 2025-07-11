import java.util.Scanner;

public class calculate_see_marks_required{
    private static double ce;
    public static void ce_got() {
        Scanner sc = new Scanner(System.in);
        double tt1;
        double tt2;
        double assignment;
        double a;
        double b;
        double finalmarks;
        double finalass=0.0;

        System.out.println("enter marks of test 1 and test 2");

        tt1=sc.nextInt();
        tt2=sc.nextInt();

        a= tt1+tt2;
        b= a/2;
        finalmarks= b*1.2;
        System.out.println("out of 30, your test marks are: " + finalmarks);

        System.out.println("enter your assignment marks");
        assignment=sc.nextInt();

        System.out.println("enter total assignment marks");

        int totalAssignmentMarks = sc.nextInt();

        if (totalAssignmentMarks == 20) {
            finalass=assignment*1.5;
            System.out.println("out of 30, your assignment marks are: " + finalass);

        } else if (totalAssignmentMarks == 25) {
            finalass=assignment*1.2;
            System.out.println("out of 30, your assignment marks are: " + finalass);
        
        }else if (totalAssignmentMarks == 30) {
            finalass=assignment*1.0;
            System.out.println("out of 30, your assignment marks are: " + finalass);

        } else if (totalAssignmentMarks == 50) {
            finalass=assignment*0.6;
            System.out.println("out of 30, your assignment marks are: " + finalass);
        
        } else {
            System.out.println("Invalid total assignment marks");
        
        }

        ce= finalmarks + finalass;
        System.out.println("out of 60, your ce marks are: " + ce);

    }

    public static void calculate_see_marks_required() {

        double required_for_O;
        double required_for_Aplus;
        double required_for_A;
        double required_for_Bplus;
        
        required_for_O = 91.0 - ce;
        if (required_for_O <= 40){
            System.out.println(  required_for_O*2.5 + " /100" + " --- 10 cgpa");           
        }else {
             System.out.println("You cannot get 10 cgpa");
        }

        required_for_Aplus = 75.0 - ce;
        if (required_for_Aplus <= 40){
            System.out.println(  required_for_Aplus*2.5 + " /100" + " --- 9 cgpa");          
        }else {
            System.out.println("You cannot get 9 cgpa");
        }

        required_for_A = 61.0 - ce;
        if (required_for_A <= 40){
            System.out.println( required_for_A*2.5 + " /100" + " --- 8 cgpa");          
        }else {
            System.out.println("You cannot get 8 cgpa");
        }

        required_for_Bplus = 55.0 - ce;
        if (required_for_Bplus <= 40){
            System.out.println(  required_for_Bplus*2.5 + " /100" + " --- 7 cgpa");           
        }else {
            System.out.println("You cannot get 7 cgpa");
        }
    }
    public static void main(String[] args) {
        ce_got();
        calculate_see_marks_required();

    }
       
    
}