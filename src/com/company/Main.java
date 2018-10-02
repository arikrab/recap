package com.company;

public class Main {


    /////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////recursive distance between two numbers////////////////////////////////

    //the user will call the the helper function first
    //that getting two number and initialize the distance with zero value
    public static int distance(int firstNum,int secondNum){
        int retDistace=distance(firstNum,secondNum,0);
        return retDistace;
    }
    //this function is where the magic happens
    public static int distance(int firstNum,int secondNum,int distance) {
        //this function counting the times it calls it self and getting it distance by that

        int retDistance=distance;

        if (firstNum == secondNum) {//
            return retDistance;
        }
        if (firstNum < secondNum) {//this if is made if the first number is smaller then the second
            retDistance=distance(firstNum + 1, secondNum, distance + 1);
        }
        if (firstNum > secondNum) {////this if is made if the first number is higher then the second
            retDistance=distance(firstNum, secondNum + 1, distance + 1);
        }
        return retDistance;

    }
    /////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////devision with recurtion///////////////////////////////////////
    public static int devision(int firstNumber ,int secondNumber) {//helper function
        int answear=devision(firstNumber,secondNumber,0);

        return answear;
    }
    public static int devision(int firstNumber ,int secondNumber, int answear) {
        //where is the magic happen
        //counting how much the first number is can be in the second number
        int retMod=answear;
        if (firstNumber==secondNumber){
            return retMod;
        }
        if (firstNumber<secondNumber){
            if ((firstNumber+(firstNumber*answear))>secondNumber){
                return retMod;
            }
            retMod=devision(firstNumber,secondNumber,answear+1);
        }
        if (firstNumber>secondNumber){
            return retMod;
        }
        return retMod;
    }
    //////////////////////////////////////////////////////////////////////////////////////////////

    /////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////multiply with recurion//////////////////////////////////////////

    public static int multiply(int firstNum,int secondNum){

        int answear=multiply(firstNum,secondNum,0,0);
        return answear;
    }
    public static int multiply(int firstNum,int secondNum,int answear,int times){
        int retAnswear=answear;
        if(times!=secondNum){
            retAnswear=multiply(firstNum,secondNum,answear+firstNum,times+1);
        }
        if(times==secondNum){
            return retAnswear;
        }
        return retAnswear;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////

    /////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////modulu ////////////////////////////////////////////

    public static int moudulu(int num ,int devider){

        int retMod;//the return value
        retMod=devision(devider,num);//first we devide the number by the devider
        if(retMod==0){return retMod;}//if the devide function got a zero then there is no way for Mod
        if(retMod!=0){
            retMod=distance(num,multiply(devider,retMod));//
        }
        return retMod;
    }
    ///////////////////////////////////////////////////////////////////////////////////////////

    //////////////////////////POW LOOP/////////////////////////////////////
    public static int powL(int num ,int power){
        int answear=num;
        if (power==0){return 1;}
        for(int i=0;i<power-1;i++){
            answear=answear*num;
        }
        return answear;
    }

    /////////////////////////////////////////////////////////////////////

    /////////////////////pow recursion////////////////////////////////

    public static int powR(int num,int power){
        int answear=powR(num,power,0,1);
        return answear;
    }
    public static int powR(int num,int power,int counter,int answear){

        if (power==counter){return answear;}
        if(power!=counter){
            answear=powR(num,power,counter+1,answear*num);
        }
        return answear;
    }
    ////////////////////////////////////////////////////////////////////////////

    ////////////////////root loopy way/////////////////////////////////////////

    public static int rootL(int number){
        int root;

        for (int i=0;;i++){
            if (i*i==number){
                root=i;
                return root;
            }
            if (i*i<number&&(i+1)*(i+1)>number){
                root=i+1;
                return root;
            }
        }
    }
    ///////////////////////////////////////////////////////////////////////////

    //////////////////////root recursive way//////////////////////////////////
    public static int rootR(int number){
       int root=rootR(number,0);
       return root;
    }
    public static int rootR(int number,int root){
        if (root*root==number){
            return root;
        }
        if(root*root<number&&(root+1)*(root+1)>number){
            return root+1;
        }
        else {
            root=rootR(number,root+1);
        }

        return root;
    }

    //////////////////////////////////////////////////////////////////////////

    /////////////////////primes loopy way/////////////////////////////////////

    public static void primesL(int number){

        for (int i =2;;){
            if (number%i==0){
                System.out.print(i+" ");
                number=number/i;
                if (number==1){
                    System.out.println();
                    break;}
            }
            if (number%i!=0){
                i++;
            }

        }

    }
    ///////////////primes recursiv/////////////////////////
    public static void primesR(int number){
        int devider=2;
        primesR(number,devider);
    }
    public static void primesR(int number,int devider){
        if (number!=1){
            if (number%devider==0){
                System.out.print(devider+" ");
                number=number/devider;
                primesR(number,devider);
            }
            else{
                primesR(number,devider+1);
            }
        }
        else{
            System.out.println();
        }

    }

    //////////////////////////////////////////////////////////////

    /////////////////////sum of digits loops//////////////////////

    public static int sumDigitL(int number){
        int answear=0;
        while (number!=1){
            answear=answear+(number%10);
            number=number/10;
        }
        return answear;
    }

    ///////////////////////////////////////////////////////////////

    /////////////////////////////////////////////////////////////////////////
        public static void main(String[] args) {
	        System.out.println("the distance is:"+distance(-2,-4));
	        System.out.println("the devition is:"+devision(2,6));
	        System.out.println("the multiply is:"+multiply(4,3));
	        System.out.println("the moudulu is"+moudulu(7,8));
	        System.out.println("the power is:"+powL(2,10));
            System.out.println("the power is:"+powR(3,0));
            System.out.println("root is:"+rootL(0));
            System.out.println("root is:"+rootR(26));
            primesL(100);
            primesR(100);
            System.out.println(sumDigitL(1234));
    }
}
