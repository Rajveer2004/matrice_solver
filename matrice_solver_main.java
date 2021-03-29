import java.util.*;

class matrice_solver_main
{
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
        System.out.println("Hi this is a code I made at 3am in the morning to solve matrices the first chapter of class 12 maths, \nGonna help me a lot hehe.\n Anyways, enter the problem you wish to solve.\nNote: pls just enter the basic problem without words or problem statements\ncan perform addition,subtraction and multiplication as of now, working on other features.\n");

        System.out.println("Enter the problem statement");

        //stores the problem statement.
        String problem =sc.nextLine();

    //calls the matrice_finder method.
    matrice_solver_main obj=new matrice_solver_main();
    obj.matrice_finder(problem);
    }



//method function: to extract the alphabets/matrice constants from the 'problem' statement.
void matrice_finder(String problem)
{
    //gets the lenth of 'String problem'
    int length= problem.length();

    //used to get all the extracted matrice constants in a string.
    String add_variables = " ";

    //loop function: to extract matrice constants from 'String problem' with the help of charAt function.
    for(int f=0; f<length;f++)
    {
        //stores a single character of index 'f loop'.
        char detect_matrice= problem.charAt(f);

        //if function to check if 'char detect_matrice's value is an alphabet or not and adds it to add_variables if it is.
        if( (detect_matrice >= 'a' && detect_matrice <= 'z') || (detect_matrice >= 'A' && detect_matrice <= 'Z'))
        {
            add_variables=add_variables+detect_matrice;
        }
    }
    
    //used to remove blank spaces from 'String add_variables'
    add_variables = add_variables.replaceAll("\\s", "");

    //calls static function enter_dimensions.
    enter_dimensions(add_variables);
}

//method function: asks the user to enter dimensions of each variable and passes it to 'method enter_MatriceValue'.
//`variables is add_variables from matrice finder function`.
//Smart function: detects if a variable is a null or identity matrice.
public static void enter_dimensions(String variables)
{
    Scanner sc =new Scanner(System.in);

    //length of variables
    int length= variables.length();

    //pre-initialisation of the user entered rows and columns of a matrice.
    int rows,columns;

    //loop function: to detect if a matrice constant is a null or identity matrice. If not it asks the user to enter dimensions of the constant.
    for(int fi=0;fi<length;fi++)
    {
        //stores a single character from variables to check later
        char ch=variables.charAt(fi);

        //detects null matrice
        if(ch=='o'||ch=='O')
        {
        System.out.println("Pls enter dimensions for the Null matrice\nEnter the number of rows");
        rows=sc.nextInt();
        System.out.println("Enter the number of columns");
        columns=sc.nextInt();

        int[][] o=new int[rows][columns];

        //loop function: to automatically enter values of null matrice.
        for (int row=0;row<rows;row++)
            {
        for(int column=0;column<columns;column++)
        {  
            o[row][column]=0;
        }
        System.out.print(" ");
            }
            //passes value to 'method store matrice' to store its value. 
            store_matrice(fi, o);
        }

        //detects identity matrice
        else if(ch=='i'||ch=='I')
        {
        System.out.println("Pls enter dimensions for the Identity matrice\nEnter the number of rows");
        rows=sc.nextInt();
        System.out.println("Enter the number of columns");
        columns=sc.nextInt();

        int[][] i=new int[rows][columns];

        //loop function: to automatically enter values of identity matrice.
        for (int row=0;row<rows;row++)
            {
        for(int column=0;column<columns;column++)
        {  
            if(row==column)
            {
                i[row][column]=1;
            }
            else
            {
                i[row][column]=0;
            }
            
        }
        System.out.print(" ");
            }
            //passes value to 'method store matrice' to store its value.
            store_matrice(fi, i);
        }

        //to allow user to enter dimensions of a matrice constant and to pass the info to 'method enter_MatriceValue'.
        else
        {
        System.out.println("Pls enter dimensions for variables "+ ch +"\nEnter the number of rows");
        rows=sc.nextInt();
        System.out.println("Enter the number of columns");
        columns=sc.nextInt();

        //it passes the value here.
        //fi is matrice_counter.
        enter_MatriceValue(rows, columns,fi);
        }
    }

}

//method function: to allow the user to enter values for a matrice constant. It then passes the value to be stored.
public static void  enter_MatriceValue(int rows, int columns,int matrice_counter)
{
    Scanner sc =new Scanner(System.in);

    //pre-initialisation of array which is passed on to store later.
    int[][] a=new int[rows][columns];

    //loop function: to enter values for a matrice taking a row constant at an instance and entering values at multiple columns of that row.
    for (int row=0;row<rows;row++)
    {
        for(int column=0;column<columns;column++)
        {  
            System.out.println("Enter value for row "+(row+1)+" column "+(column+1));
            a[row][column]=sc.nextInt();
        }
        System.out.print(" ");
    }
    //passes value to 'method store matrice' to store its value .
    store_matrice(matrice_counter, a);
}

//method function: to store value of the matrice constants so as to access it later.
public static void store_matrice(int matrice_counter, int[][] x)
{
    /* int[]
    if(matrice_counter==0)
    {
        int[][] a = x;
    }

    else if (matrice_counter==1)
    {
        int[][] b=x;
    }
    else if (matrice_counter==2)
    {
        int[][] c=x;
    }
    else if (matrice_counter==3)
    {
        int[][] d=x;
    }
    else if (matrice_counter==4)
    {
        int[][] e=x;
    }
    else if (matrice_counter==5)
    {
        int[][] f=x;
    }
    else if (matrice_counter==6)
    {
        int[][] g=x;
    }
    else if (matrice_counter==7)
    {
        int[][] h=x;
    }
    else if (matrice_counter==8)
    {
        int[][] i=x;
    }
    else if (matrice_counter==9)
    {
        int[][] j=x;
    }*/
}

/* static void prr(int a[][],b[][])
{
    System.out.println(Arrays.deepToString(a));
    System.out.println(Arrays.deepToString(b));
} */


}