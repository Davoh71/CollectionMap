package adPortal;

import adPortal.model.AD;
import adPortal.model.Register;

import java.util.*;


import static adPortal.Interface.*;

public class AdPortalMain implements Comands {
    public static final Scanner scanner = new Scanner(System.in);
    private static Map<String, Register> userMap = new HashMap<>();
    private static List<String[]> posts = new LinkedList<String[]>();
    private static AD ad = new AD();
    private static Register register = new Register();

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            Comands.printComands();
            String comands = scanner.nextLine();
            int command;
            try {
                command = Integer.parseInt(comands);
            } catch (NumberFormatException e) {
                command = -1;
            }
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case LOGIN:
                    login();
                    break;
                case REGISTER:
                    registr();
                    break;
                default:
                    System.out.println("Wroong command");
            }
        }
    }

    private static void registr() {
        System.out.println("Grel: name, surname, gender, age, phoneNumber, password");
        String userDate = scanner.nextLine();
        String[] user = userDate.split(",");

        try {
            register.setName(user[0]);
            register.setSurname(user[1]);
            register.setGender(user[2]);
            register.setAge(user[3]);
            register.setPhoneNumber(user[4]);
            register.setPassword(user[5]);
            userMap.put(register.getPhoneNumber(), register);
            System.out.println("User added !");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Sxale");
        }
    }

    private static void login() {
        System.out.println(" Heraxosi hamaro pasvord ");
        try {
            String st = scanner.nextLine();
            System.out.println("Passvord");
            String password = scanner.nextLine();
            Register register = userMap.get(st);
            if (register.getPassword().equals(password)) {
                boolean isRun1 = true;
                while (isRun1) {
                    Interface.printcomaads();
                    String commands = scanner.nextLine();
                    int commamd;
                    try {
                        commamd = Integer.parseInt(commands);
                    } catch (NumberFormatException e) {
                        commamd = -1;
                    }
                    switch (commamd) {
                        case LOGOUT:
                            isRun1 = false;
                            break;
                        case ADD_NEW_AD:
                            addnewad();
                            break;
                        case PRINT_MY_ALL_ADS:
                            printmyallads();
                            break;
                        case PRINT_ALL_ADS:
                            prinrallads();
                            break;
                        case PRINT_AD_BY_CATEGORY:
                            printadbycategory();
                            break;
                        case DELETE_MY_ALL_ADS:
                            deletemyallads();
                            break;
                        case DELETE_AD_BY_TITLE:
                            deleteadbytitle();
                            break;
                        default:
                            System.out.println("Wroong command");
                    }
                }
            }

        } catch (NullPointerException e) {
            System.out.println("ponNamr kam password sxale");
        }
    }

    private static void addnewad() {
        System.out.println("Grel:  title,  text,  price,  categoty, author");
        String postDate = scanner.nextLine();
        String[] post = postDate.split(",");
        try {
            ad.setTitle(post[0]);
            ad.setText(post[1]);
            ad.setPrice(post[2]);
            ad.setCategoty(post[3]);
            ad.setAuthor(post[4]);
            ad.setDate(new Date());
            posts.add(post);
            System.out.println(" Post avelacvace ");
        } catch (IndexOutOfBoundsException e) {
            System.out.println(" Sxale ");
        }
    }

    private static void printmyallads() {
        System.out.println(" Im haytararutyunnero ");
        for (String[] ad : posts){
            System.out.println(posts[ad]);
        }
    }

    private static void prinrallads() {
        System.out.println(" Bolor haytararutyunnero ");
        //   for (AD ad : posts) {
        System.out.println();
        // }
    }

    private static void printadbycategory() {
        System.out.println("Tpel iranc categoryanerov");
        String cat = scanner.nextLine();
        if (ad.getCategoty().contains(cat)) ;
        //   System.out.println(posts.add());

    }

    private static void deletemyallads() {

    }

    private static void deleteadbytitle() {

    }
}
