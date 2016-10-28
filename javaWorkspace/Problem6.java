
/**
 * Write a description of class Problem6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Problem6{
    
    //public static int[] digits; deprecated
    public static double main(String[] args){
       String largeNum = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
   
       System.out.println(largeNum.length());
       double runningProduct = 1;//changed to double because worked elsewhere but FAILED
       double largestProduct = 0;
       int len = largeNum.length();
       for(int i = 0;i<13;i++){//first 13
           runningProduct *= Integer.parseInt(largeNum.substring(i,i+1));
           System.out.println("buildup: " + runningProduct);
       }
       largestProduct = runningProduct;
       int digit = 0;
       int endingDigit = 0;
       for(int i = 13; i<len;i++ ){//over rest
           if(runningProduct>largestProduct){//valid attempt
                   largestProduct = runningProduct;
           }
           digit = Integer.parseInt(largeNum.substring(i,i+1));
           endingDigit = Integer.parseInt(largeNum.substring(i-13,i-12));// too many magic constans?
           System.out.println("testingSize:" + runningProduct + " i= " +i
           + " digit:" +digit +" ender: " + endingDigit);// this found an error.
           if(digit!=0){//divide by old, multiply by new check size
               runningProduct = runningProduct / endingDigit * digit;//added double int double for error?
           }else{
                //weird while loop
                runningProduct =1;
                i++;//move over
                int j = 0;
                for(j = i; j-i<13 && j<len;j++){
                    digit = Integer.parseInt(largeNum.substring(j,j+1));//found an error. this was using i not j
                    System.out.println("buildup: " + runningProduct + " j= " +j );
                    if(digit!=0){
                        runningProduct*= digit;
                    }else{//reset the condition...
                        i=j=j+1;//move one over and reset loop
                        runningProduct=1;
                    }
                }
                //I FOGOT TO SHIFT I Over afterwards
                i=j-1;//don't need the extra shift...
                System.out.println("testingSize after Buildup:" + runningProduct + " i= " +i);
           }
       }
       return largestProduct;          
    }

}
