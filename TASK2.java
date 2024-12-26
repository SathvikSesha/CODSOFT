import java.util.Scanner;
public class TASK2 {
    public static char calcGrade(double percentage){
        if(percentage>=90){
            return 'A';
        } 
        else if(percentage>=80){
            return 'B';
        } 
        else if(percentage>=70){
            return 'C';
        } 
        else if(percentage>=60){
            return 'D';
        } 
        else if(percentage>=50){
            return 'E';
        } 
        else{
            return 'F';
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Student Grade Calculator");
        System.out.print("Enter the number of subjects:");
        int n = sc.nextInt();
        if(n<=0){
            System.out.println("Number of subjects must be greater than 0.");
            return;
        }
        double[] marks=new double[n];
        double totalMarks = 0;
        for(int i=0;i<n;i++){
            System.out.print("Enter marks obtained in subject " + (i + 1) + " (out of 100): ");
            double mark = sc.nextDouble();
            if (mark<0 || mark>100){
                System.out.println("Marks should be in the range of 0 to 100.");
                return;
            }
            marks[i]=mark;
            totalMarks=totalMarks+mark;
        }
        double avg=totalMarks/n;
        char grade=calcGrade(avg);
        System.out.println("\nResults:");
        System.out.println("Total Marks: "+totalMarks);
        System.out.println("Average Percentage: "+avg+"%");
        System.out.println("Grade: "+grade);
        sc.close();
    }
}
