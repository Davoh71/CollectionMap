package adPortal;

public interface Interface {
    int LOGOUT = 0;
    int ADD_NEW_AD = 1;
    int PRINT_MY_ALL_ADS = 2;
    int PRINT_ALL_ADS = 3;
    int PRINT_AD_BY_CATEGORY = 4;
    int DELETE_MY_ALL_ADS = 5;
    int DELETE_AD_BY_TITLE = 6;

    static void printcomaads() {
        System.out.println("Sexmek " + LOGOUT + " vor dus gak");
        System.out.println("Sexmek " + ADD_NEW_AD + " avelacnel nor haytararutyun");
        System.out.println("Sexmek " + PRINT_MY_ALL_ADS + " tpel bolor im haytararutyunnero");
        System.out.println("Sexmek " + PRINT_ALL_ADS + " tpel bolor haytararutyunnero");
        System.out.println("Sexmek " + PRINT_AD_BY_CATEGORY + " tpel haytararutyuno ira category");
        System.out.println("Sexmek " + DELETE_MY_ALL_ADS + " jnjel im bolor haytararutynnero ");
        System.out.println("Sexmek " + DELETE_AD_BY_TITLE + " jnjel vernagrov ");

    }
}
