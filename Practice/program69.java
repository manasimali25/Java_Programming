import java.util.Scanner;

class program69
{
  public static void main(String A[])
  {
    Scanner sobj = new Scanner(System.in);   

    int iValue = 0;
    boolean bRet = false;


    System.out.println("Enter number : ");
    iValue = sobj.nextInt();

    NumberX nobj = new NumberX();

    bRet = nobj.CheckPrime(iValue);

    if(bRet == true)
    {
      System.out.println("It is Prime");
    }
    else
    {
      System.out.println("It is not Prime");
    }    
  }
}

class NumberX
{
  public boolean CheckPrime(int iNo)
  {
    int iCnt = 0;
    boolean bFlag = false;           // true = 1 --> flashlight is onn

    
    for(bFlag = true, iCnt = 2; iCnt <= (iNo / 2) ; iCnt++)             // for loop chya aat mdhe aapn max semicolon 2 ch taku shkto ....... more than 2 takla tr error yeil
    {
      if(iNo % iCnt == 0)
      {
        bFlag = false;
        break;

      }

    }

    return bFlag;
    
    
  }
  
}

// NOTE: return is not allowed in for loop

// firstly aapn boolean flag aslela code lihaicha mg nntr if sangitl or vicharla tr ch without flag lihaicha  

// if function is returning boolean tr ch flag chi concept use hoil nhi tr nhi
