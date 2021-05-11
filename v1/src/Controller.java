import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        System.out.println("This the controller");
        DatabaseMock db = new DatabaseMock();

        while(true){
            System.out.println("You can request data from database(a counter) by pressing d");

            System.out.println("");
            Scanner sc = new Scanner(System.in);
            String inp = sc.next();
            if(inp.contains("d")){
                // call database thing and get the result

            }
        }

    }
}
