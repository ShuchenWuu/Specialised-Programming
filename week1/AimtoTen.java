public class AimtoTen {
    public static void main(String[] args){
        int[] marks = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0};    ;
        System.out.println(need(marks));
    }
    // method 1 -> ovbious and easy to debug
    public static int need(int[] marks){
    // given a int[] marks
    // Determine number of future 10s, so that the average nark is ≥ 9.5

         int numOfTens = 0;
         int sumOfMarks = 0;

         for(int mark:marks){
             sumOfMarks += mark;
         }

         float avg = (float)sumOfMarks/marks.length;

         while (avg < 9.5) {
             numOfTens +=1;
             avg = (float)(sumOfMarks + 10*numOfTens) /(numOfTens+marks.length);
         }

         return numOfTens;
    }

    //method 2 -> not necessary, easy code but hard to debug
    public static int need(int[] marks){
        int sumOfMarks = 0;
        for (int mark : marks){
            sumOfMarks += mark;
        }

        //(currentTotalMarks + 10 * extraAssignmentNumber)/(currentAssignmentNumber + extraAssignmentNumber) >= 9.5
        int res = 19*marks.length - 2*sumOfMarks;
        if (res < 0){
            return 0;
        }else{
            return res;
        }
    }
}