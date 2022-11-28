public class Main {
    public static void main(String[] args) {

        //Задание 1

        String firstName = "Ivan";
        String middleName = " Ivanovich";
        String lastName = "Ivanov ";
        String separator = " ";
        String fullName  = String.join(separator,lastName,firstName,middleName);
        System.out.println("ФИО сотрудника — " + fullName  + ".");

        //Задание 2

        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());

         //Задание 3
        fullName = "Иванов Семён Семёнович";

        String[] names  = fullName.split(separator);
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            if (name.contains("ё")) {
                names[i] = name.substring(0, name.indexOf('ё')) + 'е' + name.substring(name.indexOf('ё') + 1);
            }
        }
        System.out.println ("Данные ФИО сотрудника — " + String.join(separator, names));
    }
}