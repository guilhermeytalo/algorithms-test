package com.guilhermeytalo.teste;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */

    public static String formatDate(String date, String separator) {
        String year = "";
        String month = "";
        if (separator == null) {
            year = date.substring(4);
            month = date.substring(2, 4);
        } else {
            String[] dateArray = date.split(separator);
            Integer yearPosition = 2;
            if (dateArray[0].length() == 4) {
                yearPosition = 0;
            }
            year = dateArray[yearPosition];
            month = dateArray[1];
        }

        return year + " " + month;
    }

    public static String multipleFormatDate(String date) {
        //ok input 01/05/2018
        if (date.contains("/")) {
            return formatDate(date, "/");
        }

        //ok input 2018 05 01 || 01 05 2018
        if (date.contains(" ")) {
            return formatDate(date, "\\s");
        }

        //ok input 01052018
        return formatDate(date, null);
    }

    public static String concatName(String[] name) {
        String result = "";
        for (int i = 0; i < name.length; i++) {
            result += name[i].trim();

            if (i < name.length - 1) {
                result += " ";
            }
        }
        return result;
    }

    public static int largestNumber(int[] array) {
        int largestNumber = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largestNumber) {
                largestNumber = array[i];
            }
        }
        return largestNumber;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        String dateResult = "20180501";
        String[] name = new String[] {"CARLOS","EDUARDO","DA","COSTA ","XAVIER"};
        int[] array = new int[] {334,568,123,796,225};

        System.out.println(multipleFormatDate(dateResult));
        System.out.println(concatName(name));
        System.out.println(largestNumber(array));
    }
}
