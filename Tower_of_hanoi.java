// tower of hanoi recursion
package tower_of_hanoi;
import java.util.*;
public class Tower_of_hanoi {

void shift(int n, String first, String middle, String last){
    if(n == 1){
        System.out.println("Dsik moved from \t" + first + " -> " + last);
    }
    else{
      shift(n-1, first,last,middle);
      System.out.println("Disk moved from \t + first" + first + " -> " + last);
      shift(n-1,middle,first,last);
        }
    }

    public static void main(String[] args) {
        Tower_of_hanoi ob = new Tower_of_hanoi();
        System.out.println("Enter number of disks: ");
        Scanner sc = new Scanner(System.in);
        int nod = sc.nextInt();
        ob.shift(nod,"A","B","C");
        }
    
}
