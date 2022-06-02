public class SideEffects {
    public static void main(String[] args) {

//        int i = 0;
//
//        if (true || (++i < 100))
//            System.out.println("this string is not displayed");
//        System.out.println("if operator is executed case 1: " +i);
//
//        if (true | (++i < 100))
//            System.out.println("this string is not displayed");
//        System.out.println("if operator is executed case 2: " +i);

        int thisNumber = 0;

        if (true | false)System.out.println("printed");
        if (true | (++thisNumber >0))System.out.println("printed" + thisNumber);
        if (true || (++thisNumber >0))System.out.println("printed" + thisNumber);
        if (true || false)System.out.println("printed");
        if (true & false)System.out.println("not printed");
        if (true & (++thisNumber >0))System.out.println("printed!" +thisNumber);
        if (true && false)System.out.println("not printed");
        if (true && (++thisNumber >0))System.out.println("printed!" +thisNumber);
        if (true ^ false)System.out.println("printed");
        if (!true)System.out.println("not");
        if (!false)System.out.println("printed");

        if (false | true)System.out.println("yes");
        if (false | (++thisNumber >0))System.out.println("yes" +thisNumber);
        if (false || (++thisNumber >0))System.out.println("yes" +thisNumber);
        if (false || true)System.out.println("yes");
        if (false & true)System.out.println("not");
        if (false & (++thisNumber >0))System.out.println("not" +thisNumber);
        if (false && true)System.out.println("not");
        if (false && (++thisNumber >0))System.out.println("not" +thisNumber);
        if (false ^ true)System.out.println("yes");



    }
}
