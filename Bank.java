package bank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
interface menu {

    public void menu_1();

    public void menu_2();

    public void sub_menu_3();
}
class Blueprint implements menu {
    @Override
    public void menu_1() {
       
        System.out.println("\t\t*********************************");
        System.out.println("\t\t*  1.)Add new Entry             *");
        System.out.println("\t\t*  2.)Search existing entry     *");
        System.out.println("\t\t*  3.)Update existing entry     *");
        System.out.println("\t\t*  4.)Display all records       *");
        System.out.println("\t\t*  5.)Delete records            *");
        System.out.println("\t\t*  6.)Deposite money            *");
        System.out.println("\t\t*  7.)Withdraw money            *");
        System.out.println("\t\t*  8.)Exit                      *");
        System.out.println("\t\t*                               *");
        System.out.println("\t\t*  Enter your choice            *");
        System.out.println("\t\t*********************************");
    }
    @Override
    public void menu_2() {
        System.out.println("\t\t***************************************");
        System.out.println("\t\t* 1.)Deposite money to the account    *");
        System.out.println("\t\t* 2.)Withdraw money from the account  *");
        System.out.println("\t\t***************************************");
    }
    @Override
    public void sub_menu_3() {
        System.out.println("\t\t*********************************");
        System.out.println("\t\t*                               *");
        System.out.println("\t\t* 1.)Search by Account Number   *");
        System.out.println("\t\t* 2.)Search by Name             *");
        System.out.println("\t\t*                               *");
        System.out.println("\t\t*********************************");

    }

}
class Scanob {

    public byte Scanob() {
        Scanner sc = new Scanner(System.in);
        byte choice = sc.nextByte();
        return choice;
    }
}

public class Bank {

    public static void main(String[] args) {
        System.out.println("\t\t     *** BANKING SYSTEM ***");
        List<Info> list = new ArrayList<>();
        Blueprint blue = new Blueprint();
        Scanob src = new Scanob();
        Scanner sc = new Scanner(System.in);
        do {
            blue.menu_1();
            switch (src.Scanob()) {

                case 1:
                    System.out.println("**********************************");
                    System.out.println("* Enter the name of the customer *");
                    System.out.print("**********************************\n");
                    String name = sc.nextLine();
                    System.out.println("*****************************************");
                    System.out.println("* Enter the account no of the customer  *");
                    System.out.println("*****************************************");
                    int acc_no = sc.nextInt();
                    System.out.println("****************************");
                    System.out.println("* Enter current balance    *");
                    System.out.println("****************************");
                    double balance = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("*************************************");
                    System.out.println("* Enter the address of the customer *");
                    System.out.println("*************************************");
                    String address = sc.nextLine();
                    Info i = new Info(name, address, acc_no, balance);
                    list.add(i);
                    System.out.println("\t\t************************");
                    System.out.println("\t\t* press 1 to continue  *");
                    System.out.println("\t\t************************");
                    break; 
                case 2:
                    blue.sub_menu_3();
                    byte submenu = sc.nextByte();
            switch (submenu)
            {
                case 1:
                    System.out.println("************************************************");
                    System.out.println("* Enter the Account Number to initiate search  *");
                    System.out.println("************************************************");
                    int acc_search = sc.nextInt();
                    for(Info In: list)
                    {
                        if(In.acc_no1 == acc_search)
                        {
                            System.out.println("\t\t*********************************");
                            System.out.println("\t\t*  Name: " + In.name1 );
                            System.out.println("\t\t*  Account number: " + In.acc_no1 );
                            System.out.println("\t\t*  Address: " + In.address1 );
                            System.out.println("\t\t*  Balance: " + In.balance1 );
                            System.out.println("\t\t*********************************");
                        }     
                    }
                    break;
                case 2:
                    System.out.println("*************************************");
                    System.out.println("* Enter the Name to initiate search *");
                    System.out.println("*************************************");
                    sc.nextLine();
                    String acc_search_name = sc.nextLine();
                    for(Info In: list)
                    {
                        if (acc_search_name.equals(In.name1)) {
                            System.out.println("\t\t*********************************");
                            System.out.println("\t\t*  Name: " + In.name1   );
                            System.out.println("\t\t*  Account number: " + In.acc_no1 );
                            System.out.println("\t\t*  Address: " + In.address1  );
                            System.out.println("\t\t*  Balance: " + In.balance1 );
                            System.out.println("\t\t*********************************");
                        }
                        else
                        {
                            System.out.println("******************");
                            System.out.println("* No match found *");
                            System.out.println("******************");
                        }
                    }
                    break;
                default:
                    System.out.println("******************");
                    System.out.println("* Invalid Entry  *");
                    System.out.println("******************");   
                    break;
            }
                    System.out.println("\t\t************************");
                    System.out.println("\t\t* press 1 to continue  *");
                    System.out.println("\t\t************************");
                    break;
                case 3:
                    System.out.println("***********************************************");
                    System.out.println("* Enter the account no to update the records  *");
                    System.out.println("***********************************************");          
                    int acc_update = sc.nextInt();
                    for (Info In : list) {
                        if (In.acc_no1 == acc_update) {
                            System.out.println("\t\t*********************************");
                            System.out.println("\t\t*  Name: " + In.name1);
                            System.out.println("\t\t*  Account number: " + In.acc_no1);
                            System.out.println("\t\t*  Address: " + In.address1);
                            System.out.println("\t\t*  Balance: " + In.balance1);
                            System.out.println("\t\t*********************************");
                            System.out.println("\t\t*******************************************");
                            System.out.println("\t\t* Do you want to update this record:[y/n] *");
                            System.out.println("\t\t*******************************************");       
                            String del = sc.next();
                            if (del.toUpperCase().equals("Y")) {
                                System.out.print("Name: ");
                                 sc.nextLine();
                                String n_name = sc.nextLine();
                                System.out.print("Account No: ");
                                int n_acc = sc.nextInt();
                                sc.nextLine();
                                System.out.print("Address: ");
                                String n_add = sc.nextLine();
                                System.out.print("Balance: ");
                                double n_bal = sc.nextDouble();
                                sc.nextLine();
                                In.acc_no1 = n_acc;
                                In.name1 = n_name;
                                In.address1 = n_add;
                                In.balance1 = n_bal;
                                System.out.println("\t\t***************************");
                                System.out.println("\t\t* Record Updated          *");
                                System.out.println("\t\t* New Record              *");
                                System.out.println("\t\t***************************");

                                System.out.println("\t\t*********************************");
                                System.out.println("\t\t*  Name: " + In.name1);
                                System.out.println("\t\t*  Account number: " + In.acc_no1);
                                System.out.println("\t\t*  Address: " + In.address1);
                                System.out.println("\t\t*  Balance: " + In.balance1);
                                System.out.println("\t\t*********************************");
                         
                            break;
                            }
                            else if(del.toUpperCase().equals("N"))
                            {
                                System.out.println("\t\t*************************");
                                System.out.println("\t\t* Updation Aborted      *");
                                System.out.println("\t\t*************************");
                            }
                            else{
                                System.out.println("\t\t*************************");
                                System.out.println("\t\t No Records Found       *");
                                System.out.println("\t\t*************************");
                            }
                        }
                    }
                    System.out.println("\t\t************************");
                    System.out.println("\t\t* press 1 to continue  *");
                    System.out.println("\t\t************************");
                    break;
                case 4:
                    if(!list.isEmpty())
                    {
                    for (Info in : list) {
                        System.out.println("\t\t*********************************");
                        System.out.println("\t\t*  Name: " + in.name1          );
                        System.out.println("\t\t*  Account number: " + in.acc_no1);
                        System.out.println("\t\t*  Address: " + in.address1     );
                        System.out.println("\t\t*  Balance: " + in.balance1      );
                        System.out.println("\t\t*********************************");     
                    }
                    }
                    else
                    {
                        System.out.println("\t\t*************************");
                        System.out.println("\t\t* No Records Found      *");
                        System.out.println("\t\t*************************");
                    }
                    System.out.println("\t\t************************");
                    System.out.println("\t\t* press 1 to continue  *");
                    System.out.println("\t\t************************");
                    break;
                case 5:
                    System.out.println("\t\t**********************************************");
                    System.out.println("\t\t* Enter the account no to delete the records *");
                    System.out.println("\t\t**********************************************");     
                    int acc_del = sc.nextInt();
                    for (Info In : list) {
                        if (In.acc_no1 == acc_del) {
                            System.out.println("\t\t*********************************");
                            System.out.println("\t\t*  Name: " + In.name1);
                            System.out.println("\t\t*  Account number: " + In.acc_no1);
                            System.out.println("\t\t*  Address: " + In.address1);
                            System.out.println("\t\t*  Balance: " + In.balance1);
                            System.out.println("\t\t*********************************");
                            System.out.println("\t\t********************************************");
                            System.out.println("\t\t* Do you want to delete this record:[y/n]  *");
                            System.out.println("\t\t********************************************");
                            String del = sc.next();
                            if (del.toUpperCase().equals("Y")) {
                                list.remove(In);
                                System.out.println("\t\t***************************");
                                System.out.println("\t\t* Processing.....         *");
                                System.out.println("\t\t* RECORD DELETED !!!!     *");
                                System.out.println("\t\t***************************");
                                break;
                            }
                            else if(del.toUpperCase().equals("N"))
                            {
                                System.out.println("\t\t**********************");
                                System.out.println("\t\t* Invalid Value      *");
                                System.out.println("\t\t**********************");
                            }
                            else{
                                System.out.println("\t\t*************************");
                                System.out.println("\t\t* No Records Found      *");
                                System.out.println("\t\t*************************");
                            }
                        }
                    }
                    System.out.println("\t\t************************");
                    System.out.println("\t\t* press 1 to continue  *");
                    System.out.println("\t\t************************");
                    break;
                case 6:
                    System.out.println("\t\t************************************************");
                    System.out.println("\t\t* Enter the Account Number to deposite money   *");
                    System.out.println("\t\t************************************************");
                    int acc_depo = sc.nextInt();
                    for(Info In: list)
                    {
                        if(In.acc_no1 == acc_depo)
                        {
                            System.out.println("\t\t*********************************");
                            System.out.println("\t\t*  Name: " + In.name1 );
                            System.out.println("\t\t*  Account number: " + In.acc_no1 );
                            System.out.println("\t\t*  Address: " + In.address1 );
                            System.out.println("\t\t*  Balance: " + In.balance1 );
                            System.out.println("\t\t*********************************");
                            System.out.println("*********************************");
                            System.out.println("* Enter amount to be depopsited *");
                            System.out.println("*********************************");
                            double depo = sc.nextDouble();
                            In.balance1 = In.balance1 + depo ;
                            System.out.println("********************");
                            System.out.println("* Balance Updated  *");
                            System.out.println("********************");
                           
                        } 
                        else
                        {
                            System.out.println("\t\t*************************");
                            System.out.println("\t\t* No Records Found      *");
                            System.out.println("\t\t*************************");
                        }
                    }   
                    System.out.println("\t\t************************");
                    System.out.println("\t\t* press 1 to continue  *");
                    System.out.println("\t\t************************");
                    break;
                case 7:
                    System.out.println("\t\t************************************************");
                    System.out.println("\t\t* Enter the Account Number to withdraw money   *");
                    System.out.println("\t\t************************************************");
                    int acc_with = sc.nextInt();
                    for(Info In: list)
                    {
                        if(In.acc_no1 == acc_with)
                        {
                            System.out.println("\t\t*********************************");
                            System.out.println("\t\t*  Name: " + In.name1 );
                            System.out.println("\t\t*  Account number: " + In.acc_no1 );
                            System.out.println("\t\t*  Address: " + In.address1 );
                            System.out.println("\t\t*  Balance: " + In.balance1 );
                            System.out.println("\t\t*********************************");
                            System.out.println("*********************************");
                            System.out.println("* Enter amount to be withdrawal *");
                            System.out.println("*********************************");
                            double depo = sc.nextDouble();
                            In.balance1 = In.balance1 - depo ;
                            System.out.println("********************");
                            System.out.println("* Balance Updated  *");
                            System.out.println("********************");
                           
                        } 
                        else
                        {
                            System.out.println("\t\t*************************");
                            System.out.println("\t\t* No Records Found      *");
                            System.out.println("\t\t*************************");
                        }
                    }   
                    System.out.println("\t\t************************");
                    System.out.println("\t\t* press 1 to continue  *");
                    System.out.println("\t\t************************");
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("\t\t**********************");
                    System.out.println("\t\t* Invalid Value      *");
                    System.out.println("\t\t**********************");
                    break;
            }
        } while (src.Scanob() < 7);
    }
}
class Info {

    protected String name1, address1;
    protected int acc_no1;
    protected double balance1;

    public Info(String name, String address, int acc_no, double balance) {
        this.acc_no1 = acc_no;
        this.address1 = address;
        this.name1 = name;
        this.balance1 = balance;
    }
}
