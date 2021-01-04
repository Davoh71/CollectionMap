package adPortal;

public interface Comands {

    int EXIT =0;
    int LOGIN = 1;
    int REGISTER = 2;

    static void printComands(){
        System.out.println("Sexmek " +EXIT+ " Vor dus gak");
        System.out.println("Sexmek " +LOGIN+ " Vor mdneq");
        System.out.println("Sexmek "+REGISTER+ " Grancveq ");
    }

}
