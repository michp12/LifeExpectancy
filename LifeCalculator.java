 import java.util.Scanner;
import java.lang.Math;
import java.util.Calendar;
class LifeCalculator{
    public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
  System.out.println("What is your gender? (M or F)");
 String gender = scan.nextLine(); 
   System.out.println("What is your ethnicity? (W= White, A = Asian, B = Black, H = Hispanic, N = Native American)");
 String ethnicity = scan.nextLine();
  System.out.println("What year were you born? (Example: 2002)");
  int birthyear = scan.nextInt();
int currentyear = Calendar.getInstance().get(Calendar.YEAR);
  
 if (gender.equals("M") && ethnicity.equals("W")) {
     System.out.println("You will live " + (77+birthyear-currentyear)+ " more years.");
  
}
else if (gender.equals("F") && ethnicity.equals("W")) {
     System.out.println("You will live " + (81+birthyear-currentyear)+ " more years.");
  
}

else if (gender.equals("M") && ethnicity.equals("A")) {
     System.out.println("You will live " + (84+birthyear-currentyear)+ " more years.");
  
}
else if (gender.equals("F") && ethnicity.equals("A")) {
     System.out.println("You will live " + (89+birthyear-currentyear)+ " more years.");
  
}
else if (gender.equals("M") && ethnicity.equals("B")) {
     System.out.println("You will live " + (72+birthyear-currentyear)+ " more years.");
  
}
else if (gender.equals("F") && ethnicity.equals("B")) {
     System.out.println("You will live " + (78+birthyear-currentyear)+ " more years.");
  
}
else if (gender.equals("M") && ethnicity.equals("H")) {
     System.out.println("You will live " + (80+birthyear-currentyear)+ " more years.");
  
}
else if (gender.equals("F") && ethnicity.equals("H")) {
     System.out.println("You will live " + (85+birthyear-currentyear)+ " more years.");
  
}
else if (gender.equals("M") && ethnicity.equals("N")) {
     System.out.println("You will live " + (72+birthyear-currentyear)+ " more years.");
  
}
else if (gender.equals("F") && ethnicity.equals("N")) {
     System.out.println("You will live " + (78+birthyear-currentyear)+ " more years.");
  
}

    }
}

/*
What is your gender? (M or F)
 M
What is your ethnicity? (W= White, A = Asian, B = Black, H = Hispanic, N = Native American)
 A
What year were you born? (Example: 2002)
 2002
You will live 68 more years.


What is your gender? (M or F)
 M
What is your ethnicity? (W= White, A = Asian, B = Black, H = Hispanic, N = Native American)
 B
What year were you born? (Example: 2002)
 1990
You will live 44 more years.


What is your gender? (M or F)
 F
What is your ethnicity? (W= White, A = Asian, B = Black, H = Hispanic, N = Native American)
 H
What year were you born? (Example: 2002)
 2009
You will live 76 more years.
*/
