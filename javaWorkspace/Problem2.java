
/**
 * Write a description of class Problem2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Problem2
{
    public static int main(String[] args){
        //fibanacci who are even and <4million
        int lowestFib = 1;
        int midFib = 1;
        int highFib = 2;
        int cap = 4* (int)(Math.pow(10,6));
        int sum = 0;
        while(highFib < cap){
            //make the highFib
            highFib = midFib + lowestFib;
            if(highFib%2==0){
                sum += highFib;
            }
            lowestFib = midFib;//shift to next thing
            midFib = highFib;
        }
        return sum;
    }
}
